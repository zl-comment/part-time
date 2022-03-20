<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/13
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <div class="layui-logo">个人中心</div>
        <ul class="layui-nav layui-layout-right" lay-filter="nav_header_right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="./layui/images/face/0.gif" class="layui-nav-img">
                    leaf        <%--  用户名 --%>
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
               <%-- <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">个人信息</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="nav_demo" src="demo.html"></a></dd>
                        <dd><a href="javascript:;"></a></dd>
                        <dd><a href="javascript:;"></a></dd>
                        <dd><a href="">跳转项</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">账号信息</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">移动模块</a></dd>
                        <dd><a href="">后台模版</a></dd>
                        <dd><a href="">电商平台</a></dd>
                    </dl>
                </li>--%>

                <li class="layui-nav-item"><a href="StudentServlet?method=getStudentInfoById&&id=${student.id}" data-id="1" target="iFrm">我的信息</a></li>
                <li class="layui-nav-item"><a href="ResumeServlet?method=getStudentResumeById&&id=${student.stresumeid}" target="iFrm"  data-id="3">我的简历</a></li>
                <li class="layui-nav-item"><a href="StudentServlet?method=getOccupations&&id=${student.id}" target="iFrm" data-id="4">我的兼职记录</a></li>
            </ul>
        </div>
    </div>
<%--

    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script>
        $(document).ready(function() {
            undefined
            $("dd>a").click(function (e) {
                undefined
                e.preventDefault();
                $("#iframeMain").attr("src", $(this).attr("href"));
            });
        });
    </script>
--%>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 5px;">

            <div class="layui-tab" lay-allowClose="true" lay-filter="main_tab">
                <ul class="layui-tab-title">
                    <li class="layui-this" lay-id="nav_home">首页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <iframe iframe-id="home"  name="iFrm"   frameborder="0" src="home.html"></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>




<%--    --%>





    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © leaf - XXX有限公司
    </div>
</div>
</body>
</html>