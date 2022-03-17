<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/15
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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

<%--<input type="submit" value="提交">--%>
<%--密码:<input type="password" name="password"><br>--%>

<form  class="layui-form" action="StudentServlet?method=updateinfo" method="post" enctype="multipart/form-data">
    <div class="layui-form-item">
        <label class="layui-form-label">账户名称</label>
        <div class="layui-input-block">
            <input type="text" name="staccount" lay-verify="title" autocomplete="off" placeholder="请输入您的账户名" value="${student.staccount}" class="layui-input">
        </div>
    </div>
    <%--<div class="layui-form-item layui-form-text">
        <label class="layui-form-label">个性签名</label>
        <div class="layui-input-block">
            <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
        </div>
    </div>--%>
    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">手机号</label>
            <div class="layui-input-inline">
                <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" placeholder="请输入您的手机号" value="${student.stphone}" class="layui-input">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">修改密码</label>
            <div class="layui-input-inline">
                <input type="text" name="stpassword" lay-verify="title" autocomplete="off" placeholder="请输入原密码" value="${student.stpassword}" class="layui-input"><br>
                <input type="password" name="" lay-verify="password" placeholder="请输入新密码" class="layui-input"><br>
                <input type="password" name="" lay-verify="password" placeholder="确认密码" class="layui-input"><br>
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学校名称</label>
            <div class="layui-input-block">
                <input type="text" name="school" lay-verify="title" autocomplete="off" placeholder="请输入您的学校名称" value="${student.stschool}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">专业名称</label>
            <div class="layui-input-block">
                <input type="text" name="major" lay-verify="title" autocomplete="off" placeholder="请输入您的专业名称" value="${student.stmajor}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">学制</label>
            <div class="layui-input-block">
                <input type="text" name="state" lay-verify="title" autocomplete="off" placeholder="请输入专业学制" value="${student.stsystem}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
        <label class="layui-form-label">入学日期</label>
        <div class="layui-input-block">
            <input name="date" type="date" class="dfinput" value="${student.stdate}" style="width:518px;"/></div>
    </div>


    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">籍贯</label>
        <div class="layui-input-inline">
            <select name="quiz2">
                <option value="">请选择市</option>
                <option value="杭州">太原</option>
                <option value="宁波" disabled="">临汾</option>
                <option value="温州">大同</option>
                <option value="温州">忻州</option>
                <option value="温州">运城</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="quiz3">
                <option value="">请选择县/区</option>
                <option value="西湖区">西湖区</option>
                <option value="余杭区">余杭区</option>
                <option value="拱墅区">临安市</option>
            </select>
        </div>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>



</body>
</html>