package com.webbackstage.service.impl;

import com.webbackstage.common.DataRequest;
import com.webbackstage.common.DataResponse;
import com.webbackstage.dao.${className}Mapper;
import com.webbackstage.model.${className};
import com.webbackstage.service.I${className}Service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
*
* @author
* @Date 
*/
@Service("${classNameFirstLower}Service")
public class ${className}ServiceImpl implements I${className}Service
{
	private static Logger logger = Logger.getLogger(${className}ServiceImpl.class);  
	
	@Autowired
    private ${className}Mapper ${classNameFirstLower}Mapper;

    /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * selectByPrimaryKey
	 * (${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower})
	 */
	public ${className} selectByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower})
	{
		return ${classNameFirstLower}Mapper.selectByPrimaryKey(${table.onePKColums.columnNameFirstLower});
	}

	 /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * selectBy${className}
	 * (com.webbackstage.model.${className}, int, int)
	 */
	public DataResponse<${className}> selectBy${className}(${className} ${classNameFirstLower}, DataRequest dataPage)
	{
		List<${className}> data = ${classNameFirstLower}Mapper.selectBy${className}4Page(${classNameFirstLower}, dataPage.getStartRowIndex(), dataPage.getRows());
		long totalCount = ${classNameFirstLower}Mapper.getTotalCount(${classNameFirstLower});
		int pageSize = dataPage.getRows();
		int totalPages=(int) Math.ceil(totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1);
		DataResponse dataResponse = new DataResponse();
		dataResponse.setRows(data);
		dataResponse.setRecords((int)totalCount);
		dataResponse.setTotal(totalPages);
		dataResponse.setPage(dataPage.getPage());
		return dataResponse;
	}
	
	 /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * selectBy${className}
	 * (com.webbackstage.model.${className})
	 */
	public List<${className}> selectBy${className}(${className} ${classNameFirstLower})
	{
		return ${classNameFirstLower}Mapper.selectBy${className}(${classNameFirstLower});
	}

	 /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * update${className}
	 * (com.webbackstage.model.${className})
	 */
	public void updateByPrimaryKey(${className} ${classNameFirstLower})
	{
		${classNameFirstLower}Mapper.updateByPrimaryKey(${classNameFirstLower});
	}

	 /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * insert${className}
	 * (com.webbackstage.model.${className})
	 */
	public void insert${className}(${className} ${classNameFirstLower})
	{
		${classNameFirstLower}Mapper.insert${className}(${classNameFirstLower});
	}

	 /**
	 * (non-Javadoc)
	 * 
	 * @see com.webbackstage.service.I${className}Service#
	 * deleteByPrimaryKey
	 * (${table.onePKColums.simpleJavaType}}
	 */
	public void deleteByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower})
	{
		${classNameFirstLower}Mapper.deleteByPrimaryKey(${table.onePKColums.columnNameFirstLower});
	}
}
