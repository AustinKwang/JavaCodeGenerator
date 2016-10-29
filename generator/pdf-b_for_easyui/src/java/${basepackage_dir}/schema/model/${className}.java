<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.schema.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.lqting.common.dao.annotation.YitianID;



/**
*
* @author 
* @Date 
*/
@Entity
@Table(name = "${sqlName}")
public class ${className} implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	/**	构造函数	**/
	public ${className}() 
	{
	}
	
	/**属性*/
	<@generateFields/>
	
	/**getter setter方法*/
	<@genGetSetProperties/>

	public int hashCode() 
	{
		return new HashCodeBuilder()
		<#list table.pkColumns as column>
			.append(get${column.columnName}())
		</#list>
			.toHashCode();
	}

	public boolean equals(Object obj) {
		if(obj instanceof ${className} == false)
		{
			return false;
		}
		if(this == obj)
		{
			return true;
		}
		${className} other = (${className})obj;
		return new EqualsBuilder()
			<#list table.pkColumns as column>
			.append(get${column.columnName}(),other.get${column.columnName}())
			</#list>
			.isEquals();
	}
}