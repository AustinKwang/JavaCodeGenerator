/*<#include "/java_copyright.include">*/
/*<#include "/macro.include">*/
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.*;

import com.lqting.common.dao.GenericDaoHibernate;

import ${basepackage}.schema.model.${className};

/**
*
* @author 
* @Date 
*/
@Repository("${classNameFirstLower}Dao")
public class ${className}DaoHibernate extends GenericDaoHibernate<${className},String> 
{
	@SuppressWarnings("unused")
	protected final Log logger = LogFactory.getLog(this.getClass());

}
