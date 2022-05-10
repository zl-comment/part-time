
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>首页</title>
    <script type="text/javascript" src="./static/js/common/jquery.min.js"></script>
    <link type="text/css" rel="stylesheet" href="./static/layui/css/layui.css"/>
    <script type="text/javascript" src="./static/layui/layui.js"></script>
    <link type="text/css" rel="stylesheet" href="./static/css/index.css"/>
   <script type="text/javascript" src="./static/js/pages/index.js"></script>
</head>

<script>
    //select选择器
    $(function () {
        $(".layui-select").change(function () {
            var Roleid = $(".layui-select").val();
            $.ajax({
                url:"selectPermission",
                method: "post",
                data: {
                    Roleid:Roleid
                },
                dataType: "json",
        //    <dd><a id="mytab"  href="adminCompaniesList.jsp"   data-id="1" target="iFrm">企业列表</a></dd>
            success:function (data) {
                   // alert(data);
                    var str = "";
                    var str1="";
                    for (var i = 0; i < data.length; i++) {
                       if(data[i].permname.indexOf("企业")==0||data[i].permname.indexOf("职业")==0) {
                         //  alert(data[i].permname.indexOf("企业"));
                           str += "<dd><a id='mytab'  href='"+data[i].permurl+"'   data-id='"+data[i].id+"' target='iFrm'>"+data[i].permname+"</a></dd>";
                       }else{
                           str1 += "<dd><a id='mytab'  href='"+data[i].permurl+"'   data-id='"+data[i].id+"' target='iFrm'>"+data[i].permname+"</a></dd>";

                       }
                    }
                    $("#company").html(str);
                    $("#student").html(str1);
                layui.use('element', function() {
                    var element = layui.element;
                    element.init();
                });
                }

            })

        });
    });




</script>



<body class="layui-layout-body">

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">兼全职平台管理系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="" >控制台</a></li>
            <li class="layui-nav-item"><a href="" > 商品管理</a></li>
            <li class="layui-nav-item"><a href="">用户</a></li>
            <li class="layui-nav-item">
                <a href="javascript:">其它系统</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="nav_header_right">
            <li class="layui-nav-item">
                <a href="javascript:">
                    <img src="./static/layui/images/face/0.gif" class="layui-nav-img" alt="">
                    ${admin.adminname}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="https://www.baidu.com/">基本资料</a></dd>
                    <dd>
                        <select class="layui-select">
                            <option value="" selected="selected">请选择角色</option>
                            <c:forEach items="${user.roleList}" var="role" >
                       <option value="${role.id} " >${role.rname}</option>
                            </c:forEach>
                        </select>
                    </dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="javascript:" data-id="logout">退出</a></li>
        </ul>
    </div>


//
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree layui-inline"  lay-filter="nav_left">
                <%--为了让页面展示在内页面中，target=“与主题页面的iframe的name相同”--%>
                <%--src与href有区别--%>
                <li class="layui-nav-item "><a <%--ref="allHome.jsp" data-id="nav_home"  target="iFrm"--%>>首页</a></li>

                <li class="layui-nav-item layui-nav-itemed">
                    <a >企业用户管理</a>
                    <dl class="layui-nav-child" id="company">

                        <%--<dd><a id="mytab"  href="adminCompaniesList.jsp"   data-id="1" target="iFrm">企业列表</a></dd>
                        <dd><a id="mytab"  href="adminCompanyPass.jsp"     data-id="2" target="iFrm">企业审核</a></dd>
                        <dd><a id="mytab"  href="adminOccupationPass.jsp"  data-id="3" target="iFrm">职业审核</a></dd>
                        <dd><a id="mytab"  href=""  data-id="4" target="iFrm">企业角色管理</a></dd>--%>
                    </dl>
                </li>
                    <li class="layui-nav-item layui-nav-itemed">
                        <a >学生用户管理</a>
                        <dl class="layui-nav-child" id="student">
                      <%--      <dd><a href="adminStudentList.jsp" data-id="5" target="iFrm">学生列表</a></dd>
                            <dd><a href="javascript:">学生审核</a></dd>
                            <dd><a href="javascript:">学生角色管理</a></dd>--%>
                        </dl>
                    </li>
       <%--         <li class="layui-nav-item">
                    <a href="javascript:">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="  ">移动模块</a></dd>
                        <dd><a href="  ">后台模版</a></dd>
                        <dd><a href="  ">电商平台</a></dd>
                    </dl>
                </li>--%>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">社区</a></li>
            </ul>
        </div>
    </div>


    //
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 5px;">
            <div class="layui-tab" lay-allowClose="true" lay-filter="main_tab">
                <ul class="layui-tab-title">
                    <li class="layui-this" <%--lay-id="nav_home"--%>  >首页</li>
                </ul>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <%--主页登录之后开始显示的页面--%>
                        <iframe id="home"   name="iFrm" frameborder="0" src="index1.jsp"  ></iframe>
                    </div>
                </div>
            </div>
        </div>
    </div>
  //


    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © leaf - XXX有限公司
    </div>
</div>

</body>
</html>
