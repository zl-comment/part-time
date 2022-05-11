<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/my51JobDwt.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>用户登录页面</title>
<style type="text/css">
.div0Login
{
	width:1000px;
	height:33px;
	margin:auto;
	background-image:url(static/images1/menu-bg1.gif);
	background-repeat:repeat-x;
	text-align:center;
}

.div1Login
{
	width:800px;
	height:360px;
	top:40px;
	position:relative;
	margin:auto;
	margin-bottom:45px;
	/*border:1px dashed #00F;*/
}

.div11Login
{
	float:left;
	height:320px;
	width:324px;
	position:relative;
	/*background-color:#0F0;*/
	
}

.div111Login
{
	background-image:url(static/images1/Login_top.gif);
	width:324px;
	height:36px;
	left:0px;
	top:0px;
	position:absolute;
}

.div112Login
{
	background-image:url(static/images1/Login_left.gif);
	width:21px;
	height:254px;
	left:0px;
	top:36px;
	position:absolute;
}

.div113Login
{
	width:278px;
	height:254px;
	top:36px;
	left:21px;
	position:absolute;
	background-color:#FFFFF7;
}

.div114Login
{
	background-image:url(static/images1/Login_right.gif);
	width:21px;
	height:254px;
	top:36px;
	left:303px;
	position:absolute;
}

.div115Login
{
	background-image:url(static/images1/Login_bottom.gif);
	width:324px;
	height:30px;
	top:290px;
	left:1px;
	position:absolute;
}

.div12Login
{
	font-family:"宋体";
	margin-top:30px;
	margin-left:10px;
	text-align:left;
	font-size:12px;
	color:#414141;
	height:290px;
	width:420px;
	float:left;
	/*background-color:#0FF;*/
}

.div121Login
{
	width:80px;
	height:70px;
	text-align:center;
	vertical-align:middle;
	/*border:1px solid #F00;*/
	display:inline-block;
}

.div122Login
{
	height:70px;
	width:330px;
	/*border:1px solid #00F;*/
	float:right;
	line-height:20px;
}

.span01Login
{
	line-height:26px;
	margin-left:5px;
	margin-right:5px;
	color:#FFF;
	font-size:12px;
}

.span1Login
{
	margin:10px;
	display:block;
	color:#414141;
	font-size:12px;
}

.span2Login
{
	display:block;
	color:#414141;
	font-size:12px;
}

.btn1Login
{
	display:block;
	margin:auto;
	margin-top:10px;
	margin-bottom:10px;
	width:100px;
	height:33px;
	background-image:url(static/images1/login-sm2.gif);
	border:0px;
}

.btn1Login:hover
{
	display:block;
	margin:auto;
	margin-top:10px;
	margin-bottom:10px;
	width:100px;
	height:33px;
	background-image:url(static/images1/login-sm1.gif);
	border:0px;
}

/*
.btn2Login
{
	margin:auto;
	margin-top:10px;
	background-image:url(static/images1/login-1.gif);
	width:158px;
	height:26px;
	border:0px;
}
*/

.txtLogin
{
	margin-top:40px;
	width:150px;
	height:16px;
}

.pwdLogin
{
	width:150px;
	height:16px;
}
.input-val
{
    width:150px;
    height:16px;
}

</style>
<!-- InstanceEndEditable -->
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<style type="text/css">
.spandwt
{
	display:block;
	text-align:center;
	line-height:25px;
	font-size:12px;
	color:#414141;
	font-family:"宋体";
}
.divdwt
{
	display:block;
	background-image:url(static/images1/bottom-bg.gif);
	text-align:center;
	height:35px;
	width:1000px;
	color:#FFF;
	line-height:30px;
	font-size:12px;
	font-family:"宋体";
	margin:auto;
}

.adwt
{
	color:#FFF;
	font-size:12px;
	text-decoration:none;
	font-family:"宋体";
}

.adwt:hover
{
	color:#FFF;
	font-size:12px;
	text-decoration:none;
	font-family:"宋体";
}

.bodydwt
{
	text-align:center;
}

.imgdwt
{
	border:0px;
}
.headdwt
{
	width:960px;
	height:65px;
	margin:auto;/*居中*/
	position:relative;
	vertical-align:bottom;
	/*border:1px solid #000;*/
}

.headerleftdwt
{
	/*border:1px solid #000;*/
	float:left;
	margin-bottom:0px;
	height:65px;
}

.headerrightdwt
{
	/*border:1px solid #000;*/
	float:right;
	height:31px;
	vertical-align:bottom;
	margin-top:34px;
}

.imgheaderdwt
{
	border:0px;
}

