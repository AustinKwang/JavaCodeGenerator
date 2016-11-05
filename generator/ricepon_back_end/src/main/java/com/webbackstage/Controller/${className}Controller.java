package com.webbackstage.Controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import com.alibaba.fastjson.JSONObject;
import com.webbackstage.common.Common;
import com.webbackstage.common.DataRequest;
import com.webbackstage.common.DataResponse;
import com.webbackstage.common.ErrorClass;
import com.webbackstage.common.ResponseConstant;
import com.webbackstage.common.ResultResponse;
import com.webbackstage.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webbackstage.service.I${className}Service;
import com.webbackstage.model.${className};
import com.webbackstage.model.sysUser;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
*
* @author
* @Date 
*/
@Controller
@RequestMapping("/${classNameFirstLower}")  
public class ${className}Controller
{
	
	@Autowired
	I${className}Service ${classNameFirstLower}Service;
	
	@ResponseBody
	@RequestMapping(value={"/deleteByPK"})
    public ErrorClass deleteByPk(@RequestParam(value = "${classNameFirstLower}Id") final Integer ${classNameFirstLower}Id) throws Exception
	{  
        ${classNameFirstLower}Service.deleteByPrimaryKey(${classNameFirstLower}Id);
    	return ResponseUtil.buildSuccessResponse();
    }  
		
	@RequestMapping(value="/showList",method = RequestMethod.GET)
	public String show${className}List(final HttpServletRequest request, ${className} ${classNameFirstLower}, Map<String, Object> map)
	{
		map.put("${classNameFirstLower}", ${classNameFirstLower});
		return "brand/${classNameFirstLower}";
	}
	
	@ResponseBody
	@RequestMapping(value = "query4Page", method = RequestMethod.GET)
	public DataResponse query4Page(HttpServletRequest request) {
	    String page = request.getParameter("page");
	    String rows = request.getParameter("rows");
		String queryStr = request.getParameter("queryParam");
		${className} ${classNameFirstLower} = null;
		if(queryStr != null && queryStr.length() > 0){
			${classNameFirstLower} = JSONObject.parseObject(queryStr, ${className}.class);
		}else{
			${classNameFirstLower} = new ${className}();
		}
		DataRequest dataRequest = new DataRequest();
		dataRequest.setPage(StringUtils.isEmpty(page) ? 1 : Integer.valueOf(page));
		dataRequest.setRows(StringUtils.isEmpty(rows) ? 10 : Integer.valueOf(rows));
	    DataResponse<${className}> responseData = ${classNameFirstLower}Service.selectBy${className}(${classNameFirstLower}, dataRequest);
	    return responseData;
	}
	
	@ResponseBody
	@RequestMapping(value = "query", method = RequestMethod.GET)
	public ErrorClass query(HttpServletRequest request) {
		String queryStr = request.getParameter("queryParam");
		${className} ${classNameFirstLower} = null;
		if(queryStr != null && queryStr.length() > 0){
			${classNameFirstLower} = JSONObject.parseObject(queryStr, ${className}.class);
		}else{
			${classNameFirstLower} = new ${className}();
		}
		return ResponseUtil.buildSuccessResponse(${classNameFirstLower}Service.selectBy${className}(${classNameFirstLower}));
	}
	
	@ResponseBody
	@RequestMapping(value = "getByPk", method = RequestMethod.GET)
	public Object get${className}ByPk(@RequestParam(value = "${classNameFirstLower}Id") final Integer ${classNameFirstLower}Id)
	{
		${className} ${classNameFirstLower} = ${classNameFirstLower}Service.selectByPrimaryKey(${classNameFirstLower}Id);
		return ResponseUtil.buildSuccessResponse(${classNameFirstLower});
	}
	
	@ResponseBody
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public ErrorClass update${className}(${className} ${classNameFirstLower}, final HttpServletRequest request){
		Object currenUser = request.getSession().getAttribute(Common.USER_SESSION_KEY);
		int byuserId=((sysUser)currenUser).getId();
		String byuserName=((sysUser)currenUser).getUserName();
		${classNameFirstLower}.setUpdateBy(byuserName);
		${classNameFirstLower}.setUpdateTime(new Date());
		${classNameFirstLower}Service.updateByPrimaryKey(${classNameFirstLower});
		return ResponseUtil.buildSuccessResponse();
	}
	
	@ResponseBody
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ErrorClass add${className}(${className} ${classNameFirstLower}, final HttpServletRequest request){
		Object currenUser = request.getSession().getAttribute(Common.USER_SESSION_KEY);
		int byuserId=((sysUser)currenUser).getId();
		String byuserName=((sysUser)currenUser).getUserName();
		${classNameFirstLower}.setCreateBy(byuserName);
		${classNameFirstLower}.setCreateTime(new Date());
		${classNameFirstLower}Service.insert${className}(${classNameFirstLower});
		return ResponseUtil.buildSuccessResponse();
	}
}
	