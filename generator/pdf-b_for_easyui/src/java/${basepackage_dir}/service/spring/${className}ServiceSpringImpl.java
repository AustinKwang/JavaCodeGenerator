<#include "/java_copyright.include"> 
<#include "/macro.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.service.spring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lqting.common.dao.support.Page;
import com.lqting.common.dao.support.QueryRule;
import com.lqting.common.dao.support.QueryRuleHelper;

import ${basepackage}.dao.${className}DaoHibernate;
import ${basepackage}.service.facade.I${className}Service;
import ${basepackage}.schema.model.${className};

/**
*
* @author
* @Date 
*/
@Service("${classNameFirstLower}Service")
public class ${className}ServiceSpringImpl implements I${className}Service
{
	@SuppressWarnings("unused")
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private ${className}DaoHibernate ${classNameFirstLower}Dao;

    /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * find${className}ByPK
	 * (com.lqting.operator.schema.model.${table.onePKColums.columnNameFirstLower})
	 */
	@Override
	public ${className} find${className}ByPK(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower})
	{
			return ${classNameFirstLower}Dao.get(${className}.class, ${table.onePKColums.columnNameFirstLower});
	}

	 /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * findBy${className}(${className}
	 * (com.lqting.operator.schema.model.${className}, int, int)
	 */
	@Override
	public Page<${className}> findBy${className}(${className} ${classNameFirstLower}, int pageNo, int pageSize)
	{
		//QueryRule queryRule = QueryRule.getInstance();// 获取QueryRule对象的Instance
		QueryRule queryRule = QueryRuleHelper.generateQueryRule(${classNameFirstLower});
		return ${classNameFirstLower}Dao.find(queryRule, pageNo, pageSize);
	}
	
	 /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * findBy${className}
	 * (com.lqting.operator.schema.model.${className})
	 */
	@Override
	public List<${className}> findBy${className}(${className} ${classNameFirstLower})
	{
		QueryRule queryRule = QueryRuleHelper.generateQueryRule(${classNameFirstLower});
		//根据${classNameFirstLower}生成queryRule
		return ${classNameFirstLower}Dao.find(queryRule);
	}

	 /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * update${className}
	 * (com.lqting.operator.schema.model.${className})
	 */
	@Override
	public void update${className}(${className} ${classNameFirstLower})
	{
			${classNameFirstLower}Dao.update(${classNameFirstLower});
	}

	 /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * save${className}
	 * (com.lqting.operator.schema.model.${className})
	 */
	@Override
	public void save${className}(${className} ${classNameFirstLower})
	{
			${classNameFirstLower}Dao.save(${classNameFirstLower});
	}

	 /*
	 * (non-Javadoc)
	 * 
	 * @see com.lqting.operator.service.facade.I${className}Service#
	 * deleteByPK
	 * (com.lqting.operator.schema.model.${table.onePKColums.columnNameFirstLower}
	 */
	@Override
	public void deleteByPK(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower})
	{
			${classNameFirstLower}Dao.deleteByPK(${className}.class, ${table.onePKColums.columnNameFirstLower});
	}
}
