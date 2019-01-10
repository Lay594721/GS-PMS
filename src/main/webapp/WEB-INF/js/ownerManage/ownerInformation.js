var rootPath;
$(function(){
    rootPath = $('#absolutePath').val();

    $('#td').bootstrapTable({
        url: rootPath+'/ownerManage/queryOwnerList',         //请求后台的URL（*）
        method: 'post',
        dataType: "json",
        // toolbar: '#toolbar',                //工具按钮用哪个容器
        striped: false,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
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
            {field: 'o_number',title: '业主编号',align : 'center'},
            {field: 'o_name',title: '姓名',align : 'center'},
            {field: 'o_sex',title: '性别',align : 'center'},
            {field: 'o_carder',title: '证件号码',align : 'center'},
            {field: 'o_phone',title: '手机号码',align : 'center'},
            {field: 'o_jdata',title: '购房时间',align : 'center'},
            {field: 'o_check_date',title: '入住日期',sortable:true,align : 'center'},
            {field: 'o_state',title: '状态',align : 'center'},
            {field: '',title: '操 作',align : 'center',formatter:function(value,row,index){
                    var del=' <button type="button"  class="btn btn-info btn-sm" data-dismiss="modal" onclick="del();">家庭成员<tton>';
                    var updt='<button type="button"  class="btn btn-info btn-sm" data-dismiss="modal" onclick="update("+obj+");">房产登记<tton>';

                    return del+updt;
                }
            } ]
    });
});



