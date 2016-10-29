<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.lqting.common.dao.support.Page;
import com.lqting.common.utils.EmptyUtil;
import com.lqting.common.web.Struts2Action;
import com.lqting.common.web.response.ResponseBuilder;

import ${basepackage}.service.facade.I${className}Service;
import ${basepackage}.schema.model.${className};

/**
*
* @author
* @Date 
*/
public class ${className}Action extends Struts2Action
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private I${className}Service ${classNameFirstLower}Service;	
	
	private ${className} ${classNameFirstLower};
	
	/** ${table.onePKColums.columnAlias} **/
	private ${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower};
	
	/** 操作类型 **/
	private String operateType;
	
	/** ${className} getter/setter **/
	public ${className} get${className}() 
	{
		return this.${classNameFirstLower};
	}
	
	public void set${className}(${className} ${classNameFirstLower}) 
	{
		this.${classNameFirstLower} = ${classNameFirstLower};
	}
	
	public ${table.onePKColums.simpleJavaType} get${table.onePKColums.columnName}() {
		return this.${table.onePKColums.columnNameFirstLower};
	}
	
	public void set${table.onePKColums.columnName}(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower}) {
		this.${table.onePKColums.columnNameFirstLower} = ${table.onePKColums.columnNameFirstLower};
	}
	
	/** operateType getter/setter **/
	public String getOperateType() 
	{
		return operateType;
	}

	public void setOperateType(String operateType) 
	{
		this.operateType = operateType;
	}
	
	/****************************Function Start*******************************/
	
	/**
	 * 准备查询方法，可以根据需要对需要初始化的文本赋值
	 * 
	 * @return
	 */
	public String prepareQuery() 
	{		
		return SUCCESS;
	}
	
	/**
	 * ${className}查询，根据${classNameFirstLower}带过来的值为查询条件进行查询。
	 * 
	 * @return
	 */
	public String query()
	{
		Page<${className}> resultPage = ${classNameFirstLower}Service.findBy${className}(${classNameFirstLower}, page, rows);
		this.writeEasyUiData(resultPage);
		return NONE;
	}	


	/**
	 * 准备更新${className}信息
	 * 
	 * @return
	 */
	public String prepareUpdate() 
	{
		if (EmptyUtil.isEmpty(operateType))
		{
			operateType = "update";
		}
		${classNameFirstLower} = ${classNameFirstLower}Service.find${className}ByPK(${table.onePKColums.columnNameFirstLower});
		return SUCCESS;
	}
	
	/**
	 * 更新${className}信息
	 * 
	 * @return
	 */
	public String update() 
	{ 
		${classNameFirstLower}Service.update${className}(${classNameFirstLower});
		this.writeResponse(ResponseBuilder.buildSucessResponse());
		return NONE;
	}


	/**
	 * 准备增加${className}信息
	 * 
	 * @return
	 */
	public String prepareAdd() 
	{
		if (EmptyUtil.isEmpty(operateType))
		{
			operateType = "add";
		}
		return SUCCESS;
	}
	
	/**
	 * 新增${className}信息
	 * 
	 * @return
	 */
	public String add() 
	{
		${classNameFirstLower}Service.save${className}(${classNameFirstLower});
		this.writeResponse(ResponseBuilder.buildSucessResponse());
		return NONE;
	}



	/**
	 * 删除${className}信息
	 * 
	 * @return
	 */
	public String delete() 
	{
		if(EmptyUtil.isEmpty(${table.onePKColums.columnNameFirstLower}))
		{
			${classNameFirstLower}Service.deleteByPK(${table.onePKColums.columnNameFirstLower});
			this.writeResponse(ResponseBuilder.buildSucessResponse());
		}
		return NONE;
	}



	/**
	 * 查看${className}信息方法
	 * 
	 * @return
	 */
	public String view() 
	{
		operateType = "view";
		${classNameFirstLower} = ${classNameFirstLower}Service.find${className}ByPK(${table.onePKColums.columnNameFirstLower});
		return SUCCESS;
	}
}
	