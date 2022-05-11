<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/5/11
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/my51JobDwt.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <!-- InstanceBeginEditable name="doctitle" -->
  <title>简历管理</title>
  <style type="text/css">
    .div0Intro
    {
      background-image:url(static/images1/menu-bg1.gif);
      background-repeat:repeat-x;
      width:1000px;
      height:33px;
      margin:auto;
      color:#FFF;
      font-size:12px;
      line-height:28px;
    }
    .span0Intro
    {
      margin-left:10px;
      margin-right:10px;
    }

    .div1Intro
    {
      width:960px;
      height:1050px;
      /*border:1px solid #F00;*/
      margin:auto;
    }

    .div11Intro
    {
      float:left;
      width:210px;
      height:1045px;
      border:1px #CCC dashed;
      background-color:#FFFFF7;
      text-align:left;
    }

    .div12Intro
    {
      float:left;
      width:700px;
      height:1030px;
      /*border:solid 1px #00F;*/
      text-align:left;
      padding-top:15px;
      margin-left:30px;
    }

    .div111Intro
    {
      /*	width:180px;*/
      height:16px;
      /*border:#000 1px dashed;*/
      margin-left:30px;
      vertical-align:middle;
      /*margin-bottom:10px;
      margin-top:10px;*/
    }

    .span11InnerIntro
    {
      line-height:16px;
      height:16px;
      text-align:left;
      font-size:12px;
      font-weight:bold;
      margin-left:10px;
    }

    .div112Intro
    {
      width:180px;
      height:16px;
      /*border:#000 1px dashed;*/
      margin-left:30px;
      vertical-align:middle;
      margin-bottom:8px;
      margin-top:8px;
    }

    .span12InnerIntro
    {
      color:#414141;
      line-height:16px;
      height:16px;
      text-align:left;
      font-size:12px;
      margin-left:10px;
    }

    .img1Intro
    {
      margin:10px;
      cursor:pointer;
    }

    .img2Intro
    {
      margin-top:10px;
      margin-bottom:10px;
      margin-left:0px;
    }

    .btn1Intro
    {
      width:100px;
      height:33px;
      border:0px;
      background-image:url(static/images1/login-sm2.gif);

    }

    .btn1Intro:hover
    {
      width:100px;
      height:33px;
      border:0px;
      background-image:url(static/images1/login-sm1.gif);
    }

    .star1Intro
    {
      color:#F60;
      margin-right:5px;
    }

    td
    {
      font-size:12px;
      color:#414141;
    }

    .tablediv1Intro
    {
      width:698px;
      /*border:1px dashed #000;*/
      margin-bottom:15px;
    }

    .tablediv2Intro
    {
      width:698px;
      /*border:1px dashed #000;*/
      margin-bottom:15px;
    }

    .tablediv3Intro
    {
      width:698px;
      /*border:1px dashed #000;*/
      margin-bottom:15px;
    }

    .table1Intro
    {
      width:690px;
      height:300px;
    }

    .table2Intro
    {
      width:550px;
      height:250px;
    }

    .table3Intro
    {
      width:550px;
      height:190px;
    }

    .textarea1Intro
    {
      width:450px;
      height:45px;
    }

    .aIntro
    {
      color:#414141;
      font-size:12px;
      text-decoration:none;
    }

    .aIntro:hover
    {
      color:#F60;
      font-size:12px;
      text-decoration:none;
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


</head>

<body>

<div class="bodydwt">
  <div class="headdwt">
  <%--  <div class="headerleftdwt"><img src="static/images1/logo.gif" /></div>--%>
    <div class="headerrightdwt">
<%--      <a href="allLogin.jsp" name="pic"><img src="static/images1/menu1-2.gif" class="imgheaderdwt" /></a>
      <a href="search.jsp" name="pic"><img src="static/images1/menu2-2.gif" class="imgheaderdwt" /></a>
      <a href="intro.jsp" name="pic"><img src="static/images1/menu3-2.gif" class="imgheaderdwt" /></a>--%>
    </div>
  </div>
  <!-- InstanceBeginEditable name="EditRegion3" -->
  <!--菜单栏开始-->
  <div class="div0Intro">
    <span class="span0Intro">简历中心</span>|<span class="span0Intro">求职信</span>|<span class="span0Intro">简历指导</span>
  </div>
  <!--菜单栏结束-->


  <!--中间内容开始-->
  <div class="div1Intro">
    <!--中间内容左边开始-->
    <div class="div11Intro">
      <img src="static/images1/intro-left1.gif" onclick="pop1()" class="img1Intro" />
      <div id="pop0" class="div111Intro"><img src="static/images1/register-arrow.gif" /><span class="span11InnerIntro">我的简历</span></div>
      <img src="static/images1/intro-left2.gif" onclick="pop2()" class="img1Intro" />
      <div id="pop21" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point1" class="aIntro">基本个人信息</a></span></div>
      <div id="pop22" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point2" class="aIntro">工作经验</a></span></div>
      <div id="pop23" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point2" class="aIntro">教育经历</a></span></div>
      <div id="pop24" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point2" class="aIntro">培训经历</a></span></div>
      <div id="pop25" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro">语言能力</span></div>
      <div id="pop26" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point2" class="aIntro">求职意向/自我评价</a></span></div>
      <div id="pop27" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro">附加信息</span></div>
      <div id="pop28" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro">证书</span></div>
      <div id="pop29" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro">附件</span></div>
      <img src="static/images1/intro-left3.gif" onclick="pop3()" class="img1Intro" />
      <div id="pop10" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point3" class="aIntro">高级人才附加信息</a></span></div>
      <div id="pop11" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point3" class="aIntro">IT技能</a></span></div>
      <div id="pop12" class="div112Intro"><img src="static/images1/intro-1.gif" align="middle" /><span class="span12InnerIntro"><a href="#point3" class="aIntro">项目经验</a></span></div>
    </div>
    <!--中间内容左边结束-->
    <!--中间内容右边开始-->
    <div class="div12Intro">
      <div class="div111Intro"><img src="static/images1/register-arrow.gif" /><span class="span11InnerIntro"><a name="point1">基本个人信息（*为必填项）</a></span></div>
      <img src="static/images1/border.JPG" class="img2Intro" />
      <div class="tablediv1Intro">

        <table class="table1Intro" cellspacing="5px;">
          <tr>
            <td style="width:80px">
              <span class="star1Intro">*</span>姓名
            </td>
            <td style="width:280px;">
              <a name="point4"><input id="nametxt" type="text" style="border:1px solid #999" /></a>
            </td>
            <td style="width:80px">
              <span class="star1Intro">*</span>性别
            </td>
            <td style="width:250px">
              <input type="radio" checked="checked" name="sex" />男
              <input type="radio" name="sex" />女
            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>出生日期
            </td>
            <td>
              <a name="point5">
                <!--select id="myyear">
                    <option value="no" selected="selected">1997</option>
                    <option value="1996">1996</option>
                    <option>1995</option>
                    <option>1994</option>
                    <option>1993</option>
                    <option>1992</option>
                    <option>1991</option>
                    <option>1990</option>
                    <option>1989</option>
                    <option>1988</option>
                    <option>1987</option>
                    <option>1986</option>
                    <option>1985</option>
                    <option>1984</option>
                    <option>1983</option>
                    <option>1982</option>
                    <option>1981</option>
                    <option>1980</option>
                    <option>1979</option>
                    <option>1978</option>
                </select-->

                <select id="myYear" onchange="addDay()">
                  <option value="0">请选择</option>
                </select>

              </a>
              年
              <!--select id="mymonth">
                  <option value="no" selected="selected">1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
                  <option>6</option>
                  <option>7</option>
                  <option>8</option>
                  <option>9</option>
                  <option>10</option>
                  <option>11</option>
                  <option>12</option>
              </select-->

              <select id="myMonth" onchange="addDay()">
                <option value="0">请选择</option>
              </select>


              月
              <!--select id="myday">
                  <option value="no" selected="selected">1</option>
                  <option>2</option>
                  <option>3</option>
                  <option>4</option>
                  <option>5</option>
                  <option>6</option>
                  <option>7</option>
                  <option>8</option>
                  <option>9</option>
                  <option>10</option>
                  <option>11</option>
                  <option>15</option>
                  <option>18</option>
                  <option>21</option>
                  <option>24</option>
                  <option>26</option>
                  <option>28</option>
                  <option>30</option>
                  <option>31</option>
              </select-->

              <select id="myDay" disabled="disabled">
                <option value="0">请选择</option>
              </select>

              日
            </td>
            <td>
              <span class="star1Intro">*</span>工作年限
            </td>
            <td>
              <select id="myyears">
                <option value="no" selected="selected">——请选择——</option>
                <option>在读学生</option>
                <option>应届毕业生</option>
                <option>一年以上</option>
                <option>二年以上</option>
                <option>三年以上</option>
                <option>五年以上</option>
                <option>八年以上</option>
                <option>十年以上</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>
              国家或地区
            </td>
            <td>
              <select style="width:130px;">
                <option value="no" selected="selected">中国大陆</option>
                <option>中国香港</option>
                <option>中国澳门</option>
                <option>中国台湾</option>
                <option>欧美</option>
                <option>日本</option>
              </select>
            </td>
            <td>
              户口
            </td>
            <td>
              <select>
                <option value="no" selected="selected">请选择</option>
                <option>北京</option>
                <option>上海</option>
                <option>天津</option>
                <option>河北</option>
                <option>江苏</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>证件类型
            </td>
            <td>
              <a name="6"><select id="passport" style="width:130px">
                <option value="no" selected="selected">身份证</option>
                <option>护照</option>
                <option>军人</option>
                <option>香港身份证</option>
                <option>台湾身份证</option>
                <option>其他</option>
              </select></a>
            </td>
            <td>
              <span class="star1Intro">*</span>证件号
            </td>
            <td>
              <input id="passportid" type="text" style="width:150px; border:1px solid #999" />
            </td>
          </tr>
          <tr>
            <td>
              目前年薪
            </td>
            <td>
              <select style="width:130px">
                <option value="no" selected="selected">——请输入——</option>
                <option>10万</option>
                <option>20万</option>
                <option>50万</option>
                <option>100万</option>
                <option>200万</option>
              </select>
              /年
            </td>
            <td>
              币种
            </td>
            <td>
              <select>
                <option value="no" selected="selected">人民币</option>
                <option>美元</option>
                <option>日元</option>
                <option>欧元</option>
                <option>泰铢</option>
                <option>第纳尔</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>现居住地
            </td>
            <td>
              <a name="point7">
                <!--select id="provinceAt" style="width:130px">
                    <option value="no" selected="selected">——选择省份——</option>
                    <option>河北</option>
                    <option>江苏</option>
                    <option>浙江</option>
                    <option>湖北</option>
                    <option>福建</option>
                </select-->

                <!--级联菜单的省份开始-->

                <select id="pro" style="width:130px" onchange="addCities()">
                  <!--option value="0">--请选择--</option-->
                </select>



                <!--级联菜单的省份结束-->
              </a>
              <!--select id="cityAt" style="width:130px">
                  <option value="no" selected="selected">——选择城市——</option>
                  <option>北京</option>
                  <option>邯郸</option>
                  <option>上海</option>
                  <option>苏州</option>
                  <option>南京</option>
              </select-->

              <!--级联菜单的城市开始-->
              <select id="city" style="width:130px;">
                <option value="0">--请选择--</option>
              </select>




              <!--级联菜单的城市结束-->

            </td>
            <td>

            </td>
            <td>

            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>联系方式
            </td>
            <td>
              <a name="point8"><input id="contactid" type="text" style="width:150px; border:1px solid #999;" /></a>
            </td>
            <td>
              <span class="star1Intro">*</span>E-mail
            </td>
            <td>
              <input id="email" type="text" style="width:150px; border:1px solid #999;" />
            </td>
          </tr>
          <tr>
            <td>
              地址
            </td>
            <td>
              <input type="text" style="width:250px; border:1px solid #999" />
            </td>
            <td>
              邮编
            </td>
            <td>
              <input type="text" style="width:50px; border:1px solid #999" />
            </td>
          </tr>
          <tr>
            <td>
              个人主页
            </td>
            <td>
              <input type="text" style="width:250px; border:1px solid #999" />
            </td>
            <td>

            </td>
            <td>

            </td>
          </tr>
        </table>
      </div>
      <div class="div111Intro"><img src="static/images1/register-arrow.gif" /><span class="span11InnerIntro"><a name="point2">我的简历</a></span></div>
      <img src="static/images1/border.JPG" class="img2Intro" />
      <div class="tablediv2Intro">
        <table class="table2Intro" cellspacing="0" cellpadding="0">
          <tr>
            <td style="width:80px;">
              工作经验
            </td>
            <td>
              <textarea class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>教育经历
            </td>
            <td>
              <textarea id="areaEdu" class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
          <tr>
            <td>
              培训经历
            </td>
            <td>
              <textarea class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
          <tr>
            <td>
              <span class="star1Intro">*</span>求职意向
            </td>
            <td>
              <textarea id="proposal" class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
        </table>
      </div>
      <div class="div111Intro"><img src="static/images1/register-arrow.gif" /><span class="span11InnerIntro"><a name="point3">人才附加信息</a></span></div>
      <img src="static/images1/border.JPG" class="img2Intro" />
      <div class="tablediv3Intro">
        <table class="table3Intro" cellpadding="0" cellspacing="0">
          <tr>
            <td style="width:80px">
              附加信息
            </td>
            <td>
              <textarea class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
          <tr>
            <td>
              IT技能
            </td>
            <td>
              <textarea class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
          <tr>
            <td>
              项目经验
            </td>
            <td>
              <textarea class="textarea1Intro" style="resize:none"></textarea>
            </td>
          </tr>
        </table>
      </div>
      <div style="background-image:url(static/images1/menu-bg2.gif); background-repeat:repeat-x; width:680px; height:20px;">

      </div>
      <div style="text-align:center">
        <input class="btn1Intro" type="button" onclick="checkContent()" value="保存" />
      </div>
    </div>
    <!--中间内容右边结束-->
  </div>
  <!--中间内容结束-->



  <!-- InstanceEndEditable -->
</div>
<div class="divdwt">
  网站导航&nbsp;&nbsp;|&nbsp;&nbsp;<a href="index1.jsp" class="adwt">网站首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="search.jsp" class="adwt">职位搜索</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">Myjob</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="register.html" class="adwt">用户注册</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">用户登录</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;<a href="company.jsp" class="adwt">招聘公司</a>
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

  /*111111111111111111111111111111111111级联样式开始111111111111111111111111111111111111*/

  var pro=new Array();
  pro[0]=["--请选择--"];
  pro[1]=["浙江省","杭州","嘉兴","宁波"];
  pro[2]=["江苏省","苏州","南京","无锡"];
  pro[3]=["山东省","济南","济宁","德州"];

  /*
      pro是一个数组，可以手动添加pro的元素，这样有利于程序的升级
  */

  var province=document.getElementById("pro");
  var city=document.getElementById("city");


  for(i=0;i<pro.length;i++)
  {
    province.options.add(new Option(pro[i][0],i));
  }

  function addCities()
  {
    var index=province.value;
    city.length=1;
    for(i=1;i<pro[index].length;i++)
    {
      city.options.add(new Option(pro[index][i],i));
    }
  }


  var myYear=document.getElementById("myYear");
  var myMonth=document.getElementById("myMonth");
  var myDay=document.getElementById("myDay");


  for(i=1;i<=12;i++)
  {
    myMonth.options.add(new Option(i,i));
  }

  for(i=1900;i<2100;i++)
  {
    myYear.options.add(new Option(i,i));
  }

  function addDay()
  {
    myDay.disabled=true;
    var yearNum=myYear.value;
    var monthNum=myMonth.value;
    if(yearNum=="0")
    {
      alert("请选择年份");
      return;
    }

    if(monthNum=="0")
    {
      alert("请选择月份");
      return;
    }

    alert("请选择日期");

    myDay.disabled=false;

    var days=0;
    switch (monthNum)
    {
      case "1":
      case "3":
      case "5":
      case "7":
      case "8":
      case "10":
      case "12":
        days=31;
        break;
      case "4":
      case "6":
      case "9":
      case "11":
        days=30;
        break;
      default:
        if((yearNum%4==0&&yearNum%100!=0)||yearNum%400==0)
        {
          days=29;
        }
        else
        {
          days=28;
        }
    }

    myDay.length=1;
    for(i=1;i<=days;i++)
    {

      myDay.options.add(new Option(i,i));
    }


  }




  /*2222222222222222222222222222222222222级联样式结束22222222222222222222222222222222222222*/
  var pop0=document.getElementById("pop0");
  var pop21=document.getElementById("pop21");
  var pop22=document.getElementById("pop22");
  var pop23=document.getElementById("pop23");
  var pop24=document.getElementById("pop24");
  var pop25=document.getElementById("pop25");
  var pop26=document.getElementById("pop26");
  var pop27=document.getElementById("pop27");
  var pop28=document.getElementById("pop28");
  var pop29=document.getElementById("pop29");
  var pop10=document.getElementById("pop10");
  var pop11=document.getElementById("pop11");
  var pop12=document.getElementById("pop12");

  pop0.style.display="none";
  pop21.style.display="none";
  pop22.style.display="none";
  pop23.style.display="none";
  pop24.style.display="none";
  pop25.style.display="none";
  pop26.style.display="none";
  pop27.style.display="none";
  pop28.style.display="none";
  pop29.style.display="none";
  pop10.style.display="none";
  pop11.style.display="none";
  pop12.style.display="none";


  function pop1()
  {


    if(pop0.style.display=="none")
    {
      pop0.style.display="block";
    }
    else
    {
      pop0.style.display="none";
    }
  }

  function pop2()
  {

    if(pop21.style.display=="block")
    {
      pop21.style.display="none";
      pop22.style.display="none";
      pop23.style.display="none";
      pop24.style.display="none";
      pop25.style.display="none";
      pop26.style.display="none";
      pop27.style.display="none";
      pop28.style.display="none";
      pop29.style.display="none";
    }
    else
    {
      pop21.style.display="block";
      pop22.style.display="block";
      pop23.style.display="block";
      pop24.style.display="block";
      pop25.style.display="block";
      pop26.style.display="block";
      pop27.style.display="block";
      pop28.style.display="block";
      pop29.style.display="block";
    }

  }


  function pop3()
  {

    if(pop10.style.display=="block")
    {
      pop10.style.display="none";
      pop11.style.display="none";
      pop12.style.display="none";
    }
    else
    {
      pop10.style.display="block";
      pop11.style.display="block";
      pop12.style.display="block";
    }


  }



  var pics=document.getElementsByName("pic");
  pics[2].innerHTML="<img src='static/images1/menu3-1.gif' class='imgheaderdwt' />";

  function checkContent()
  {
    var name=document.getElementById("nametxt");

    if(name.value=="")
    {
      alert("请输入姓名");

      window.location.href="#point4";
      name.focus();
      return;
    }

    var sexes=document.getElementsByName("sex");
    var flag=false;
    for(i=0;i<sexes.length;i++)
    {
      if(sexes[i].checked)
      {
        flag=true;
      }
    }

    if(!flag)
    {
      alert("请选择性别");
      window.location.href="#point4";
      return;
    }

    if(myDay.value=="0")
    {
      alert("请选择出生年月日");
      window.location.href="#point5";
      myYear.focus();
      return;
    }


    /*
    var myyear=document.getElementById("myyear");

    if(myyear.value=="no")
    {
        alert("请选择出生年份");

        window.location.href="#point5";
        myyear.focus();
        return;
    }


    var mymonth=document.getElementById("mymonth");

    if(mymonth.value=="no")
    {
        alert("请选择出生月份");
        window.location.href="#point5";
        mymonth.focus();
        return;
    }

    var myday=document.getElementById("myday");

    if(myday.value=="no")
    {
        alert("请选择出生日期");
        window.location.href="#point5";
        myday.focus();
        return;
    }
    */

    var myyears=document.getElementById("myyears");

    if(myyears.value=="no")
    {
      alert("请选择工作年限");
      window.location.href="#point5";
      myyears.focus();
      return;
    }

    var passport=document.getElementById("passport");

    if(passport.value=="no")
    {
      alert("请选择证件类型");
      window.location.href="#point6";
      passport.focus();
      return;
    }

    var passportid=document.getElementById("passportid");

    if(passportid.value=="")
    {
      alert("请填写证件号");
      window.location.href="#point6";
      passportid.focus();
      return;
    }

    var provinceAt=document.getElementById("provinceAt");

    if(province.value=="0")
    {
      alert("请选择现居地省份");
      window.location.href="#point7";
      province.focus();
      return;
    }

    var cityAt=document.getElementById("cityAt");

    if(city.value=="0")
    {
      alert("请选择现居地城市");
      window.location.href="#point7";
      city.focus();
      return;
    }

    var contactid=document.getElementById("contactid");

    if(contactid.value=="")
    {
      alert("请填写联系方式");
      window.location.href="#point8";
      contactid.focus();
      return;
    }

    var email=document.getElementById("email");

    if(email.value=="")
    {
      alert("请填写E-mail地址");
      window.location.href="#point8";
      email.focus();
      return;
    }

    var rule=/^\w+@\w+(\.com)+(\.cn)?$/;

    if(!rule.test(email.value))
    {
      alert("请输入正确的邮箱地址");
      window.location.href="#point8";
      email.select();
      return;
    }


    var areaEdu=document.getElementById("areaEdu");
    if(areaEdu.value=="")
    {
      alert("请填写教育经历");
      window.location.href="#point2";
      areaEdu.focus();
      return;
    }

    var proposal=document.getElementById("proposal");
    if(proposal.value=="")
    {
      alert("请填写求职意向");
      window.location.href="#point2";
      proposal.focus();
      return;
    }


    alert("成功提交");
  }




</script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>

