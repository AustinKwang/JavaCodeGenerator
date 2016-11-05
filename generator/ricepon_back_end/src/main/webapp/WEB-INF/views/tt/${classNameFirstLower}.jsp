<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>需要修改</title>
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
				<button class="btn btn-primary" type="button" id="search-btn">查询</button>
				<button class="btn btn-primary" type="button" id="add-btn">新增</button>
            </div>
        </form>
    </div>

    <div class="boxcard col-lg-12">
        <table class="table table-striped table-hover" id="${classNameFirstLower}-table"></table>
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
                    <button class="btn btn-default" type="button" data-dismiss="modal">关闭</button>
                    <button class="btn btn-default" type="button" id="save-btn">保存</button>
                </div>
            </div>
        </div>
    </div>
    <script src="<@jspEl 'path'/>assets/js/${classNameFirstLower}/${classNameFirstLower}.js" type="text/javascript" charset="utf-8"></script>