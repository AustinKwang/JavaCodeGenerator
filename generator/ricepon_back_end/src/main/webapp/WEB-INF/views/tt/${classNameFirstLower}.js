/**
 * Created by austin
 */
(function(){
    function initGrid(){
        $('#${classNameFirstLower}-table').jqGrid({
            url: contextPath + '/${classNameFirstLower}/query4Page.do',
            datatype: 'json',
            mtype: 'GET',
            rownumbers: true,
            height: 800,
            autoWidth: true,
            width:null,
            shrinkToFit:false,
            viewrecords:true,
            caption: '',
            colModel: [
            	<#list table.columns as column>
                {label: '${column.remarks}', name:'${column.columnNameFirstLower}', searchoptions:{sopt:['eq','ne','le','lt','gt','ge']}},
                </#list>
                {label:'操作', name:'opt', width: 230, formatter: function(cellvalue, options, rowObject){
                    var ${classNameFirstLower}Id = rowObject.${table.onePKColums.columnNameFirstLower},
                        showHTML = '<div class="btn-group">'
                            + '<input type="button" class="update-btn grid-btn btn " value="修改" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />'
                            + '<input type="button" class="delete-btn grid-btn btn" value="删除" data-${classNameLowerCase}-id="' + ${classNameFirstLower}Id + '" />';
                    return showHTML;
                }}
            ],
            jsonReader : {
                root : "rows",
                page: "page",
                total: "total",
                records : "records",
                repeatitems : false
            },
            rowNum:10,
            rowList:[10,20,30],
            pgbuttons: true, // 分页按钮
            pgtext: "第{0}页 共{1}页",
            pager : '#gridPager',
            serializeGridData : function (postData) {
                postData.queryParam = JSON.stringify(converForm2Obj('search-form'));
                return postData;
            }
        }).trigger("reloadGrid").jqGrid('navGrid','#gridPager',{edit:false,add:false,del:false,search:true},{},
            {},
            {},
            {multipleSearch:true});
    }
    
    function excuteQuery(){
        $('#${classNameFirstLower}-table').jqGrid('setGridParam',{
            url: contextPath + '/${classNameFirstLower}/query4Page.do',
            mtype: 'GET',
            page:1
        }).trigger("reloadGrid"); //重新载入
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
                if(response.code == 0) {
                    var data = response.data;
                    <#list table.columns as column>
                    <#if column.pk>
                    $('#${classNameFirstLower}Id').val(data.${column.columnNameFirstLower});
                		<#else>
                    //$('#${column.columnNameFirstLower}').val(data.${column.columnNameFirstLower});
                	</#if>
                    </#list>
                    convertData2FormItem(data, 'edit-form');
                }
            }
        });
        openEditModal();
    }).on('click', '.delete-btn', function(){
        var $target = $(event.target), ${classNameFirstLower}Id = $target.data('${classNameFirstLower}Id')
        content = '确定要删除?'
        ;
	    $.confirm({
	        content: content,
	        title: "提示!",
	        confirmButton: '确定',
	        cancelButton: '取消',
	        post: false,
	        submitForm: false,
	        dialogClass: "modal-dialog",
	        confirm: function() {
	            $.ajax({
	                type: "POST",
	                url: contextPath + 'restaurantInfo/deleteByPK.do',
	                dataType: "json",
	                data: {
	                	${classNameFirstLower}Id: ${classNameFirstLower}Id,
	                },
	                success: function (response) {
	                    if(!!response && response.code){
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

    function clearFormData(formId){
        $(formId + ' input[type="text"]').val('');
        $(formId + ' textarea').val('');
        $(formId + ' input[type="textarea"]').val('');
        $(formId + ' input[type="checkbox"]').attr('checked', false);
        $(formId + ' input[type="radio"]').attr('checked', false);
        $(formId + ' img').attr('src', '');
    }

    function converForm2Obj(formId){
        var data = {}, dataArray = $('#' + formId).serializeArray();
        $.each(dataArray, function() {
            var val = this.value;

            if (data[this.name] !== undefined) {
                if (!data[this.name].push) {
                    data[this.name] = [data[this.name]];
                }
                data[this.name].push(val || '');
            } else {
                data[this.name] = val || '';
            }
        });
        return data;
    }



    function update${className}(){
        var data = converForm2Obj('edit-form'),
        action = !!data.id ? 'update.do' : 'save.do';
        $.ajax({
            type: "post",
            url:  contextPath + '/${classNameFirstLower}/' + action,
            dataType: "json",
            data: data,
            success: function(data){
                if(data.code == 0 || data.code == 1)
                {
                    alert('更新成功');
                    $('#edit-box').modal('hide');
                    excuteQuery();
                }else{
                    alert('更新失败');
                }
            }
        });
    }

    //logic
    initGrid();
})();