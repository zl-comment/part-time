<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/13
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>学生注册界面</title>
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

        $("#staccount").blur(function () {
            var staccount=$("#staccount").val();
            $.ajax({
                url:"staccountIsSame",
                method:"post",
                data:{staccount:staccount},
                success:function (data) {
                    if(data=="false"){
                        $("#msg").html("<font color='green' >√</font>");
                    }else {
                        $("#msg").html("<font color='red' >用户名已经存在</font>");
                    }

                }
            })
        })

        $("#submit").on('click', function() {

            var staccount=$("#staccount").val();
            var reg1=/^[a-zA-z]\w{3,15}$/;
            if (staccount == "") {
                $("#staccount_info").html("账号不能为空");
                $("#staccount_info").css("color", "red");
                return false;
            } else if (!reg1.test(staccount)) {
                $("#staccount_info").html("账号格式不正确，字母开头 4~16位");
                $("#staccount_info").css("color", "red");
                return false;
            } else {
                $("#staccount_info").html("");
            }


            var psw = $("#stpassword").val();
            var reg = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/;

            if (psw == "") {
                $("#psw_info").html("密码不能为空");
                $("#psw_info").css("color", "red");
                return false;
            } else if (!reg.test(psw)) {
                $("#psw_info").html("密码格式不正确，至少1个大写字母，1个小写字母和1个数字");
                $("#psw_info").css("color", "red");
                return false;
            } else {
                $("#psw_info").html("");
            }

            var stphone=$("#stphone").val();
            var streg=/^1[3-9]\d{9}$/;

            if (stphone == "") {
                $("#stphone_info").html("手机号");
                $("#stphone_info").css("color", "red");
                return false;
            } else if (!streg.test(stphone)) {
                $("#stphone_info").html("手机格式不正确");
                $("#stphone_info").css("color", "red");
                return false;
            } else {
                $("#stphone_info").html("");
            }

            var stsystem=$("#stsystem").val();

            if (stsystem== 4||stsystem== 5) {
                $("#stsystem_info").html("");
            }  else {

                $("#stsystem_info").html("格式不正确");
                $("#stsystem_info").css("color", "red");
                return false;
            }






        })



    })

</script>



<body>
<form class="layui-form"     action="StudentRegister" id="loginForm" method="post">
    <div class="layui-form-item">
        <h1>学生用户注册</h1>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</span>
            <input type="text"   name="staccount"   id="staccount"    placeholder="请输入账号" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
        <span id="msg"></span>
        <span id="staccount_info"></span>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
            <input type="password" name="stpassword"  id="stpassword"   placeholder="请输入密码" autocomplete="off" class="layui-input"
                   required>
        </div>
        <span id="psw_info"></span>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">电&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;话：</span>
            <input type="text" name="stphone" id="stphone"  placeholder="请输入您的电话" autocomplete="off" class="layui-input"
                   required>
        </div>
        <span id="stphone_info"></span>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;校：</span>
            <input type="text" name="stschool" placeholder="请输入您的学校名称" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">专&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;业：</span>
            <input type="text" name="stmajor" placeholder="请输入您的专业名称" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;制：</span>
            <input type="text" name="stsystem"  id="stsystem"   placeholder="4/5" autocomplete="off" class="layui-input"
                   required>
        </div>
        <span id="stsystem_info"></span>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">入学日期：</span>
            <input type="date" name="stdate" placeholder="请输入入学日期" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>
    <br>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button  type="submit"  class="layui-btn layui-btn-bypercent-left btn" lay-submit id="submit">注 册</button>
            &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp;
            <button  type="submit"  class="layui-btn layui-btn-bypercent-right"    id="reset">取 消</button>
        </div>
    </div>
    <br>
    <br>
</form>
</body>
</html>
