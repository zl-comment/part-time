    <%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/13
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录界面</title>
    <!--basic_css-->
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css" />
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">

    <style type="text/css">
        body {
            background-image: url(img/lg-bg.jpg);
            background-position: 14px 14px;
            background-repeat: no-repeat;
            background-position: center center;
            background-attachment: fixed;
            background-size: cover;
        }

        .layui-input {
            height: 45px;
            width: 87%;
            padding-left: 5px;
            font-size: 16px;
            display: inline-block;

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
            padding: 15px 28px 0px;
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
            margin-right: 4%;
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
            width: 60%;
            height: 45px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid rgba(0, 0, 0, .2);

        }
        .decrib{
            font-size: 16px;
        }
    </style>

</head><%--
<script src="js/jquery.min.js"></script>


<script>
            $(function () {

                $("#username").blur(function () {
                    var username=$("#username").val();
                    $.ajax({
                        url:"AdminServlet?method=usernameIsSame",
                        method:"post",
                        data:{username:username},
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
--%>






<body>
<form class="layui-form" action="LoginServlet?method=login" id="loginForm" method="post" >
    <div class="layui-form-item">
        <h1>用&nbsp;户&nbsp;登&nbsp;录</h1>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">账号：</span>
            <input type="text" name="usercode"   id="username"  placeholder="请输入账号" autocomplete="off" class="layui-input"
                   autofocus required>
        </div>
        <span id="msg"></span>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">密码：</span>
            <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input"
                   required>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <span class="decrib">验证：</span>
            <input type="text" placeholder="请输入验证码" class="input-val" autocomplete="off" required>
            <canvas id="canvas" width="100" height="43">
            </canvas>
        </div>
    </div>
    <br>
    <div class="layui-form-item">
        <div class="layui-btn-container">
            <button type="submit" class="layui-btn " lay-submit style="color:#fff;line-height:45px;font-size:20px;">登 录</button>
            <a class="layui-btn " style="color:#fff;line-height:45px;font-size:20px;" href="StudentRegister.jsp" id="Studentregister">学 生 注 册</a>

            <a class="layui-btn" style="color:#fff;line-height:45px;font-size:20px;" href="CpyRegister.jsp" id="Cpyregister">企 业 注 册</a>
         <li>${error}</li>
        </div>
    </div>
    <br>
    <br>
</form>
</body>


<!--
描述：验证码部分代码
-->
<script src="layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="layui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<!--验证码-->
<script>
    $(function() {
        var show_num = [];
        draw(show_num);

        $("#canvas").on('click', function() {
            draw(show_num);
        })
        $(".btn").on('click', function() {
            var val = $(".input-val").val().toLowerCase();
            var num = show_num.join("");
            if (val == '') {
                alert('请输入验证码！');
            } else if (val == num) {
                alert('提交成功！');
                $(".input-val").val('');
                draw(show_num);

            } else {
                alert('验证码错误！请重新输入！');
                $(".input-val").val('');
                draw(show_num);
            }
        })
    })

    function draw(show_num) {
        var canvas_width = $('#canvas').width();
        var canvas_height = $('#canvas').height();
        var canvas = document.getElementById("canvas"); //获取到canvas的对象，演员
        var context = canvas.getContext("2d"); //获取到canvas画图的环境，演员表演的舞台
        canvas.width = canvas_width;
        canvas.height = canvas_height;
        var sCode = "A,B,C,E,F,G,H,J,K,L,M,N,P,Q,R,S,T,W,X,Y,Z,1,2,3,4,5,6,7,8,9,0";
        var aCode = sCode.split(",");
        var aLength = aCode.length; //获取到数组的长度

        for (var i = 0; i <= 3; i++) {
            var j = Math.floor(Math.random() * aLength); //获取到随机的索引值
            var deg = Math.random() * 30 * Math.PI / 180; //产生0~30之间的随机弧度
            var txt = aCode[j]; //得到随机的一个内容
            show_num[i] = txt.toLowerCase();
            var x = 10 + i * 20; //文字在canvas上的x坐标
            var y = 20 + Math.random() * 8; //文字在canvas上的y坐标
            context.font = "bold 23px 微软雅黑";

            context.translate(x, y);
            context.rotate(deg);

            context.fillStyle = randomColor();
            context.fillText(txt, 0, 0);

            context.rotate(-deg);
            context.translate(-x, -y);
        }
        for (var i = 0; i <= 5; i++) { //验证码上显示线条
            context.strokeStyle = randomColor();
            context.beginPath();
            context.moveTo(Math.random() * canvas_width, Math.random() * canvas_height);
            context.lineTo(Math.random() * canvas_width, Math.random() * canvas_height);
            context.stroke();
        }
        for (var i = 0; i <= 30; i++) { //验证码上显示小点
            context.strokeStyle = randomColor();
            context.beginPath();
            var x = Math.random() * canvas_width;
            var y = Math.random() * canvas_height;
            context.moveTo(x, y);
            context.lineTo(x + 1, y + 1);
            context.stroke();
        }
    }

    function randomColor() { //得到随机的颜色值
        var r = Math.floor(Math.random() * 256);
        var g = Math.floor(Math.random() * 256);
        var b = Math.floor(Math.random() * 256);
        return "rgb(" + r + "," + g + "," + b + ")";
    }
</script>

</html>
