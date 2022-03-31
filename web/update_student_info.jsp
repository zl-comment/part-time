<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/15
  Time: 10:06
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
    <link rel="stylesheet" href="../layui/css/layui.css"  media="all">
</head>
<body>

<form  class="layui-form" action="StudentServlet?method=updateinfoStudent" method="post" >
    <input type="hidden" name="id" value="${id}"/>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">账户名称</label>
            <div class="layui-input-block">
                <input type="text" name="staccount" lay-verify="title" autocomplete="off" placeholder="请输入您的账户名" value="${student.staccount}" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="tel" name="stphone" lay-verify="required|phone" autocomplete="off" placeholder="请输入您的手机号" value="${student.stphone}" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">修改密码</label>
            <div class="layui-input-inline">
                <input type="text" name="stpassword" lay-verify="title" autocomplete="off" placeholder="请输入原密码" value="${student.stpassword}" class="layui-input"><br>
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">学校名称</label>
            <div class="layui-input-block">
                <input type="text" name="stschool" lay-verify="title" autocomplete="off" placeholder="请输入您的学校名称" value="${student.stschool}" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">专业名称</label>
            <div class="layui-input-block">
                <input type="text" name="stmajor" lay-verify="title" autocomplete="off" placeholder="请输入您的专业名称" value="${student.stmajor}" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">学制</label>
            <div class="layui-input-block">
                <input type="text" name="stsystem" lay-verify="title" autocomplete="off" placeholder="请输入专业学制" value="${student.stsystem}" class="layui-input">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">入学日期</label>
            <div class="layui-input-block">
                <input name="stdate" type="date" class="dfinput" value="${student.stdate}" style="width:518px;"/>
            </div>
        </div>
    </div>00

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">修改</button>
        </div>
    </div>
</form>

</body>
</html>
