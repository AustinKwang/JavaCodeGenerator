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
	<input type="hidden" name="operateType" id="operateType" value="<@jspEl 'operateType'/>"/>
	<form name="fm" id="fm" action="/${modulename}/${classNameLowerCase}" method="post">

		<table class="fix_table">
			<tr>
				<td class="bgc_tt short" colspan="4" align="left">
					<h2 align="center">
						<@generateEditTitle/>
					</h2></td>
			</tr>
			<tr>
				<#assign field_index=0 />
				<#list table.columns as column>
			      	    <#if (field_index==0)>
							<tr>
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
						<#elseif ((field_index%2)!=0)&&(column_has_next)>
							   <@generateEditForm column/>
							   <#assign field_index=field_index+1 />
						<#elseif ((field_index%2)==0)&&(column_has_next)>
							</tr>
							<tr>
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
						<#elseif ((field_index%2)==0)&&(!column_has_next)>
							</tr>
							<tr>
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
								<td class="bgc_tt short"></td>
							    <td class="long"></td>
							 </tr>	
						<#elseif ((field_index%2)!=0)&&(!column_has_next)&&((field_index%2)==1)>
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
							 </tr> 				 
						</#if>								
			      </#list>
		</table>
		<br>
		<table class="fix_table">
			<tr>
				<td colspan=4 align="center">
						<input type="button" class="button_ty" id="saveBtn" ind="ind"  value="保存" />
						<input type="reset" class="button_ty" id="resetBtn" ind="ind"  value="重置" />
						<input type="button" class="button_ty" id="closeBtn" value="关闭" />
				</td>
			</tr>
		</table>
	</form>
	<script type="text/javascript" src="<@jspEl 'ctx'/>/pages/${namespace}/${classNameLowerCase}/${className}.js"></script>
</body>
</html>
