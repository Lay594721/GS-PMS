<%--
  Created by IntelliJ IDEA.
  User: Lay
  Date: 2019/1/8
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body >
<!DOCTYPE html>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <meta charset="utf-8">


    <link rel="stylesheet" href="bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap/bootstrap-table-master/dist/bootstrap-table.css">

    <script src="bootstraps/js/jquery.min.js"></script><%--jquery--%>
    <script src="bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script src="bootstrap/bootstrap-table-master/dist/bootstrap-table.min.js"></script>
    <script src="bootstrap/bootstrap-table-master/dist/extensions/export/bootstrap-table-export.js"></script>

    <script src="bootstrap/bootstrap-table-master/dist/bootstrap-table.js"></script>
    <!-- 表格的分页为中文的 -->
    <script src="bootstrap/bootstrap-table-master/dist/locale/bootstrap-table-zh-CN.js"></script>

    <!-- 表单验证 -->
    <link href="bootstrapvalidator-master/bootstrapvalidator-master/dist/css/bootstrapValidator.min.css" rel="stylesheet" />
    <script src="bootstrapvalidator-master/bootstrapvalidator-master/dist/js/bootstrapValidator.min.js"></script>

    <script src="js/home.js"></script>

</head>
<body>


<table id="td" class="table table-bordered text-center">

</table>


</body>

</html>
