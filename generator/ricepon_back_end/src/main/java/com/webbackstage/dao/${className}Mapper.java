package com.webbackstage.dao;

import com.webbackstage.model.${className};
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
*
* @author 
* @Date 
*/
@Repository("${classNameFirstLower}Mapper")
public interface ${className}Mapper
{

	${className} selectByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});

	List<${className}> selectBy${className}4Page(@Param("${classNameFirstLower}") ${className} ${classNameFirstLower}, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
	
	Long getTotalCount(@Param("${classNameFirstLower}") ${className} ${classNameFirstLower});
	
	List<${className}> selectBy${className}(@Param("${classNameFirstLower}") ${className} ${classNameFirstLower});

	void updateByPrimaryKey(${className} ${classNameFirstLower});

	void insert${className}(${className} ${classNameFirstLower});

	void deleteByPrimaryKey(${table.onePKColums.simpleJavaType} ${table.onePKColums.columnNameFirstLower});
}
