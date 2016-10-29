package com.aut.generator.provider.db.procedure.model;

import java.util.LinkedHashSet;

public class ProcedureParameter implements java.io.Serializable{
	private static final long serialVersionUID = 7645829463583539070L;
	
	private Procedure procedure;//Reference to the containing table
	
	private String parameterName;//参数名称
	private String parameterJavaName;//参数在model中的的名字(驼峰规则,如p_atest_sid 生成为patestSid)
	
	/**
	 * 参数种类(procedureColumnUnknown = 0,procedureColumnIn = 1,procedureColumnInOut = 2,
	 * procedureColumnResult = 3,procedureColumnOut = 4,procedureColumnReturn = 5)
	 */
	private int parameterType;//参数种类
	
	
	private String parameterTypeName;//参数种类对应的名称(IN ,OUT )		
	
	private int sqlDataType;//来自 java.sql.Types 的 SQL 类型 (如:NUMBER:3,VARCHAR2:12,REF CURSOR:1111)
	
	private String sqlTypeName; //SQL类型名称
	
	private String jdbcTypeName;//与sql类型对应的jdbc类型名称
	
	private String javaTypeName;//与sql类型对应的java类型名称
	
	private String parameterKind;//参数的种类(NORMAL:普通,ARRAY:自定义数组,CURSOR:游标)
	
	//自定义对象参数
	private LinkedHashSet<CustomObjectParameter> parameters = new LinkedHashSet<CustomObjectParameter>();
	
	public ProcedureParameter(){
		
	}
	
	public ProcedureParameter(Procedure procedure,String parameterName,String parameterJavaName,
			int parameterType,String parameterTypeName,int sqlDataType,String sqlTypeName,String javaTypeName){
		this.procedure = procedure;
		this.parameterName = parameterName;
		this.parameterJavaName = parameterJavaName;
		this.parameterType = parameterType;
		this.parameterTypeName = parameterTypeName;
		this.sqlDataType = sqlDataType;
		this.sqlTypeName = sqlTypeName;
		this.javaTypeName = javaTypeName;
	}
	
		
	public LinkedHashSet<CustomObjectParameter> getParameters() {
		return parameters;
	}

	public void setParameters(LinkedHashSet<CustomObjectParameter> parameters) {
		this.parameters = parameters;
	}

	public Procedure getProcedure() {
		return this.procedure;
	}

	public void setProcedure(Procedure procedure) {
		this.procedure = procedure;
	}


	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public String getParameterJavaName() {
		return parameterJavaName;
	}

	public void setParameterJavaName(String parameterJavaName) {
		this.parameterJavaName = parameterJavaName;
	}

	public int getParameterType() {
		return parameterType;
	}

	public void setParameterType(int parameterType) {
		this.parameterType = parameterType;
	}

	public String getParameterTypeName() {
		return parameterTypeName;
	}

	public void setParameterTypeName(String parameterTypeName) {
		this.parameterTypeName = parameterTypeName;
	}

	public int getSqlDataType() {
		return sqlDataType;
	}

	public void setSqlDataType(int sqlDataType) {
		this.sqlDataType = sqlDataType;
	}

	public String getSqlTypeName() {
		return sqlTypeName;
	}

	public void setSqlTypeName(String sqlTypeName) {
		this.sqlTypeName = sqlTypeName;
	}

	public String getJavaTypeName() {
		return javaTypeName;
	}

	public void setJavaTypeName(String javaTypeName) {
		this.javaTypeName = javaTypeName;
	}

	public String getJdbcTypeName() {
		return jdbcTypeName;
	}

	public void setJdbcTypeName(String jdbcTypeName) {
		this.jdbcTypeName = jdbcTypeName;
	}

	public String getParameterKind() {
		return parameterKind;
	}

	public void setParameterKind(String parameterKind) {
		this.parameterKind = parameterKind;
	}
	
	

}
