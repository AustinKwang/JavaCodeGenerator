package com.aut.generator.provider.db.procedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;

import com.aut.generator.GeneratorProperties;
import com.aut.generator.provider.db.DataSourceProvider;
import com.aut.generator.provider.db.procedure.model.CustomObjectParameter;
import com.aut.generator.provider.db.procedure.model.Procedure;
import com.aut.generator.provider.db.procedure.model.ProcedureParameter;
import com.aut.generator.provider.db.table.TableFactory.DatabaseMetaDataUtils;
import com.aut.generator.provider.db.table.TableFactory.NotFoundTableException;
import com.aut.generator.util.StringHelper;
import com.aut.generator.util.enums.ProcedureParameterKind;
import com.aut.generator.util.typemapping.OracleDataTypeForJdbcAndJava;



/**
 * 
 * 根据数据库存储过程的元数据(metadata)创建Procedure对象
 * 
 * @modify diyvan
 */
public class ProcedureFactory {
	private DbHelper dbHelper = new DbHelper();
	private static ProcedureFactory instance = null;//单例模式
	
	private ProcedureFactory() {
	}
	
	public synchronized static ProcedureFactory getInstance() {
		if(instance == null) instance = new ProcedureFactory();
		return instance;
	}
	
	/**
	 * 获取generator.xml 中的jdbc.catalog对应的属性
	 * @return
	 */
	public String getCatalog() {
		return GeneratorProperties.getNullIfBlank("jdbc.catalog");
	}

	/**
	 * 获取generator.xml 中的jdbc.schema对应的属性，oracle需要schema
	 * @return
	 */
	public String getSchema() {
		return GeneratorProperties.getNullIfBlank("jdbc.schema").toUpperCase();
	}

	/**
	 * 获取jdbc的Connection
	 * @return
	 */
	private Connection getConnection() {
		return DataSourceProvider.getConnection();
	}
	
	/**
	 * 根据存储过程名生成Procedure对象
	 * @param procedureName
	 * @return
	 * @throws SQLException 
	 */
	public Procedure getProcedure(String procedureName) throws SQLException{
		return getProcedure(getCatalog(),getSchema(),procedureName);
	}
	
