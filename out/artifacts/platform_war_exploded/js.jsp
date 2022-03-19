<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/15
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学习LayUI</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script src="layui/layui.js"></script>


    <style rel="stylesheet" type="text/css">
        .layui-tab-title li:first-child > i {
            display: none;
        }
    </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header ">
        <div class="layui-logo">
            <i class="layui-icon" style="font-size: 26px; color: #1E9FFF;">&#xe857;</i>
            XX综合管理系统
        </div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item">
                <a href="">控制台</a>
            </li>
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
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="">控制台<span class="layui-badge">9</span></a>
            </li>
            <li class="layui-nav-item">
                <a href="">个人中心<span class="layui-badge">3</span></a>
            </li>
            <li class="layui-nav-item">
                <a href="http://www.shuyangyang.com.cn">关于系统</a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    束洋洋
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                    <dd><a href="">退出</a></dd>
                </dl>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="left-menu">
                <li class="layui-nav-item ">
                    <a class="" href="javascript:;"><i class="layui-icon" style="margin-right: 5px">&#xe620;</i>系统管理</a>
                    <dl class="layui-nav-child">
                        <dd id="S001" name="form.html"><a href="AdminServlet?method=getCompanies" target="iFrm">用户管理</a></dd>
                        <dd id="S002" name="http://www.baidu.com"><a href="javascript:;">角色管理</a></dd>
                        <dd id="S003" name=""><a href="javascript:;">部门管理</a></dd>
                        <dd id="S004" name="http://www.shuyangyang.com.cn"><a href="AdminServlet?method=getStudents" target="iFrm">作者网站</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item ">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">列表一</a></dd>
                        <dd><a href="javascript:;">列表二</a></dd>
                        <dd><a href="">超链接</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">发布商品</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body" style="bottom: 0px;">
        <div style="padding-left: 15px">
            <!-- 内容主体区域 -->
            <div class="layui-tab" lay-allowClose="true" lay-filter="tab-switch">
                <ul class="layui-tab-title"  lay-allowClose="true">
                    <li class="layui-this " >首页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <iframe name="iFrm"   frameborder="0" src="index.html"  sandbox ></iframe>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
</div>
<script>
    var element;
    var $;
    layui.use(['element','jquery'],function(){
        element = layui.element;
            $ = layui.jquery;
        //监听左侧菜单点击
        element.on('nav(left-menu)', function(elem){
            alert(elem.context.attributes+"sss");
            addTab(elem[0].innerText,elem[0].attributes[1].nodeValue,elem[0].id);

        });
        //监听tab选项卡切换
        element.on('tab(tab-switch)', function(data){

            var id = data.elem.context.attributes[0].nodeValue;
            layui.each($(".layui-nav-child"), function () {
                $(this).find("dd").removeClass("layui-this");
            });
            $("#"+id).attr("class","layui-this");

        });
    });

    /**
     * 新增tab选项卡，如果已经存在则打开已经存在的，不存在则新增
     * @param tabTitle 选项卡标题名称
     * @param tabUrl 选项卡链接的页面URL
     * @param tabId 选项卡id
     */
    function addTab(tabTitle,tabUrl,tabId){
        if ($(".layui-tab-title li[lay-id=" + tabId + "]").length > 0) {
            element.tabChange('tab-switch', tabId);
        }else{
            element.tabAdd('tab-switch', {
                title: tabTitle
                ,content: '<iframe src='+tabUrl+' width="100%" style="min-height: 1000px;" frameborder="0" scrolling="auto" onload="setIframeHeight(this)"></iframe>' // 选项卡内容，支持传入html
                ,id: tabId //选项卡标题的lay-id属性值
            });
            element.tabChange('tab-switch', tabId); //切换到新增的tab上
        }
    }

    /**
     * ifrme自适应页面高度，需要设定min-height
     * @param iframe
     */
    function setIframeHeight(iframe) {
        if (iframe) {
            var iframeWin = iframe.contentWindow || iframe.contentDocument.parentWindow;
            if (iframeWin.document.body) {
                iframe.height = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
            }
        }
    };
</script>
</body>
</html>
