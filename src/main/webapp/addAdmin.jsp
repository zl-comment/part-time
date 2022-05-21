<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/5/21
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
      <link rel="stylesheet" href="./static/layui/css/layui.css"  media="all">
  </head>
  <script src="./static/layui/layui.js" charset="utf-8"></script>
  <script src="./static/js/jquery.min.js"></script>

  <script>
      layui.use('form', function(){
          var form = layui.form;
          form.on('submit(formDemo)', function(data){
              layer.msg(JSON.stringify(data.field));
              $.ajax({
                  url:'addAdmin'
                  ,method:'post'
                  ,data:{admin:JSON.stringify(data.field)}
                  ,success:function () {
                      layer.alert("成功");
                  },
                  error:function () {
                      layer.alert("失败");
                  }
              })
             // return false;
          });
      });
  </script>
  <body>
  <form class="layui-form" action="" onsubmit="return true">
      <div class="layui-form-item">
          <label class="layui-form-label">账号名称</label>
          <div class="layui-input-block">
              <input type="text" name="adminname" required  lay-verify="required" placeholder="请输入名称" autocomplete="off" class="layui-input">
          </div>
      </div>
      <div class="layui-form-item">
          <label class="layui-form-label">密码框</label>
          <div class="layui-input-block">
              <input type="password" name="adminpassword" required  lay-verify="required" placeholder="请输入密码框内容" autocomplete="off" class="layui-input">
          </div>
      </div>
      <div class="layui-form-item">
          <label class="layui-form-label">电话</label>
          <div class="layui-input-block">
              <input type="text" name="adminphone" required  lay-verify="required" placeholder="请输入联系方式" autocomplete="off" class="layui-input">
          </div>
      </div>
      <div class="layui-form-item">
          <div class="layui-input-block">
              <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
              <button type="reset" class="layui-btn layui-btn-primary">重置</button>
          </div>
      </div>
  </form>
  </body>
</html>
