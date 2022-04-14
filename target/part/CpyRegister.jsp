<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/13
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>公司注册界面</title>
    <!--basic_css-->
    <link rel="stylesheet" type="text/css" href="./static/layui/css/layui.css" />
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">
    <style type="text/css">
        body {
            background-image: url(./static/img/lg-bg.jpg);
            background-position: 14px 14px;
            background-repeat: no-repeat;
            background-position: center center;
            background-attachment: fixed;
            background-size: cover;
        }

        .layui-input {
            height: 45px;
            width: 80%;
            padding-left: 5px;
            font-size: 16px;
            display: inline-block;
        }

        .layui-input-checkCode {
            height: 45px;
            width: 52%;
            padding-left: 5px;
            font-size: 16px;
            border: 1px solid rgba(0, 0, 0, .2);
        }

        .layui-btn {
            height: 45px;
        }

        .captcha-input {
            height: 45px;
            padding-left: 5px;
            font-size: 16px;
        }

        .layui-form {
            width: 30%;
            height: 60%;
            margin: 0 auto;
            margin-top: 7%;
            padding: 15px 28px ;
            background: #fff;
        }

        .layui-input-block {
            margin-left: 0;

        }

        .layui-input-block a {
            color: blue;
            float: right;
            line-height: 30px;
            font-size: 14px;
        }

        h1 {
            text-align: center;
            color: #1d598e;
        }

        input.text {
            text-align: center;
            padding: 10px 20px;
            width: 300px;
        }

        #canvas {
            float: right;
            margin-right: 5%;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 5px;
            cursor: pointer;
        }

        .code {
            width: 400px;
            margin: 0 auto;
        }

        .input-val {
            width: 65%;
            height: 45px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid rgba(0, 0, 0, .2);

        }

        .decrib {
            font-size: 16px;
        }

        .tel-code {
            display: inline-block;
            width: 104px;
            color: #fff;
            font-size: 12px;
            border: 1px solid #0697DA;
            text-align: center;
            height: 45px;
            line-height: 45px;
            background: #50c8b6;
            cursor: pointer;
            float: right;
            margin-right: 5%;
        }

        form .msgs1 {
            background: #E6E6E6;
            color: #818080;
            border: 1px solid #CCCCCC;
        }
    </style>
</head>

<script src="./static/js/jquery.min.js"></script>


<script>
    $(function () {

        $("#cpyaccount").blur(function () {
            var cpyaccount=$("#cpyaccount").val();
            $.ajax({
                url:"CompanyServlet?method=cpyaccountIsSame",
                method:"post",
                data:{cpyaccount:cpyaccount},
                success:function (data) {
                    if(data=="false"){
                        $("#msg").html("<font color='green' >√</font>");
                    }else {
                        $("#msg").html("<font color='red' >用户名已经存在</font>");

                    }
                }
            })
        })
    })

</script>






<body>
<form class="layui-form" action="CompanyServlet?method=Register" id="loginForm" method="post">
    <div class="layui-form-item">
        <h1>公&nbsp;司&nbsp;用&nbsp;户&nbsp;注&nbsp;册</h1>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</span>
            <input type="text" name="cpyaccount"   id="cpyaccount"  placeholder="请输入账号" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
        <span id="msg"></span>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
            <input type="password" name="cpypassword" placeholder="请输入密码" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">确认密码：</span>
            <input type="password" name="cpypassword1" placeholder="请再次输入密码" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">公司名称：</span>
            <input type="text" name="cpyname" placeholder="请输入公司名称" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">公司电话：</span>
            <input type="text" name="cpyphone" placeholder="请输入公司电话" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">公司地址：</span>
            <input type="text" name="cpyaddress" placeholder="请输入公司地址" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">公司简介：</span>
            <input type="text" name="cpyinfo" placeholder="请输入公司简介" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
    </div>

    <br>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button  type="submit"  class="layui-btn layui-btn-bypercent-left btn" lay-submit id="submit">注 册</button>
            &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
            <button class="layui-btn layui-btn-bypercent-right" id="reset">取 消</button>
        </div>
    </div>
    <br>
    <br>
</form>
</body>
</html>

