<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/13
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>首页</title>
    <script type="text/javascript" src="./js/common/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" href="./layui/css/layui.css"/>
    <script type="text/javascript" src="./layui/layui.js"></script>
    <link type="text/css" rel="stylesheet" href="./css/index.css"/>
    <script type="text/javascript" src="./js/pages/index.js"></script>
</head>

<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">商城管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">控制台</a></li>
            <li class="layui-nav-item"><a href="">商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="nav_header_right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="./layui/images/face/0.gif" class="layui-nav-img">
                    ${admin.adminname}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="javascript:;" data-id="logout">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="nav_left">
                <%--为了让页面展示在内页面中，target=“与主题页面的iframe的name相同”--%>
                <li class="layui-nav-item "><a href="index.html" data-id="nav_home" target="iFrm" >首页</a></li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:">默认展开</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:" data-id="nav_demo" src="">选项一</a></dd>
                        <dd><a href="javascript:">选项二</a></dd>
                        <dd><a href="javascript:">选项三</a></dd>
                        <dd><a href="">跳转项</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">移动模块</a></dd>
                        <dd><a href="">后台模版</a></dd>
                        <dd><a href="">电商平台</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">社区</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 5px;">
            <div class="layui-tab" lay-allowClose="true" lay-filter="main_tab">
                <ul class="layui-tab-title">
                    <li class="layui-this" lay-id="nav_home">首页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <%--主页登录之后开始显示的页面--%>
                        <iframe name="iFrm"  iframe-id="home" frameborder="0" src="home.html"></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © leaf - XXX有限公司
    </div>
</div>
</body>
</html>
