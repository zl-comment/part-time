<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/15
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">

</head>
<body>
<table class="layui-hide" id="demo"></table>
<script src="layui/layui.js" charset="utf-8"></script>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>企业用户表格</legend>
</fieldset>


<table class="layui-table" lay-skin="line">
    <colgroup>
        <col width="150">
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>企业名称</th>
        <th>账户</th>
        <th>联系方式</th>
        <th>公司地址</th>
        <th>公司简介</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${companies}" var="company">
        <tr>
            <td>${company.cpyname}</td>
            <td>${company.cpyaccount}</td>
            <td>${company.cpyphone}</td>
            <td>${company.cpyaddress}</td>
            <td>${company.cpyinfo}</td>
            <td>
                <div class="layui-btn-group">
                 <a href="AdminServlet?method=getCompanyByIdAndOccupation&&companyid=${company.id}" class="layui-btn"  >查看</a>
                </div>
            </td>

        </tr>
    </c:forEach>

    </tbody>
</table>
<div id="demo0"></div>

<script>
    layui.use(['laypage', 'layer'], function() {
            var laypage = layui.laypage
                , layer = layui.layer;

            //总页数低于页码总数
            laypage.render({
                elem: 'demo0'
                , count: 50 //数据总数
                ,page: true
            });
        }
    )
</script>
</body>
</html>
