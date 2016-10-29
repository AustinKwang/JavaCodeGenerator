$(document).ready(function(){
	var query_action = contextRootPath + "/${modulename}/${classNameLowerCase}/query.do";
	var queryResultTable = "${className}Table";
	var page_toolBar = [ {
		text : '修改',
		align : 'right',
		iconCls : 'icon-edit',
		handler : function() {
			prepareUpdate();
		}
	}, {
		text : '删除',
		align : 'right',
		iconCls : 'icon-remove',
		handler : function() {
			executeDelete();
		}
	} ];
	var page_contentColumnHeaders = [ [
			{
				field : 'checkBoxNo',
				checkbox : true
			},
			<#list table.columns as column>
				<#if column.pk>
			{
				field : '${column.columnNameFirstLower}',
				title : '${column.columnAlias}',
				align : 'center',
				sortable : true,
				formatter : function(value, row, index) {
					var idValue = row.${column.columnNameFirstLower};
					return '<a style="cursor:pointer;text-decoration: underline;" class="grid-link" column="${column.columnNameFirstLower}" value="'  + idValue +  '">' + idValue + '</a>';
				}
			},
				</#if>
	        </#list>	
			<#list table.columns as column>
			<#if !column.pk>
			{
				field : '${column.columnNameFirstLower}',
				title : '${column.columnAlias}',
				align : 'center',
				sortable : true
			}
				<#if column_has_next>,</#if>	
			</#if>
			</#list>
			] ];
	
	
	/* 查询 */
	function executeQuery() {
		var $targetGrid = $('#'+queryResultTable);
		if(!$targetGrid || $targetGrid.length < 1){
			return;
		}
		var data = $("#fm").serialize(),
		send_url = query_action + "?" + data;
		$targetGrid.datagrid({
			title : "查询结果",
			url : send_url,
			nowrap : true,
			striped : true,
			remoteSort : false,
			pageNumber : 1,
			pagination : true,
			onLoadError: function(result){
				alertErrorMsgForEasyUi(result);
			},
			columns : page_contentColumnHeaders,
			toolbar : page_toolBar,
			onLoadSuccess: function(){
				$('.grid-link').click(view);
			},
		});
	}
	/* 修改 */
	function prepareUpdate(params) {
		var rowData = params;
		if(!params){
			var rows = $('#' + queryResultTable).datagrid('getChecked');
			if (rows == null) {
				return;
			}
			var num = rows.length;
			if (num != 1) {
				$.messager.alert('提示消息', "请选择一行", 'info');
				return;
			}
			rowData = getUrlByJson({
				id: rows[0].id
			});
		}
		var url = contextRootPath+"/${modulename}/${classNameLowerCase}/prepareUpdate.do?" + rowData;
		editRecord(url);
	}
	/* 新增 */
	function prepareAdd() {
		editRecord(contextRootPath+'/${modulename}/${classNameLowerCase}/prepareAdd.do');
	}
	/* 查看 */
	function view(params) {
		var idValue;
		if(!event){
			var rows = $('#' + queryResultTable).datagrid('getChecked');
			if (rows == null) {
				return;
			}
			var num = rows.length;
			if (num != 1) {
				$.messager.alert('提示消息', "请选择一行", 'info');
				return;
			}
			idValue = rows[0].id.taskId;
		}else{
			var $target = $(event.target);
			idValue = $target.attr('value');
		}
		if(!idValue){
			$.messager.alert('提示消息', "请选择需要展示的数据", 'info');
		}
		var cloumn = $target.attr('column');
		var url = contextRootPath + "/${modulename}/${classNameLowerCase}/view.do?" +cloumn + '=' + idValue;
		editRecord(url);
	}
	
	/* 删除 */
	function executeDelete() {
		var rows = $('#' + queryResultTable).datagrid('getSelections');
		if (rows == null) {
			return;
		}
		var num = rows.length;
		if (num != 1) {
			$.messager.alert('提示消息', "请选择一行", 'info');
			return;
		}
		var idValue = rows[0].id.taskId;
		if(!idValue){
			$.messager.alert('提示消息', "请选择需要展示的数据", 'info');
		}
		$.messager.confirm('提示', '是否确认删除?', function(r){
			if (r){
				var url = contextRootPath+"/${modulename}/${classNameLowerCase}/delete.do?" +cloumn + '=' + idValue;
				 $.ajax({
						   type: "POST",
						   url: url,
						   success: function(result){
								  $.messager.alert('提示信息','记录删除成功！	','info');
								  $('#'+queryResultTable).datagrid('reload');
						   },
						   error:function(result){
							   alertErrorMsgForEasyUi(result);
						   }
				});
			}
		});
	}
	
	function closeWinAndReLoad() {
		try{
			window.opener.reLoadResult();
		}catch(e){}
		window.close();
	}
	
	window.reLoadResult = function(){
		executeQuery();
	}
	
	//--- 绑定事件---
	$('#fm').registerSubmitAsAjax();
	$('#queryBtn').on('click', executeQuery);
	$('#addBtn').on('click', prepareAdd);
	//---逻辑---
	if($('#operateType').val()=='view'){
		setReadonlyOfAllInput("fm");
	}
	executeQuery();
});