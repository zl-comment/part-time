<%--
  Created by IntelliJ IDEA.
  User: xuehuajie
  Date: 2022/3/26
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" rel="stylesheet" href="static/css/login.css" />
    <script type="text/javascript" src="static/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="static/js/login.js"></script>
    <title>简历</title>
</head>

<body>

<div class="header">
    <div class="mainwarp">
        <div class="logo"><a href="allHome.jsp"><img src="static/images2/log.png" /></a></div>
        <div class="welcome">欢迎注册</div>
        <div class="headerright">
            <a href="login.jsp">个人登录</a>
            <span>|</span>
            <!--         <a href="zhuceCompany.html">企业注册 </a>-->
            <span>|</span>
            <a href="allHome.jsp">返回首页</a>
        </div>
    </div>
</div>


<form action="createResume" method="post">
<div class="jianliBox">
    <div class="jlpart1">
        <img src="static/images2/img1.png" />
    </div>
    <div class="jlpart2">
        <div class="jlpart2_1">
            <div class="jlbox1">
                <h1>一分钟填写简历</h1>
                <p>填写以下信息即可生成一份简历，一步注册，起航你的成功之梦！</p>
            </div>

            <div class="jlbox2">
                <span class="tit"  id="tit">姓名</span>
                <input name="name" type="text" class="txtcon txt1"/>
                <span id="1"></span>
            </div>

            <div class="jlbox2">
                <span class="tit"  id="gender1">性别</span>
                <input name="gender" type="radio" value="男" >男
                <input name="gender" type="radio" value="女" >女
                <span id="13"></span>
            </div><br>


           <%-- <div class="jlbox2">
                <span class="tit">我是</span>
                <div class="sex on">男</div>
                <div class="sex">女</div>
                <div class="clear"></div>
                <span id="13"></span>

            </div>--%>

            <div class="jlbox2">
                <span class="tit"  id="age1">年龄</span>
                <input name="age" type="text" class="txtcon txt1"/>
                <span id="2"></span>

            </div>

            <div class="jlbox2">
                <span class="tit"  id="amaurl1">照片</span>
                <input name="imaurl" type="text" class="txtcon txt1"/>
                <span id="3"></span>

            </div>

            <div class="jlbox2">
                <span class="tit"  id="address1">住址</span>
                <input name="address" type="text" class="txtcon txt1"/>
                <span id="4"></span>

            </div>

            <div class="jlbox2">
                <span class="tit">手机号</span>
                <input name="phone" type="text" class="txtcon txt3"/>
                <div class="clear"></div>
            </div>


            <div class="jlbox2">
                <span class="tit"  id="hobby1">兴趣爱好</span>
                <input name="hobby" type="text" class="txtcon txt1"/>
                <span id="7"></span>

            </div>

            <div class="jlbox2">
                <span class="tit"  id="workExperience1">工作经历</span>
                <input name="workExperience" type="text" class="txtcon txt1"/>
                <span id="9"></span>

            </div>

            <div class="jlbox2">
                <span class="tit"  id="major1">专业</span>
                <input name="major" type="text" class="txtcon txt1"/>
                <span id="8"></span>

            </div>

            <div class="jlbox2">
                <span class="tit"  id="selfEvaluation1">自我评价</span>
                <input name="selfEvaluation" type="text" class="txtcon txt1"/>
                <span id="10"></span>

            </div>


            <div class="jlbox2">
                <span class="tit">邮箱</span>
                <input name="email" type="text" class="txtcon txt3"/>
                <div class="clear"></div>
            </div>
            <div class="jlbox2">
                <input name="" id="jlbtn"  type="submit" value="生成简历"  class="jlbtn"/>
            </div>
        </div>
    </div>
</div>
</form>

<div class="clear"></div>
<div class="footer">
    <p><a href="">**人才</a>旗下<img src="static/images2/logo_foot.gif" />山西聘学兼优网版权所有，本网站所有招聘信息，未经书面授权不得转载 投诉电话：400-8**-****</p>
</div>


<script src="static/js/jquery.min.js"></script>






<script>
    $(function () {

        $("#name").blur(function () {
            var name=$("#name").val();
            if (name != ''){
                $("#1").html("√");
            }else {
                $("#1").html("请输入姓名");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#gender").blur(function () {
            var name=$("#gender").val();
            if (gender != ''){
                $("#13").html("√");
            }else {
                $("#13").html("请输入性别");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#age").blur(function () {
            var name=$("#age").val();
            if (age != ''){
                $("#2").html("√");
            }else {
                $("#2").html("请输入年龄");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#imaurl").blur(function () {
            var name=$("#imaurl").val();
            if (imaurl != ''){
                $("#3").html("√");
            }else {
                $("#3").html("请上传照片");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#address").blur(function () {
            var name=$("#address").val();
            if (address != ''){
                $("#4").html("√");
            }else {
                $("#4").html("请输入地址");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#phone").blur(function () {
            var name=$("#phone").val();
            if (phone != ''){
                $("#5").html("√");
            }else {
                $("#5").html("请输入手机号");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#email").blur(function () {
            var name=$("#email").val();
            if (email != ''){
                $("#6").html("√");
            }else {
                $("#6").html("请输入邮箱号码");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#hobby").blur(function () {
            var name=$("#hobby").val();
            if (hobby != ''){
                $("#7").html("√");
            }else {
                $("#7").html("请输入兴趣爱好");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#major").blur(function () {
            var name=$("#major").val();
            if (major != ''){
                $("#8").html("√");
            }else {
                $("#8").html("请输入专业");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#workExperience").blur(function () {
            var name=$("#workExperience").val();
            if (workExperience != ''){
                $("#9").html("√");
            }else {
                $("#9").html("请输入工作经历");
            }
        })
    })

</script>

<script>
    $(function () {

        $("#selfEvaluation").blur(function () {
            var name=$("#selfEvaluation").val();
            if (selfEvaluation != ''){
                $("#10").html("√");
            }else {
                $("#10").html("请输入自我评价");
            }
        })
    })

</script>










</body>
</html>
