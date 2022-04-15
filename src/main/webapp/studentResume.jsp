<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/20
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./static/layui/css/layui.css" media="all">
</head>
<body>
<table class="layui-table" lay-skin="line">
    <colgroup>-
        <col width="50px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>名字</th>
        <th>年龄</th>
        <th>头像</th>
        <th>地址</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>兴趣爱好</th>
        <th>专业</th>
        <th>工作经理</th>
        <th>自我评价</th>
    </tr>
    </thead>
 <%--   <colgroup>
        <col width="100px">
        <col width="250px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col>
    </colgroup>--%>
    <tbody>
        <tr>
            <td>${resume.name}</td>

            <td>${resume.age}</td>
            <td>${resume.imaurl}</td>
            <td>${resume.address}</td>
            <td>${resume.email}</td>
            <td>${resume.hobby}</td>
            <td>${resume.major}</td>
            <td>${resume.workExperience}</td>
            <td>${resume.selfEvaluation}</td>
            <td>
                <a href="#" class="tablelink">查看</a>
                <a class="tablelink"> 删除</a>
            </td>
        </tr>
    </tbody>
</table>
<script src="./static/layui/layui.js" charset="utf-8"></script>
<script>


</script>

</body>

</html>
