package com.webbackstage.model;

import java.util.Date;

/**
*
* @author 
* @Date 
*/
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
}