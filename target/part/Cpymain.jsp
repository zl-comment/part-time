<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/13
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>个人中心</title>
    <script type="text/javascript" src="./static/js/common/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" href="./static/layui/css/layui.css"/>
    <script type="text/javascript" src="./static/layui/layui.js"></script>
    <link type="text/css" rel="stylesheet" href="./static/css/index.css"/>
    <script type="text/javascript" src="./static/js/pages/index.js"></script>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">个人中心</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->

        <ul class="layui-nav layui-layout-right" lay-filter="nav_header_right">
            <li class="layui-nav-item">
                <a href="javascript:">
                    <img src="./static/layui/images/face/0.gif" class="layui-nav-img" alt="">
                    ${company.cpyaccount}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="javascript:" data-id="logout">退出</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-inline" lay-filter="nav_left">

                <li class="layui-nav-item"><a href="Jobpublish.jsp" target="ifram"  data-id="1">发布招聘</a></li>
                <li class="layui-nav-item"><a href="OccupationServlet?method=getOccupations&&companyid=${company.id}" target="ifram" data-id="2"  >招聘管理</a></li>
                <li class="layui-nav-item"><a href="CompanyServlet?method=getAdmissionById&&companyid=${company.id}" target="ifram">报名管理</a></li>
                <li class="layui-nav-item"><a href="CompanyServlet?method=getCompanyById&&companyid=${company.id}" target="ifram" data-id="3">公司信息</a></li>
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
                        <iframe iframe-id="home" name="ifram" frameborder="0" src="home.html"></iframe>
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