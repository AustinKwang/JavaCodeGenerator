package com.aut.generator.provider.db.procedure.model;

public class CustomObjectParameter implements java.io.Serializable{
	private static final long serialVersionUID = 7645829463583539071L;
	
	private ProcedureParameter procedureParameter;//Reference to the containing Parameter
	private String objectName;  //自定义对象名称 大写
	private String objectNameLower;//自定义对象名称 小写
	private String objectClass;  //在java DTO中的名字
	
	private String customListName; //自定义数组名称 大写
	private String cunstomListNameLower;//自定义对象数组名称小写
	private String sqlTypeName; //SQL类型名称
	private String jdbcTypeName;//与sql类型对应的jdbc类型名称
	private String javaTypeName;//与sql类型对应的java类型名称
	
	public CustomObjectParameter(){
		
	}
	
	
	
	public String getObjectClass() {
		return objectClass;
	}

	public void setObjectClass(String objectClass) {
		this.objectClass = objectClass;
	}

	public ProcedureParameter getProcedureParameter() {
		return procedureParameter;
	}

	public void setProcedureParameter(ProcedureParameter procedureParameter) {
		this.procedureParameter = procedureParameter;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getObjectNameLower() {
		return objectNameLower;
	}

	public void setObjectNameLower(String objectNameLower) {
		this.objectNameLower = objectNameLower;
	}

	public String getCustomListName() {
		return customListName;
	}

	public void setCustomListName(String customListName) {
		this.customListName = customListName;
	}

	public String getCunstomListNameLower() {
		return cunstomListNameLower;
	}

	public void setCunstomListNameLower(String cunstomListNameLower) {
		this.cunstomListNameLower = cunstomListNameLower;
	}

	public String getSqlTypeName() {
		return sqlTypeName;
	}

	public void setSqlTypeName(String sqlTypeName) {
		this.sqlTypeName = sqlTypeName;
	}

	public String getJdbcTypeName() {
		return jdbcTypeName;
	}

	public void setJdbcTypeName(String jdbcTypeName) {
		this.jdbcTypeName = jdbcTypeName;
	}

	public String getJavaTypeName() {
		return javaTypeName;
	}

	public void setJavaTypeName(String javaTypeName) {
		this.javaTypeName = javaTypeName;
	}
	
	
}
