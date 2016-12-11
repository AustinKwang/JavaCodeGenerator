<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="recipon" uri="/WEB-INF/tlds/recipon.tld"%>
<head>
    <title>需要修改</title>
    <link href="<@jspEl 'path'/>assets/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" />
</head>
<body>
	<div class="search-box">
        <form action="" id="search-form" class="form-horizontal center-block" role="form" onsubmit="return false;">
	        	<#assign field_index=0 />
	        	<#list table.columns as column>
					<#if column.columnNameLowerCase == 'inserttimeforhis' || column.columnNameLowerCase == 'creatorcode' 
					||column.columnNameLowerCase == 'operatetimeforhis' || column.columnNameLowerCase == 'updatercode'>
					<#else>
					<#if (field_index==0)>
			<div class="form-group">
					<@generateQueryForm column/>	
					<#assign field_index=field_index+1 />								
					<#elseif ((field_index%2)!=0)&&(column_has_next)>
						   <@generateQueryForm column/>
						   <#assign field_index=field_index+1 />
					<#elseif ((field_index%2)==0)&&(column_has_next)>
			</div>
			<div class="form-group">
					<@generateQueryForm column/>
					<#assign field_index=field_index+1 />
					<#elseif ((field_index%2)==0)&&(!column_has_next)>
			</div>
			<div class="form-group">
					<@generateQueryForm column/>
					<#assign field_index=field_index+1 />
			 </div>
					<#elseif ((field_index%2)!=0)&&(!column_has_next)&&((field_index%2)==1)>
					<@generateQueryForm column/>
					<#assign field_index=field_index+1 />
			 </div>		 
					</#if>
					</#if>
	      		</#list>
            <div class="form-group">
	            <div style="text-align: center;">
					<button class="btn btn-primary" type="button" id="search-btn"><recipon:lg key="lg_sreachButtonMsg" defaultValue="lg_sreachButtonMsg搜索"></recipon:lg></button>
					<button class="btn btn-primary" type="button" id="add-btn"><recipon:lg key="lg_addMsg" defaultValue="lg_addMsg新增"></recipon:lg></button>
				</div>
            </div>
        </form>
    </div>

    <div class="boxcard col-lg-12">
        <table class="table table-striped table-bordered dt-responsive nowrap table-hover" width="100%" id="${classNameFirstLower}-table"></table>
        <div id="gridPager"></div>
    </div>
    
    <div id="edit-box" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <button class="close" type="button" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="update-box">需要修改</h4>
                </div>
                <div class="modal-body">
                    <form action="" id="edit-form" class="form-horizontal center-block" role="form">
                        <input type="hidden" name="id" id="${classNameFirstLower}Id" value="">
	                        <#assign field_index=0 />
							<#list table.columns as column>
				      	    	<#if (field_index==0)>
						<div class="form-group">
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
								<#elseif ((field_index%2)!=0)&&(column_has_next)>
									   <@generateEditForm column/>
									   <#assign field_index=field_index+1 />
								<#elseif ((field_index%2)==0)&&(column_has_next)>
						</div>	
						<div class="form-group">
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
								<#elseif ((field_index%2)==0)&&(!column_has_next)>
						</div>	
						<div class="form-group">
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
						</div>
								<#elseif ((field_index%2)!=0)&&(!column_has_next)&&((field_index%2)==1)>
								<@generateEditForm column/>
								<#assign field_index=field_index+1 />
						 </div>			 
								</#if>								
			      			</#list>
                    </form>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-default" type="button" data-dismiss="modal"><recipon:lg key="lg_cancelMsg" defaultValue="lg_cancelMsg取消"></recipon:lg></button>
                    <button class="btn btn-default" type="button" id="save-btn"><recipon:lg key="lg_saveMsg" defaultValue="lg_saveMsg保存"></recipon:lg></button>
                </div>
            </div>
        </div>
    </div>
    <script src="<@jspEl 'path'/>assets/plugins/moment/moment.js" type="text/javascript" charset="utf-8"></script>
    <script src="<@jspEl 'path'/>assets/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" type="text/javascript" charset="utf-8"/>
    <script src="<@jspEl 'path'/>assets/js/${classNameFirstLower}/${classNameFirstLower}.js" type="text/javascript" charset="utf-8"></script>
</body>