</style>
    <!--
    描述：验证码部分代码
    -->
    <script src="./static/layui/layui.js" type="text/javascript" charset="utf-8"></script>
    <script src="./static/layui/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <!--验证码-->
    <script>
        $(function() {
            var show_num = [];
            draw(show_num);

            $("#canvas").on('click', function() {
                draw(show_num);
            })
            $("#submit").on('click', function() {
                var val = $(".input-val").val().toLowerCase();
                console.log(val)
                var num = show_num.join("");
                if (val == '') {
                    alert('请输入验证码！');
                } else if (val == num) {
                    // alert('提交成功！');
                    //   $(".input-val").val('');
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
<script >
    $(function() {
      $("#psw").blur(function() {
        var psw = $("#psw").val();
        var reg = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/;
     /*     if(psw.length<6){
              alert("输入的密码必须大于六位");
              return;}else{
              var count =0
              for (var i=0;i<psw.length;i++) {
                  if((psw[i]>='a' && psw[i]<='z')||(psw[i]>='A' && psw[i]<='Z')){
                      count++;
                  }
              }
              if(count>=2){
                  alert("输入合法");
                  $("#psw_info").html("输入合法");
                  $("#psw_info").css("color", "red");
              }else{
                  alert("输入的密码必须包含数字和字母");
                  $("#psw_info").html("输入的密码必须包含数字和字母");
                  $("#psw_info").css("color", "red");
              }
          }*/
        if (psw == "") {
          $("#psw_info").html("密码不能为空");
          $("#psw_info").css("color", "red");
        } else if (!reg.test(psw)) {
          $("#psw_info").html("密码格式不正确，至少1个大写字母，1个小写字母和1个数字");
          $("#psw_info").css("color", "red");
        } else {
          $("#psw_info").html("密码正确");
        }
      });
    })

</script>




</head>

<body>

<div class="bodydwt">
<div class="headdwt">
	<div class="headerleftdwt"><img src="static/images1/logo.gif" /></div>
    <div class="headerrightdwt">
        <a href="allLogin.jsp" name="pic"><img src="static/images1/menu1-2.gif" class="imgheaderdwt" /></a>
        <a href="search.jsp" name="pic"><img src="static/images1/menu2-2.gif" class="imgheaderdwt" /></a>
        <a href="intro.jsp" name="pic"><img src="static/images1/menu3-2.gif" class="imgheaderdwt" /></a>
    </div>
</div>
<!-- InstanceBeginEditable name="EditRegion3" -->


<!--菜单栏开始-->
<div class="div0Login">
	<span class="span01Login">我的简历</span><span class="span01Login">|</span><span class="span01Login">个人搜索器</span><span class="span01Login">|</span><span class="span01Login">职位收藏夹</span><span class="span01Login">|</span><span class="span01Login">工作申请记录</span><span class="span01Login">|</span><span class="span01Login">退出</span>
</div>
<!--菜单栏结束-->

<!--中间内容开始-->
<div class="div1Login">
	<div class="div11Login">
    	<!--top-->
    	<div class="div111Login"></div>
        <!--left-->
        <div class="div112Login"></div>
        <!--center-->

<%--学生登录--%>
        <div class="div113Login">
            <form action="login" method="post">
        	<span class="span1Login">用户名：<input class="txtLogin"  type="text" name="usercode"  placeholder="请输入用户名"  /></span>
            <span class="span2Login"><span style="margin-right:12px">密</span>码：<input class="pwdLogin"  name="password" id="psw" type="password"  placeholder="请输入密码8~16位" /></span>
                <span class="span2Login"><span id="psw_info"></span></span>
            <span class="span2Login">验证码：
            <input type="text" placeholder="请输入验证码" class="input-val" autocomplete="off" required/>
            </span>
            <canvas id="canvas" width="100" height="33"></canvas>
            <input type="submit" value="登录" class="btn1Login" />
            </form>
     <%--       <input type="button" class="btn2Login" />--%>
        </div>



        <!--right-->
        <div class="div114Login"></div>
        <!--bottom-->
        <div class="div115Login"></div>
    </div>
    <div class="div12Login">
    	<div class="div121Login">
    		<img src="static/images1/pic1.jpg" />
        </div>
        <div class="div122Login">
        	<font style="font-weight:bold; color:#FF7000; display:block">我的简历</font>
            51job的简历中心，您可以在此创建自己专业的个性化简历。
        </div>
        <div class="div121Login">
        	<img src="static/images1/pic2.jpg" />
        </div>
        <div class="div122Login">
        	<font style="font-weight:bold; color:#FF7000; display:block">找工作</font>
            在茫茫职场中如何找工作？51job的职位搜索器助您一臂之力！
        </div>
        <div class="div121Login">
        	<img src="static/images1/pic3.jpg" />
        </div>
        <div class="div122Login">
        	<font style="font-weight:bold; color:#FF7000; display:block">在线申请</font>
            当您找到感兴趣的职位时，可以立即将您在51job上的简历在线投递给招聘单位。
        </div>
        <div class="div121Login">
        	<img src="static/images1/pic4.jpg" />
        </div>
        <div class="div122Login">
        	<font style="font-weight:bold; color:#FF7000; display:block">我的搜索和订阅</font>
            设置并订阅您个性化的职位搜索器，51job会贴心的将理想的职位发送到您的信箱中。
        </div>
    </div>
</div>
<!--中间内容结束-->

<!-- InstanceEndEditable -->
</div>
<div class="divdwt">
	网站导航&nbsp;&nbsp;|&nbsp;&nbsp;<a href="index1.jsp" class="adwt">网站首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="search.jsp" class="adwt">职位搜索</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">Myjob</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">用户登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="intro.jsp" class="adwt">简历管理</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="company.jsp" class="adwt">招聘公司</a>
</div>
<div>
  <span class="spandwt">人才招聘&nbsp;Email:hr@51job.com</span>
  <span class="spandwt">个人求职&nbsp;Email:club@51job.com&nbsp;&nbsp;或垂询:800-820-5100</span>
  <span class="spandwt">未经本招聘网站同意，不得转载本网站之所有招聘信息及作品</span>
  <span class="spandwt">无忧工作网版权所有&copy;1999-2007</span>
  <span class="spandwt"><a href="index1.jsp"><img src="static/images1/bottom1.gif" class="imgdwt" /></a></span>
</div>

<!-- InstanceBeginEditable name="EditRegion4" -->

<script type="text/javascript">
var pics=document.getElementsByName("pic");
pics[0].innerHTML="<img src='static/images1/menu1-1.gif' class='imgheaderdwt' />";


</script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>

