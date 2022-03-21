<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/16
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="../layui/dist/css/layui.css" media="all">
</head>
<body>
<table class="layui-table" lay-skin="line">
    <colgroup>
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
        <th>编号</th>
        <th>职位名称</th>
        <th>工资</th>
        <th>工作地点</th>
        <th>工作时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <colgroup>
        <col width="100px">
        <col width="250px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col width="150px">
        <col>
    </colgroup>
    <tbody>
    <c:forEach items="${occupations}" var="occupation"  varStatus="num">
        <tr>
            <td>${num.index+1}</td>
            <td>${occupation.ocname}</td>
            <td>${occupation.salary}</td>
            <td>${occupation.workplace}</td>
            <td>${occupation.worktime}</td>
            <td><a href="StudentServlet?method=deleteOccupationsByIdStudent&stuandocid=${occupation.stuandocid}&studentid=${studentid}" class="tablelink"> 删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="../layui/layui.js" charset="utf-8"></script>
<script>

</script>


<%--<table class="tablelist">
    <thead>
    <tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>编号</th>
        <th>职位名称</th>
        <th>工资</th>
        <th>工作地点</th>
        <th>工作时间</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${occupations}" var="occupation"  varStatus="num">
        <tr>
            <td><input name="" type="checkbox"/></td>
            <td>${num.index+1}</td>
            <td>${occupation.ocname}</td>
            <td>${occupation.salary}</td>
            <td>${occupation.workplace}</td>
            <td>${occupation.worktime}</td>
            <td><a href="#" class="tablelink">查看</a>
            <a href="StudentServlet?method=deleteOccupationsByIdStudent&stuandocid=${occupation.stuandocid}&studentid=${studentid}" class="tablelink"> 删除</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>--%>



</body>

</html>
