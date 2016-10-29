<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage};

import java.util.Date;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.lqting.framework.dao.support.BaseModel;


/**
*
* @author 
* @Date 
*/
@Entity
@Table(name = "${sqlName}")
public class ${className}Model extends BaseModel implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**	构造函数	**/
	public ${className}Model() 
	{
	}
	
	
	
	/**属性*/

<@generateFields/>
	
	/**getter setter方法*/
<@genGetSetProperties/>
		
		
<@resultConverter/>

}