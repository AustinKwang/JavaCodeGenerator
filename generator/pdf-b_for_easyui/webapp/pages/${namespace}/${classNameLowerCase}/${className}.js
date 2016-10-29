$(document).ready(function(){
	var query_action = contextRootPath + "/${modulename}/${classNameLowerCase}/query.do";
	var queryResultTable = "${className}Table";
	function executeSave(){
		if(!$('#fm').form('validate')){
	    	return false; 
	    }else{
	    	$.messager.confirm('提示', '是否确认保存?', function(r){
				if (r){
				 	if($('#operateType').val()=='update'){
				 		$("#fm").attr("action",contextRootPath+"/${modulename}/${classNameLowerCase}/update.do");
				 		$("#fm").submit();
				 	}else if($('#operateType').val()=='add'){
				 		$("#fm").attr("action",contextRootPath+"/${modulename}/${classNameLowerCase}/add.do");
				 		$("#fm").submit();
				 	}else{
				 		return false;
				 	}				 	
				}
			});
	    }	    
	}
	
	window.reLoadResult = function(){
		executeQuery();
	}
	
	//--- 绑定事件---
	$('#fm').registerSubmitAsAjax();
	$('#saveBtn').on('click', executeSave);
	$('#closeBtn').on('click', closeWinAndReLoad);
	//---逻辑---
	if($('#operateType').val()=='view'){
		setReadonlyOfAllInput("fm");
	}
});