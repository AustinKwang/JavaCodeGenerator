package com.webbackstage.service;

import com.webbackstage.model.${className};
import com.webbackstage.common.DataRequest;
import com.webbackstage.common.DataResponse;

import java.util.List;

public interface I${className}Service
{

	/**
	 * 根據PrimaryKey查詢${className}
	 * @param ${table.onePKColums.columnNameFirstLower}
	 * @return
     */
	${className} selectByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});

	/**
	 * 根據${className}以及分頁信息查詢${className}分頁數據
	 * @param ${classNameFirstLower}
	 * @param dataPage
     * @return
     */
	DataResponse<${className}> selectBy${className}(${className} ${classNameFirstLower}, DataRequest dataPage);
	
	/**
	 * 根據${className}查詢${className}列表
	 * @param ${classNameFirstLower}
	 * @return
     */
	List<${className}> selectBy${className}(${className} ${classNameFirstLower});

	/**
	 * 更新Resource
	 * @param resourceInfo
     */
	void updateByPrimaryKey(${className} ${classNameFirstLower});

	/**
	 * 添加一條${className}
	 * @param ${classNameFirstLower}
     */
	void insert${className}(${className} ${classNameFirstLower});

	/**
	 * 根據PrimaryKey刪除${className}
	 * @param ${table.onePKColums.columnNameFirstLower}
     */
	void deleteByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});
}
