<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.facade;

import java.util.List;

import com.lqting.common.dao.support.Page;

import ${basepackage}.schema.model.${className};

/**
*
* @author
* @Date 
*/
public interface I${className}Service
{

	/**
	 * 根据主键对象${className}Id获取${className}信息
	 * @param ${className}Id
	 * @return ${className}
	 */
	public ${className} find${className}ByPK(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});

	/**
	 * 根据${classNameFirstLower}和页码信息，获取Page对象
	 * @param ${classNameFirstLower}
	 * @param pageNo
	 * @param pageSize
	 * @return 包含${className}的Page对象
	 */
	public Page<${className}> findBy${className}(${className} ${classNameFirstLower}, int pageNo, int pageSize);

	/**
	 * 根据${classNameFirstLower}获取${classNameFirstLower}list
	 * @param ${classNameFirstLower}
	 * @param pageNo
	 * @param pageSize
	 * @return 包含${className}的Page对象
	 */
	public List<${className}> findBy${className}(${className} ${classNameFirstLower});
	
	/**
	 * 更新${className}信息
	 * @param ${className}
	 */
	public void update${className}(${className} ${classNameFirstLower});

	/**
	 * 保存${className}信息
	 * @param ${className}
	 */
	public void save${className}(${className} ${classNameFirstLower});

	/**
	 * 根据主键对象，删除${className}信息
	 * @param ${className}Id
	 */
	public void deleteByPK(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});
	
}
