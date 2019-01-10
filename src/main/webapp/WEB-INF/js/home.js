var rootPath;
$(function(){
    rootPath = $('#absolutePath').val();

    $('#td').bootstrapTable({
        url: rootPath+'/Index/ModelList',         //请求后台的URL（*）
        method: 'post',
        dataType: "json",
        // toolbar: '#toolbar',                //工具按钮用哪个容器
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
      /*  pageList: [5,10, 25, 50],                   //可供选择的每页的行数（*）,*/
        sortable: true,                     //是否启用排序
        sortOrder: "desc",                   //排序方式
        sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber:1,                       //初始化加载第一页，默认第一页
        pageSize: 10,                       //每页的记录行数（*）
        showRefresh: true,                  //是否显示刷新按钮
        clickToSelect: true,                //是否启用点击选中行
        height: 665,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
        singleSelect: true,                  //开启单选
        search : true,                         //自动补全


        columns: [
            {field:'',checkbox:true,width:'3%'},
            {field: 'id',title: 'ID',sortable:true,align : 'center'},//sortable:true 排序
            {field: 'pid',title: 'PID',align : 'center'},
            {field: 'text',title: '名称',align : 'center'},
            {field: 'url',title: 'URL',align : 'center'},
            {field: '',title: '操 作',align : 'center',formatter:function(value,row,index){
                    var del=' <button type="button" class="btn btn-default" data-dismiss="modal" onclick="del();">家庭成员<tton>';
                    var updt='<button type="button" class="btn btn-default" data-dismiss="modal" onclick="update("+obj+");">房产登记<tton>';

                    return del+"&nbsp;"+updt;
                }
            } ]
    });
});



