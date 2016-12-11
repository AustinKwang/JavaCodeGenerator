/**
 * Created by austin
 */
(function(){
	var brandList = null;
	$.ajax({
	    type: "GET",
	    url: contextPath +  'brandInfo/brandList.do',
	    dataType: "json",
	    // data: {},
	    success: function(response) {
	        if (response.code == 0 || response.code == 1) {
	            brandList = response.data;
	        }
	    }
	});
	
	function initGrid(){
        $('#${classNameFirstLower}-table').grid({
            url: contextPath + '/${classNameFirstLower}/query4Page.do',
            gridType: 'jqGrid',
            colModel: [
            	<#list table.columns as column>
	            	<#if column.isDateTimeColumn><#--日期类型使用日期控件 -->
	            	{label: '${column.remarks}', name:'${column.columnNameFirstLower}', searchoptions:{sopt:['eq','ne','le','lt','gt','ge']},
	            		formatter: function(cellvalue, options, rowObject) {
	                        return moment(value).format('YYYY-MM-DD HH:mm:ss');
	                    }
	            	},
					<#else>
	            	{label: '${column.remarks}', name:'${column.columnNameFirstLower}', searchoptions:{sopt:['eq','ne','le','lt','gt','ge']}},
			        </#if>
                </#list>
                {label:'操作', name:'opt', width: 230, formatter: function(cellvalue, options, rowObject){
                    var ${classNameFirstLower}Id = rowObject.${table.onePKColums.columnNameFirstLower},
                        showHTML = '<div class="btn-group">'
                            + '<input type="button" class="update-btn grid-btn btn " value="修改" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />'
                            + '<input type="button" class="delete-btn grid-btn btn" value="删除" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />';
                    return showHTML;
                }}
            ],
        });
    }
    function initDataTable(){
        $('#${classNameFirstLower}-table').grid({
            url: contextPath + '/${classNameFirstLower}/query4Page.do',
            columns: [
            	<#list table.columns as column>
            	<#if column.isDateTimeColumn><#--日期类型使用日期控件 -->
            	{title: '${column.remarks}', data:'${column.columnNameFirstLower}',
            		render: function(value, type, row) {
                        return moment(value).format('YYYY-MM-DD HH:mm:ss');
                    }
            	},
				<#else>
            	{title: '${column.remarks}', data:'${column.columnNameFirstLower}'},
		        </#if>
                </#list>
                {title:'操作', name:'opt',render: function(value, i, row){
                    var ${classNameFirstLower}Id = row.${table.onePKColums.columnNameFirstLower},
                        showHTML = '<div class="btn-group">'
                            + '<input type="button" class="update-btn grid-btn btn " value="修改" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />'
                            + '<input type="button" class="delete-btn grid-btn btn" value="删除" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />';
                    return showHTML;
                }}
            ],
        });
    }
    
    function excuteQuery(){
        $('#${classNameFirstLower}-table').grid('reload'); //重新载入
    }

    $('#${classNameFirstLower}-table').on('click', '.update-btn',function(event){
        var $target = $(event.target), ${classNameFirstLower}Id = $target.data('${classNameLowerCase}Id');
        clearFormData('#edit-form');
        $.ajax({
            type: "GET",
            url: contextPath + '/${classNameFirstLower}/getByPk.do',
            dataType: "json",
            data:{
            	${classNameFirstLower}Id: ${classNameFirstLower}Id,
            },
            success: function(response){
                if(response.code === 0) {
                    convertData2FormItem(response.data, 'edit-form');
                }
            }
        });
        openEditModal();
    }).on('click', '.delete-btn', function(event){
        var $target = $(event.target), ${classNameFirstLower}Id = $target.data('${classNameLowerCase}Id'),
        content = '确定要删除?'
        ;
        if(${classNameFirstLower}Id){
        	$.confirm({
    	        content: content,
    	        title: '提示!',
    	        confirmButton: '确定',
    	        cancelButton: '取消',
    	        post: false,
    	        submitForm: false,
    	        dialogClass: 'modal-dialog',
    	        confirm: function() {
    	            $.ajax({
    	                type: 'POST',
    	                url: contextPath + '${classNameFirstLower}/deleteByPK.do',
    	                dataType: "json",
    	                data: {
    	                	${classNameFirstLower}Id: ${classNameFirstLower}Id,
    	                },
    	                success: function (response) {
    	                    if(!!response && response.code === 0){
    	                        ShowAlert('提示消息', '删除成功');
    	                        excuteQuery();
    	                    }else{
    	                        ShowAlert('提示消息', '删除失败');
    	                    }
    	                }
    	            });
    	        },
    	        cancel: function() {
    	            // nothing to do
    	        }
    	    });
        }else{
        	 ShowAlert('提示消息', '无法选中该项');
        }
    });

    $('#add-btn').on('click', function(){
        clearFormData('#edit-form');
        openEditModal();
    });

    function openEditModal() {
        $('#edit-box').modal({}).off('click','#save-btn').on('click','#save-btn', function (event) {
            var $target = $(event.target); //targetId = $target.prop('id');
            update${className}();
        });
    }

    $('#search-form').on('submit', function (event) {
        excuteQuery();
    }).on('click', '#search-btn', function (event) {
        excuteQuery();
    });

    function update${className}(){
    	if(formValidator.validate()) {
    		var data = converForm2Obj('edit-form'),
            action = !!data.id ? 'update.do' : 'save.do';
            $.ajax({
                type: 'POST',
                url:  contextPath + '${classNameFirstLower}/' + action,
                dataType: 'json',
                data: data,
                success: function(response){
                    if(response.code === 0 || response.code === 1)
                    {
                    	ShowAlert('提示消息', '更新成功');
                        $('#edit-box').modal('hide');
                        excuteQuery();
                    }else{
                    	ShowAlert('提示消息', '更新失败');
                    }
                }
            });
    	}
    }

//    logic
    setTimeout(function () {
    	ricepon.buildSelectDropDown({
            $targetElement: $('#brandId'),
            needOption: true, //是否需要默认的 --请选择-- 选项
            valueField: 'id', //option value值的属性名
            displayField: 'brandName', // option 选择显示的值或者 function(data)
            dataArray: brandList,
        });
    	
        ricepon.buildSelectDropDown({
            $targetElement: $('#brandId-search'),
            needOption: true, //是否需要默认的 --请选择-- 选项
            valueField: 'id', //option value值的属性名
            displayField: 'brandName', // option 选择显示的值或者 function(data)
            dataArray: brandList,
        });
    }, 500);

//    initGrid();
    initDataTable();
    
    $('.form_datetime').each(function (index, element) {
        var $element = ricepon.isJQueryObj(element) ? element : $(element);
        console.log($element.data('minView'));
        $element.datetimepicker({
            format: $element.data('dateFormat'),
            minView: $element.data('minView'),
            autoclose: true,
            todayBtn: true,
       });
    });
    
    var formValidator = $('#edit-form').parsley();
})();