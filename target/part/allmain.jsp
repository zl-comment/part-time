<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/4/13
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/13
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
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
    //  alert(Roleid);
      $.ajax({
        url:"selectPermission",
        method: "post",
        data: {
          Roleid:Roleid
        },
        dataType: "json",
        //    <dd><a id="mytab"  href="adminCompaniesList.jsp"   data-id="1" target="iFrm">企业列表</a></dd>
        success:function (data) {
       //    alert(data);
          var str = "";
          for (var i = 0; i < data.length; i++) {
              //  alert(data[i].permname.indexOf("企业"));
              str += "<li class=\"layui-nav-item\"><a id='mytab'  href='"+data[i].permurl+"'   data-id='"+data[i].id+"' target='iFrm'>"+data[i].permname+"</a></li>";
          }
          $("#user").html(str);
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
    <div class="layui-logo">个人中心</div>
    <ul class="layui-nav layui-layout-right" lay-filter="nav_header_right">
      <li class="layui-nav-item">
        <a href="javascript:">
          <img src="./static/layui/images/face/0.gif" class="layui-nav-img" alt="">
          用户名       <%--  用户名 --%>
        </a>
        <dl class="layui-nav-child">
          <dd><a href="https://www.baidu.com/">基本资料</a></dd>
          <dd>
            <select class="layui-select">

              <option value="" selected="selected">请选择角色</option>
              <c:forEach items="${user.roleList}" var="role" >
                   <option value="${role.id}">${role.rname}</option>
              </c:forEach>
            </select>
          </dd>
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
        <li class="layui-nav-item "><a <%--ref="allHome.jsp" data-id="nav_home"  target="iFrm"--%>>首页</a></li>

        <li class="layui-nav-item layui-nav-itemed">
          <a >用户管理</a>
          <dl class="layui-nav-child" id="user">
          <%--  ${user}--%>

          </dl>
        </li>



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
            <iframe iframe-id="home"  name="iFrm"   frameborder="0" src="index.jsp"></iframe>
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