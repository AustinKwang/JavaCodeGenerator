package com.aut.generator.provider.db.procedure;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;

import com.aut.generator.provider.db.DataSourceProvider;

import com.aut.generator.provider.db.DataSourceProvider;
import com.aut.generator.provider.db.table.model.Table;

public class ProcedureTest {

	/**
	 * 解析自定义类型
	 * @param conn
	 * @return
	 * @throws SQLException 
	 * @throws RecognitionException 
	 */
	public static List parserSelfList(Connection conn) throws SQLException, RecognitionException{
		String sql = " select lower(text) as text from user_source where type = 'TYPE' and name = 'REC_CLASS' ";
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		StringBuffer sb = new StringBuffer();
		sb.append("create or replace ");
		while(rs.next()){
			sb.append(rs.getString("text"));  
		}
		CharStream cs =new ANTLRStringStream(sb.toString());
		PLSQL2Lexer lexer = new PLSQL2Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		PLSQL2Parser parser = new PLSQL2Parser(tokens);
		Parser parser2 = parser;
		antlr.TreeParser a ;
		@SuppressWarnings("all")
		RuleReturnScope result = parser.sqlplus_file();
		CommonTree tree = (CommonTree) result.getTree();
		List typeList = parser.getTypeList();
		System.out.println(typeList);
		return typeList;
	}
	
	
	
	/**
	 * @param args
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws Exception {
		// 获取数据库的连接
		Connection conn = DataSourceProvider.getConnection();
		String sql = "SELECT lower(text) as text FROM user_source WHERE name = 'TEST_PROCEDURE_STUDENT' and type = 'PACKAGE' ";
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery(sql);
		StringBuffer sb = new StringBuffer();
		sb.append("create or replace ");
		while(rs.next()){
			sb.append(rs.getString("text"));  
		}
 
		CharStream cs =new ANTLRStringStream(sb.toString());
		
		System.out.println("第一次解析");
		PLSQL2Lexer lexer = new PLSQL2Lexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		PLSQL2Parser parser = new PLSQL2Parser(tokens);
		Parser parser2 = parser;
		antlr.TreeParser a ;
		@SuppressWarnings("all")
		RuleReturnScope result = parser.sqlplus_file();
		CommonTree tree = (CommonTree) result.getTree();
		List procedureList = parser.getProcedureList();
		System.out.println(procedureList);
		
		System.out.println("第二次解析");
		parserSelfList(conn);
		
		
		//测试
		/*String test = "ATEST_STUDENT_AUTO.del_atest_student";
		int len = test.indexOf(".");
		System.out.println(len);
		System.out.println(test.substring(0, len));
		System.out.println(test.substring(len+1));*/
		//System.out.println(pn[0]);
		
	
		//List functionList = parser.getFunctionList();
		//System.out.println(functionList);
		
		
		//String file = "D:\\ddd.txt";
		//CharStream cs = new ANTLRFileStream(file);
		
		//CharStream cs = new ANTLRReaderStream(bai);
		//output.close();
		
		/*DatabaseMetaData dbMetaData = conn.getMetaData();
		ResultSet schemaRs =dbMetaData.getSchemas();
		while(schemaRs.next()){
			System.out.println(schemaRs.getString("TABLE_SCHEM"));
		}
		//CLIENT_ACCOUNT
		ResultSet rs = dbMetaData.getTables("", "%", "branch_info", null);
		while(rs.next()) {
			//数据库中表对应到生成代码的Table对象
			System.out.println("找到了表");
			System.out.println(rs.getString("TABLE_SCHEM"));
		}*/
		/*Statement sm = conn.createStatement();
		String sql = "select cid,cname from atest_class";
		ResultSet rs = sm.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getLong("cid"));
			System.out.println(rs.getString("cname"));
		}*/
//		System.out.println("开始");
		
		//存储过程相关信息
		/*DatabaseMetaData dm = conn.getMetaData();
		ResultSet rs = dm.getProcedureColumns("ATEST_STUDENT_P", "LIFEMAN", "GET_ATEST_STUDENT", null);
		System.out.println(rs.toString());
		int i=0;
		while(rs.next()){
			i++;
		}
		System.out.println("参数个数:"+i);//参数个数
		while(rs.next()){
			//procedureColumnUnknown = 0
			//procedureColumnIn = 1;
			//procedureColumnInOut = 2;
			//procedureColumnOut = 4;
			//procedureColumnReturn = 5;
			//procedureColumnResult = 3;
			System.out.println("PROCEDURE_CAT: " +rs.getString( "PROCEDURE_CAT"));
			System.out.println("PROCEDURE_SCHEM: " +rs.getString( "PROCEDURE_SCHEM"));
			System.out.println("PROCEDURE_NAME: " +rs.getString( "PROCEDURE_NAME"));
			System.out.println("COLUMN_NAME: "+rs.getString("COLUMN_NAME"));
			System.out.println("COLUMN_TYPE: "+ rs.getShort( "COLUMN_TYPE"));
			System.out.println("DATA_TYPE: "+ rs.getString( "DATA_TYPE"));
			System.out.println("TYPE_NAME: "+ rs.getString( "TYPE_NAME"));
			System.out.println("NULLABLE: " +rs.getString( "NULLABLE"));
			System.out.println("REMARKS: "+rs.getString( "REMARKS"));
			System.out.println("-------------");
		}*/
		
		/*ResultSetMetaData rsm = rs.getMetaData();
		System.out.println(rsm.getColumnName(2));
		System.out.println(rsm.getColumnTypeName(2));*/
		
	/*	int count = rs.getMetaData().getColumnCount();
		for(int i=0;i<count;i++){
			System.out.println(rs.getMetaData().getColumnName(i+1));
		}*/
		
		
		//返回结果集的相关信息
	/*	String psql = "{call ATEST_STUDENT_P.GET_ATEST_STUDENT(?,?,?)}";
		CallableStatement cstmt = conn.prepareCall(psql);
		cstmt.setLong(1, 1);
		cstmt.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
		cstmt.registerOutParameter(3, oracle.jdbc.OracleTypes.CURSOR);
		cstmt.execute();
//		System.out.println(cstmt.getObject(2).toString()); 
		ResultSet rs = (ResultSet)cstmt.getObject(3);
		ResultSetMetaData rsm = rs.getMetaData();
		System.out.println(rsm.getColumnName(1)); 
		System.out.println(rsm.getColumnTypeName(1)); 
		while(rs.next()){
			System.out.println(rsm.getColumnName(1)); 
			System.out.println(rsm.getColumnTypeName(1)); 
			System.out.println(rs.getString("sname")); 
		}*/
		

	}

}