	/**
	 * 根据catalog,schema,procedureName生成Procedure对象
	 * @param catalog
	 * @param schema
	 * @param procedureName
	 * @return
	 * @throws SQLException 
	 */
	public Procedure getProcedure(String catalog,String schema,String procedureName) throws SQLException{
		Procedure p = null;
		//存储过程大小写处理
		
		try{
			p = _getProcedure(catalog,schema,procedureName);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		if(p==null){
			throw new NotFoundTableException("not found procedure with give procedureName:"+procedureName);
		}
		return p;
	}
	
	/**
	 * 根据package包生成Procedure对象
	 * @param catalog
	 * @param schema
	 * @param procedureName
	 * @return
	 * @throws SQLException 
	 * @throws RecognitionException 
	 */
	public Procedure _getProcedure(String catalog,String schema,String procedureName) throws SQLException, RecognitionException{
		if(procedureName== null || procedureName.trim().length() == 0) 
	         throw new IllegalArgumentException("procedureName must be not empty");
		if(procedureName.indexOf(".")<0)
			 throw new IllegalArgumentException("procedureName input error,must package.procedureName");
		catalog = StringHelper.defaultIfEmpty(catalog, null);
		schema = StringHelper.defaultIfEmpty(schema, null);
		//分离包名和存储过程名
		int len = procedureName.indexOf(".");
		String packageName = procedureName.substring(0, len);//包名
		String upPackageName = packageName.toUpperCase();//大写包名		
		String newProName = procedureName.substring(len+1);//过程名
		String lowProName = newProName.toLowerCase();//小写过程名
		
		/**
		 * 根据存储过程包名,把存储过程写入String中
		 */
		String packageContent = getPackageContent(upPackageName);
		/**
		 * 通过语法分析存储过程包中内容,获取输入输出参数名及参数类型
		 */
		List procedureList = genProcedureParameters(packageContent);
		//创建Procedure对象
		Procedure procedure =createProcedure(upPackageName,lowProName,procedureList);
		
		/*
		*没有使用jdbc的方式获取存储过程参数及类型
		//建立数据库连接
		Connection conn = getConnection();
		//DatabaseMetaData类中提供了许多方法用于获得数据源的各种信息，通过这些方法可以非常详细的了解数据库的信息
		DatabaseMetaData dbMetaData = conn.getMetaData();
		// 获取给定类别的存储过程参数和结果列的描述。
		ResultSet rs = dbMetaData.getProcedureColumns(pn[0], schema, pn[1], null);
		//获取存储过程参数个数
		int parameterNumber = 0;
		while(rs.next()){
			parameterNumber++;
		}
		//根据存储过程参数相关属性，生成ProcedureParameter对象
		//retriveProcedureParameters(procedure,rs);		
		//获取返回集合cursor中的信息
		*/
		
		return procedure;
	}
	
	/**
	 * 根据存储过程包名,把存储过程包中内容写入String中
	 * @param upPackageName
	 * @return
	 * @throws SQLException 
	 */
	public String getPackageContent(String upPackageName) throws SQLException{
		StringBuffer sb = new StringBuffer();
		sb.append("create or replace ");
		String sql = "SELECT lower(text) as text FROM user_source WHERE name = '"+upPackageName+"' and type = 'PACKAGE'";
		Statement s = getConnection().createStatement();
		ResultSet rs = s.executeQuery(sql);		
		while(rs.next()){
			sb.append(rs.getString("text"));  
		}
		return sb.toString();
	}
	
	
	/**
	 * 通过语法分析存储过程包中内容,获取输入输出参数名及参数类型
	 * @param packageContent
	 * @return
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("all")
	public List genProcedureParameters(String packageContent) throws RecognitionException{
		//构造一个CharStream
		CharStream cs =new ANTLRStringStream(packageContent);
		PLSQL2Lexer lexer = new PLSQL2Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		PLSQL2Parser parser = new PLSQL2Parser(tokens);
		Parser parser2 = parser;
		antlr.TreeParser a ;		
		RuleReturnScope result = parser.sqlplus_file();
		CommonTree tree = (CommonTree) result.getTree();
		//对存储过程解析
		List procedureList = parser.getProcedureList();
		//对函数解写
		//List funct ionList = parser.getFunctionList();

		return procedureList;
	}
	
	
	/**
	 * 构造Procedure对象
	 * @param upPackageName 大写包名
	 * @param lowProName    小写存储过程名
	 * @param procedureList package包解析结果
	 * @return
	 * @throws SQLException 
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("all")
	public Procedure createProcedure(String upPackageName,String lowProName,List procedureList) throws SQLException, RecognitionException{
		if(procedureList==null ||procedureList.size()==0) 
			throw new RuntimeException("package 解析无结果！");
		/**
		 * 根据过程名获取该存储过程解析后的参数
		 */
		Map map = new HashMap();
		for(int i=0;i<procedureList.size();i++){
			Map rtMap = (Map)procedureList.get(i);
			String proname = (String)rtMap.get("id");
			if(proname.equals(lowProName)){
				map.putAll(rtMap);
				break;
			}			
		}
		
		if(map==null ||map.size()==0)
			throw new RuntimeException(upPackageName+"中不存在存储过程："+lowProName);
		
		//实例化Procedure对象
		Procedure procedure = new Procedure();
		procedure.setPackageName(upPackageName);//设置包名
		procedure.setProcedureName(lowProName);//设置存储过程名
		List paramList = (List)map.get("paramList");//参数列表
		procedure.setParameterNumber(paramList.size());//设置存储过程参数个数
		//设置java中的类名，驼峰规则首字母大写
		String className = StringHelper.convertToClassName(lowProName);
		procedure.setClassName(className);
		//设置存储过程种类
		procedure.setProcedureKind("NORMAL");
		
		//把存储过程参数信息写入ProcedureParameter对象中，并把ProcedureParameter对象放入Procedure对象的LinkedHashSet<ProcedureParameter>集合中
		retriveProcedureParameters(procedure,paramList);
		
		return procedure;
	}
	
	
	/**
	 * 根据存储过程参数相关属性，生成ProcedureParameter对象
	 * @param procedure
	 * @param paramList
	 * @return void
	 * @throws SQLException
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("all")
	public void retriveProcedureParameters(Procedure procedure,List paramList)throws SQLException, RecognitionException{
		
		ProcedureParameter procedureParameter;
		LinkedHashSet<ProcedureParameter> parameters=new LinkedHashSet<ProcedureParameter>();
		String parameterName;
		String parameterType;
		String dataType;
		for(int i=0;i<paramList.size();i++){
			Map map = (Map)paramList.get(i);
			parameterName = (String)map.get("id");//参数名
			parameterType = (String)map.get("paramType");//参数类型(IN OR OUT)
			dataType = (String)map.get("dataType");//参数数据类型
			procedureParameter = new ProcedureParameter();
			procedureParameter.setParameterName(parameterName);
			procedureParameter.setParameterTypeName(parameterType.toUpperCase());	
			//参数在model中的的名字(驼峰规则,如p_atest_sid 生成为patestSid)
			procedureParameter.setParameterJavaName(StringHelper.convertToParameterJavaName(parameterName));
			
			//参数数据类型处理，因为atest_student.sid%type类型需转换成真正的基本类型
			dataType = retrieveBaseDataType(dataType).toLowerCase();			
			procedureParameter.setSqlTypeName(dataType);
			//设置其他ProcedureParameter属性
			initOtherParameterProperties(procedureParameter,dataType);			
			parameters.add(procedureParameter);
		}
		procedure.setParameters(parameters);				
		
	}
	
	/**
	 * 获取基本的数据类型
	 * @param dataType
	 * @return
	 * @throws SQLException 
	 */
	public String retrieveBaseDataType(String dataType) throws SQLException{
		if(dataType.indexOf("%type")>0){
			String tableName = dataType.substring(0, dataType.indexOf(".")).toUpperCase();
			String columnName = dataType.replace("%type", "").substring(dataType.indexOf(".")+1).toUpperCase();		
			//根据表和列得到该列的数据类型
			return getTableColumnDataType(tableName,columnName);
		}else{
			return dataType;
		}		
	}
	
	
	/**
	 * 根据表和列得到该列的数据类型
	 * @param tableName
	 * @param columnName
	 * @return
	 * @throws SQLException
	 */
	public String getTableColumnDataType(String tableName,String columnName) throws SQLException{
		String sql = "select data_type from all_tab_columns  WHERE table_name = '"+tableName+"' and column_name = '"+columnName+"'";
		return dbHelper.queryForString(sql);
	}
	
	
	/**
	 * 根据参数的数据类型设置其jdbc类型名称,java类型名称,参数的种类
	 * @param dataType
	 * @throws SQLException 
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("all")
	private void initOtherParameterProperties(ProcedureParameter procedureParameter,String dataType) throws SQLException, RecognitionException{
	    /**
	     * 判断第一次解析出来的数据类型是否是oracle的基本类型，
	     * 如果不是，需要进行第二次解析，解析出来数组，然后再进行第三次解析，解析出自定义对象中的基本类型，
	     * 这里需要注意的是，代码生成器暂时只考虑自定义对象数组(也就是第一次解析出来的
	     * 要么是基本类型，要么就是自定义数组，不能直接是对象)
	     */
		if(OracleDataTypeForJdbcAndJava.isBaseDataType(dataType)){
			String jdbcType = OracleDataTypeForJdbcAndJava.getPreferredJdbcType(dataType);//jdbc类型
			String javaType = OracleDataTypeForJdbcAndJava.getPreferredJavaType(dataType);//java类型
			//String parameterKind = OracleDataTypeForJdbcAndJava.getPreferredParameterKind(dataType);//参数种类
			procedureParameter.setJdbcTypeName(jdbcType);
			procedureParameter.setJavaTypeName(javaType);
			procedureParameter.setParameterKind(ProcedureParameterKind.NORMAL.getId());//参数种类为基本数据类型
		}else{
			//进行第二次解析
			String arrayTypeContent = getTypeContent(dataType.toUpperCase());//组装解析内容
			List arrayTypeList = genTypeParameters(arrayTypeContent);//解析
			Map arrayMap = (Map)arrayTypeList.get(0);
			String typeName = (String)arrayMap.get("type"); 
			Map typeMap = (Map)arrayMap.get("collectionType"); 
			String customDataType = (String)typeMap.get("dataType");//自定义对象类型
			if(!"collection".equals(typeName))
				throw new RuntimeException("目前package代码生成只支持基本类型和自定义对象数组 ！" );
			//进行第三次解析
			String objectTypeContent = getTypeContent(customDataType);//组织解析内容
			List objectTypeList = genTypeParameters(objectTypeContent);//解析
			Map objectMap = (Map)objectTypeList.get(0);
			String objectType = (String)objectMap.get("type");
			if(!"object".equals(objectType))
				throw new RuntimeException("目前package代码器不支持多层数组嵌套！");
			
			//根据获取到的值设置对应的java类型(ProcedureParameter,CustomObjectParameter)
			initCustomTypeParameter(procedureParameter,objectMap); 	
		}
		
	}
	
	/**
	 * 把解析出来的自定义对象数组 对应到 存储过程参数类上，为Freemark模板准备数据
	 * @param procedureParameter 存储过程参数类
	 * @param objectTypeMap       解析出来自定义对象的属性
	 */
	@SuppressWarnings("all")
	public void initCustomTypeParameter(ProcedureParameter procedureParameter,Map objectMap){
		procedureParameter.setJdbcTypeName("ARRAY");//jdbc类型
		procedureParameter.setJavaTypeName("java.util.List");//java类型
		procedureParameter.setParameterKind(ProcedureParameterKind.ARRAY.getId());//参数种类为自定义数组类型
		CustomObjectParameter customObjectParameter;
		LinkedHashSet<CustomObjectParameter> parameters=new LinkedHashSet<CustomObjectParameter>();
		List parameterList = (List)objectMap.get("fieldList");//参数List
		String customObjectTypeName  = (String) objectMap.get("id");//oracle自定义对象名称
		String className = StringHelper.convertToClassName(customObjectTypeName);//java中的类名
		String parameterName; //参数名称
		String dataType;     //参数数据类型
		Map paraMap;
		for(int i = 0;i<parameterList.size();i++){
			paraMap =(Map)parameterList.get(i);
			parameterName = (String)paraMap.get("id");
			dataType = (String)paraMap.get("dataType");
			//因为得到的数据类型是number(16) 之类，需要转换成number
			dataType = StringHelper.convertToRuleDataType(dataType);
			customObjectParameter = new CustomObjectParameter();
			customObjectParameter.setObjectName(customObjectTypeName);
			String jdbcType = OracleDataTypeForJdbcAndJava.getPreferredJdbcType(dataType);//jdbc类型
			String javaType = OracleDataTypeForJdbcAndJava.getPreferredJavaType(dataType);//java类型
			customObjectParameter.setJdbcTypeName(jdbcType);
			customObjectParameter.setJavaTypeName(javaType);
			customObjectParameter.setObjectClass(className);
			parameters.add(customObjectParameter);			
		}
		procedureParameter.setParameters(parameters);
		
		
	}
	
	
	
	/**
	 * 根据自定义类型名称获取自定义类型的定义，以便解析
	 * @param upTypeName
	 * @return
	 * @throws SQLException
	 */
	public String getTypeContent(String upTypeName) throws SQLException{
		StringBuffer sb = new StringBuffer();
		sb.append("create or replace ");
		String sql = "SELECT lower(text) as text FROM user_source WHERE name = '"+upTypeName+"' and type = 'TYPE'";
		Statement s = getConnection().createStatement();
		ResultSet rs = s.executeQuery(sql);		
		while(rs.next()){
			sb.append(rs.getString("text"));  
		}
		return sb.toString();
	}
	
	
	/**
	 * 通过语法分析自定义类型中内容,获取自定义类型参数
	 * @param typeContent
	 * @return
	 * @throws RecognitionException 
	 */
	@SuppressWarnings("all")
	public List genTypeParameters(String typeContent) throws RecognitionException{
		//构造一个CharStream
		CharStream cs =new ANTLRStringStream(typeContent);
		PLSQL2Lexer lexer = new PLSQL2Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		PLSQL2Parser parser = new PLSQL2Parser(tokens);
		Parser parser2 = parser;
		antlr.TreeParser a ;		
		RuleReturnScope result = parser.sqlplus_file();
		CommonTree tree = (CommonTree) result.getTree();
		//对自定义类型解析
		List typeList = parser.getTypeList();
		return typeList;
	}
	
	
	/**
	 * 把返回集合中的信息放入ResultProperty对象中
	 * @param conn
	 * @param procedure
	 * @param paramterCount
	 * @throws SQLException
	 */
	private void retriveCursorColumns(Connection conn,Procedure procedure,int paramterCount)throws SQLException{
		//构造存储过程语句
		StringBuffer psql = new StringBuffer();
		psql.append("{call ");
		psql.append(procedure.getPackageName()+"."+procedure.getProcedureName());
		psql.append("(");
		for(int i=0;i<paramterCount;i++){
			psql.append("?");
			if(i<(paramterCount-1)){
				psql.append(",");
			}
		}
		//调用存储过程
		CallableStatement cstmt = conn.prepareCall(psql.toString());
	}
	
	/**
	 * 获取数据源元数据
	 * @return
	 * @throws SQLException
	 */
	private DatabaseMetaData getMetaData() throws SQLException {
		return getConnection().getMetaData();
	}
	
	
	/**
	 * 数据库操作方法
	 * @author Administrator
	 *
	 */
	class DbHelper {
		public void close(ResultSet rs,PreparedStatement ps,Statement... statements) {
			try {
				if(ps != null) ps.close();
				if(rs != null) rs.close();
				for(Statement s : statements) {s.close();}
			}catch(Exception e){
			}
		}
		public boolean isOracleDataBase() {
			try {
				return DatabaseMetaDataUtils.isOracleDataBase(getMetaData());
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		public String queryForString(String sql) {
			Statement s = null;
			ResultSet rs = null;
			try {
				s =  getConnection().createStatement();
				rs = s.executeQuery(sql);
				if(rs.next()) {
					return rs.getString(1);
				}
				return null;
			}catch(SQLException e) {
				e.printStackTrace();
				return null;
			}finally {
				close(rs,null,s);
			}
		}		
	}
	
	
}
