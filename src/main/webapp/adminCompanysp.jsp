<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/16
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./static/layui/css/layui.css"  media="all">

</head>
<body>
<script src="./static/layui/layui.js" charset="utf-8"></script>


<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
    <legend>企业用户表格</legend>
</fieldset>

<div class="layui-row">
    <div class="layui-col-xs3">
        <div class="grid-demo grid-demo-bg1">
            <%--占左边三份--%>
                <%-----------------------------------------------------%>
            <table class="layui-table" lay-skin="line"   >

                <div class="layui-form-item">
                    <label class="layui-form-label">企业名称</label>
                    <div class="layui-input-inline">
                        <input type="cpyname" name="cpyname" required lay-verify="required"  value="${company.cpyname}"    placeholder="请输入企业名称" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">企业账号</label>
                    <div class="layui-input-inline">
                        <input type="cpyaccount" name="cpyaccount" required lay-verify="required"    value="${company.cpyaccount}" placeholder="请输入账户" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">企业密码</label>
                    <div class="layui-input-inline">
                        <input type="cpypassword" name="cpypassword" required lay-verify="required"    value="${company.cpypassword}" placeholder="请输入账户" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-form-item">
                    <label class="layui-form-label">企业电话</label>
                    <div class="layui-input-inline">
                        <input type="cpyphone" name="cpyphone" required lay-verify="required"  value="${company.cpyphone}" placeholder="请输入电话号码" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">企业地址</label>
                    <div class="layui-input-inline">
                        <input type="cpyaddress" name="cpyaddress" required lay-verify="required"   value="${company.cpyaddress}"  placeholder="请输入地址" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-form-item">
                    <label class="layui-form-label">企业简介</label>
                    <div class="layui-input-inline">
                        <input type="cpyinfo" name="cpyinfo" required lay-verify="required"  value="${company.cpyinfo}" placeholder="请输入公司简介" autocomplete="off" class="layui-input">
                    </div>
                </div>

            </table>


           <%-----------------------------------------------------%>
        </div>
    </div>
    <div class="layui-col-xs9">
        <div class="grid-demo">
                <legend>企业职位列表</legend>
            <%--占右边九份--%>
            <%-----------------------------------------------------%>
            <table class="layui-table" lay-skin="line">
                <colgroup>
                    <col width="150">
                    <col width="150">
                    <col width="200">
                    <col>
                </colgroup>
                <thead>
                <tr>
                    <th>职位名称</th>
                    <th>工资</th>
                    <th>职位要求</th>
                    <th>工作地址</th>
                    <th>工作时间</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${company.occupations}" var="occupation">
                    <tr>
                        <td>${occupation.ocname}</td>
                        <td>${occupation.salary}</td>
                        <td>${occupation.requirement}</td>
                        <td>${occupation.workplace}</td>
                        <td>${occupation.worktime}</td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
                <%-----------------------------------------------------%>
        </div>
    </div>
</div>





</body>
</html>


