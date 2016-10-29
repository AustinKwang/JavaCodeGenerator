package com.aut.generator.provider.db.procedure.model;

import java.util.LinkedHashSet;

public class Procedure implements java.io.Serializable {
	private static final long serialVersionUID = 6363021201582602022L;
	
	//存储过程包名
	private String packageName;
	//存储过程名称
	private String procedureName;
	//存储过程参数个数
	private int parameterNumber;
	
	//类名
	private String className;
	
	//存储过程种类(NORMAL:普通参数,INARRAY:入参自定义数组,OUTARRAY:出参自定义数组,INOUTARRAY:入参出参自定义数组,OUTCURSOR:出参游标)
	private String procedureKind;
	
	//参数集合
	private LinkedHashSet<ProcedureParameter> parameters = new LinkedHashSet<ProcedureParameter>();
	//调用存储过程返回结果集相关属性
	private LinkedHashSet<ResultProperty> resultPropertys = new LinkedHashSet<ResultProperty>();
	
	public Procedure(){
		
	}
	
	public Procedure(Procedure p){
		this.packageName = p.getPackageName();
		this.procedureName = p.getProcedureName();
		this.parameters = p.getParameters();
		this.resultPropertys = p.getResultPropertys();
	}
	
	
	public int getParameterNumber() {
		return parameterNumber;
	}

	public void setParameterNumber(int parameterNumber) {
		this.parameterNumber = parameterNumber;
	}
	
	/**
	 * 添加参数
	 * @param procedureParameter
	 */
	public void addParameters(ProcedureParameter procedureParameter){
		parameters.add(procedureParameter);
	}

	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getProcedureName() {
		return procedureName;
	}
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public LinkedHashSet<ProcedureParameter> getParameters() {
		return parameters;
	}

	public void setParameters(LinkedHashSet<ProcedureParameter> parameters) {
		this.parameters = parameters;
	}

	public LinkedHashSet<ResultProperty> getResultPropertys() {
		return resultPropertys;
	}
	public void setResultPropertys(LinkedHashSet<ResultProperty> resultPropertys) {
		this.resultPropertys = resultPropertys;
	}

	public String getProcedureKind() {
		return procedureKind;
	}

	public void setProcedureKind(String procedureKind) {
		this.procedureKind = procedureKind;
	}
	
	
}
