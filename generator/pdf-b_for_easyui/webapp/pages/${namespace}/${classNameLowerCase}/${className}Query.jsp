<%@ include file="/common/taglibs.jsp"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="${basepackage}.schema.model.${className}" %>
<html>
<head>
<%@ include file="/common/meta_css.jsp"%>
<%@ include file="/common/i18njs.jsp"%>
<%@ include file="/common/meta_js.jsp"%>
</head>
<body>
	<div class="right_detail_top">
		<h3></h3>
	</div>
	<form name="fm" id="fm">
		<div id="wrapper">
			<div id="container">
				<div id="crash_menu">
					<h2 align="center">请输入查询条件</h2>
				</div>
				<table class="fix_table">
					<#assign field_index=0 />
					<#list table.columns as column>
						<#if column.columnNameLowerCase == 'inserttimeforhis' || column.columnNameLowerCase == 'creatorcode' 
						||column.columnNameLowerCase == 'operatetimeforhis' || column.columnNameLowerCase == 'updatercode'>
						<#else>
						<#if (field_index==0)>
							<tr>
								<@generateQueryForm column/>	
								<#assign field_index=field_index+1 />								
						<#elseif ((field_index%2)!=0)&&(column_has_next)>
							   <@generateQueryForm column/>
							   <#assign field_index=field_index+1 />
						<#elseif ((field_index%2)==0)&&(column_has_next)>
							</tr>
							<tr>
								<@generateQueryForm column/>
								<#assign field_index=field_index+1 />
						<#elseif ((field_index%2)==0)&&(!column_has_next)>
							</tr>
							<tr>
								<@generateQueryForm column/>
								<#assign field_index=field_index+1 />
								<td class="bgc_tt short"></td>
							    <td class="long"></td>
							 </tr>
						<#elseif ((field_index%2)!=0)&&(!column_has_next)&&((field_index%2)==1)>
								<@generateQueryForm column/>
								<#assign field_index=field_index+1 />
							 </tr> 			 
						</#if>
						</#if>
			      </#list>
					<tr>
						<td colspan="6" align="center">
							<input type="button" class="button_ty" value="查 询"
								id="queryBtn"> 
							<input type="button" id="addBtn"
								class="button_ty" value="增 加">
						</td>
					</tr>
				</table>
			</div>
		</div>
	</form>
	<br>
	<table id="${className}Table"></table>
	<script type="text/javascript" src="<@jspEl 'ctx'/>/pages/${namespace}/${classNameLowerCase}/${className}Query.js"></script>
</body>
</html>
