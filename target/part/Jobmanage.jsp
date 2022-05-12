<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/15
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%><!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
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


</colgroup>
<thead>
            <tr>
                <th ></th>
                <th>招聘职位</th>
                <th>招聘薪水</th>
                <th>工作地点</th>
                <th>工作要求</th>
                <th>操作</th>
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

    <c:forEach items="${occupations}" var="oc">
<tr>



    <td> <span class="layui-badge">*</span></td>
    <td>  <span>${oc.ocname}</span></td>
                  <td><span>${oc.salary}</span></td>
                   <td><span>${oc.workplace}</span></td>
                  <td><span>${oc.requirement}</span></td>
                  <td ><span class="con" style="color: red"><a href="jobQuery?ocid=${oc.id}&&companyid=${companyid}">查看&nbsp;</a></span>
    </td>




</tr>
        </c:forEach>


</tbody>
</table>
<script src="./static/layui/layui.js" charset="utf-8"></script>
</body>
</html>
