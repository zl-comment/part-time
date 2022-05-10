<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/my51JobDwt.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>人才招聘--搜索</title>
<style type="text/css">

.div0Sear
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

.span0Sear
{
	margin-left:5px;
	margin-right:5px;
}

.div1Sear
{
	width:660px;
	height:280px;
	margin:auto;
	/*border:1px dashed #C0F;*/
	margin-bottom:50px;
	color:#414141;
}

.div11Sear
{
	width:660px;
	height:28px;
	background-image:url(static/images1/search_top.gif);
	background-repeat:repeat-x;
}

.div12Sear  /*左边的线条*/
{
	display:inline-block;
	float:left;
	width:3px;
	height:234px;
	background-image:url(static/images1/register-line.gif);
}

.div13Sear   /*控制主体的高*/
{
	height:234px;
	width:654px;
	float:left;
	text-align:left;
	font-size:12px;
	color:#414141;
	z-index:-10;
}

.div14Sear  /*右边的线条 原来高234*/
{
	float:right;
	width:3px;
	height:234px;
	background-image:url(static/images1/register-line.gif);
}

.div15Sear
{
	float:left;
	width:660px;
	height:18px;
	background-image:url(static/images1/search_bottom.gif);
}

.div131Sear
{
	margin-left:45px;
}

.div132Sear
{
	float:left;
	margin-left:45px;
	margin-right:10px;
	margin-top:5px;
}

.div133Sear
{
	cursor:pointer;
	width:210px;
	height:24px;
	float:left;
	background-image:url(static/images1/search-choice.gif);
}

.div134Sear
{
	float:left;
	margin-left:30px;
	margin-right:10px;
	margin-top:5px;
}

.div135Sear
{
	cursor:pointer;
	width:210px;
	height:24px;
	float:left;
	background-image:url(static/images1/search-choice.gif);
}

.divExtraSear
{
	height:24px;
}

.span1Sear
{
	margin-left:30px;
	font-weight:bold;
	width:200px;
	padding-top:10px;
	padding-bottom:10px;
	display:block;
	/*border:1px solid #000;*/
}

.img1Sear
{
	margin-right:5px;
}

select
{
	width:100px;
}

.divtable1Sear
{
	position:static;
	z-index:-10;
	background-color:#0FF;
}

.btn1Sear
{
	width:78px;
	height:27px;
	border:0px;
	background-image:url(static/images1/search-1.gif);
}

.listDiv1Sear
{
/*	border:1px solid #FF0;*/
	width:200px;
	height:0px;
	/*background-color:#CCC;*/
	/*display:inline;*/
	float:left;
	z-index:-10;
}

.listDiv2Sear
{
	float:right;
	display:inline;
	height:0px;
	width:202px;
	/*background-color:#F0F;*/
	z-index:-10;
}

.listdiv11Sear
{
	width:100px;
	height:25px;
	float:left;
}

.listdiv11Sear1
{
	width:110px;
	height:25px;
	float:left;
}



.listdiv12Sear
{
	display:none;
	width:140px;
	height:25px;
	float:left;
	line-height:25px;
	/*border:1px dotted #666;*/
}


/*这个DIV只能用js定位，否则在不同浏览器大小的情况下，居中就是一个问题了*/
.popupDiv1Sear
{
	display:none;
	width:540px;
	height:170px;
	left:200px;
	top:300px;
	position:absolute;
	background-color:#FFFFF7;
	border-bottom:2px solid #FF7000;
	z-index:10;
}


.popupDiv1Sear1
{
	display:none;
	width:570px;
	height:170px;
	left:200px;
	top:300px;
	position:absolute;
	background-color:#FFFFF7;
	border-bottom:2px solid #FF7000;
	z-index:10;
}


/*这个DIV只能用js定位，否则在不同浏览器大小的情况下，居中就是一个问题了*/
.popupDiv2Sear
{
	display:none;
	width:540px;
	height:280px;
	left:200px;
	top:300px;
	position:absolute;
	background-color:#FFFFF7;
	border-bottom:2px solid #FF7000;
	z-index:10;
}

.listdiv21Sear
{
	width:130px;
	height:25px;
	float:left;
}

.listdiv22Sear
{
	display:none;
	float:right;
	margin-left:400px;
	height:25px;
	width:200px;
	line-height:25px;
	/*border:1px dotted #069;*/
}

.popupmenuDiv1Sear
{
	padding-left:10px;
	height:35px;
	width:530px;
	background-image:url(static/images1/bottom-bg.gif);
	background-repeat:repeat-x;
	color:#FFF;
	font-size:12px;
}


.popupmenuDiv1Sear1
{
	padding-left:10px;
	height:35px;
	width:560px;
	background-image:url(static/images1/bottom-bg.gif);
	background-repeat:repeat-x;
	color:#FFF;
	font-size:12px;
}


.popupmenu1Div1Sear
{
	margin-left:20px;
	height:125px;;
	width:500px;
	z-index:100;
	/*border:1px solid #FFF;*/
}


.popupmenu1Div1Sear1
{
	margin-left:20px;
	height:125px;;
	width:600px;
	z-index:100;
	/*border:1px solid #FFF;*/
}

.popupmenu2Div1Sear
{
	margin-left:10px;
	height:135px;
	width:520px;
}

.spanpopupmenuDiv1Sear
{
	margin-left:5px;
	line-height:35px;
	overflow:hidden;
}

.spanrightpopupmenuDiv1Sear
{
	margin-left:300px;
}

.spanrightpopupmenuDiv1Sear1
{
	margin-left:330px;
}


.spanright1popupmenuDiv1Sear
{
	cursor:pointer;
	margin-right:5px;
}

.spanright2popupmenuDiv1Sear
{
	cursor:pointer;
}
/*这个CSS样式的高度需要利用JS设置*/
.deltaDivSear
{
	position:relative;
	/*margin-top:30px;*/
	margin-left:105px;
	/*border:1px dashed #00F;*/
	height:0px;
	width:500px;
}

.provinceSelectSear
{
	display:none;
	width:500px;
	height:200px;
	position:absolute;
	background-color:#FFFFF7;
	top:200px;
	left:210px;
	text-align:left;
	border-bottom:2px solid #F60;
}

.provSear
{
	line-height:25px;
	color:#414141;
	height:25px;
	width:80px;
	font-size:12px;
	float:left;
	text-align:center;
}

.proDiv1Sear
{
	padding-left:10px;
	height:35px;
	width:490px;
	background-image:url(static/images1/bottom-bg.gif);
	background-repeat:repeat-x;
	color:#FFF;
	font-size:12px;
}

.aSear
{
	color:#414141;
	text-decoration:none;
}

.aSear:hover
{
	color:#F60;
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
/*换页的css*/
ul.pagination {
    display: inline-block;
    padding: 0;
    margin: 0;
}

ul.pagination li {display: inline;}

ul.pagination li a {
    color: black;
    float: left;
    padding: 8px 16px;
    text-decoration: none;
}

</style>





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
<div class="div0Sear">
	高级搜索<span class="span0Sear">|</span>关键字搜索
</div>
<!--菜单栏结束-->

<!--搜索栏开始-->
<div class="div1Sear" id="id0">
	<div class="div11Sear"></div>
	<div class="div12Sear" id="id1"></div>
    <div class="div13Sear" id="id2">
    	<span class="span1Sear"><img class="img1Sear" src="static/images1/register-arrow.gif" />关键字搜索</span>
        <div class="div131Sear">
        	<input type="text" id="text" style="width:380px; border:1px solid #999; height:18px; background-image:url(static/images1/key_search.gif); background-repeat:no-repeat; padding-left:20px" />
            <input class="btn1Sear" id="btn" type="button" onclick="showchangeContent()" value="工作地点" />
        </div>
        <span class="span1Sear"><img class="img1Sear" src="static/images1/register-arrow.gif" />更多搜索条件</span>
        <div class="divExtraSear">
        	<div class="div132Sear">职能类别</div>
            <div class="div133Sear" onclick="openPop1()"></div>
            <div class="div134Sear">行业类别</div>
            <div class="div135Sear" onclick="openPop2()"></div>
        </div>
        
        <!--弹出菜单1绝对定位-->
        <!--11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-->
        
        <div class="popupDiv1Sear1" id="popup1">
        	<div class="popupmenuDiv1Sear1">
            	<img src="static/images1/orangearrow.gif" align="middle" /><span class="spanpopupmenuDiv1Sear">请选择您想搜索的职位</span>
                <span class="spanrightpopupmenuDiv1Sear1"><span class="spanright1popupmenuDiv1Sear" onclick="selectList1()">[确定]</span><span class="spanright2popupmenuDiv1Sear" onclick="cancelList1()">[关闭]</span></span>
            </div>
            <div class="popupmenu1Div1Sear1">
            	<div class="listdiv11Sear1"><input name="list" type="checkbox" />IT开发及应用</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />IT管理</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />销售管理</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />销售人员</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />银行</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />广告/媒介</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />写作/出版/印刷</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />生产/营运</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />服装/纺织/皮革</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />交通运输服务</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />市场/营销</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />房地产</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />医院/医疗/护理</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />财务/审计/税务</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />公务员</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />物业管理</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />人力资源</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />科研人员</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />教师</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />餐饮/娱乐</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />行政/后勤</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />美容/健身</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />在校学生</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />兼职</div>
                <div class="listdiv11Sear1"><input name="list" type="checkbox" />其他</div>
            </div>
        	
        </div>
        
        <!--22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222-->
        <!--弹出菜单2绝对定位-->
        <div class="popupDiv2Sear" id="popup2">
        	<div class="popupmenuDiv1Sear">
            	<img src="static/images1/orangearrow.gif" align="middle" /><span class="spanpopupmenuDiv1Sear">请选择您想搜索的行业</span>
                <span class="spanrightpopupmenuDiv1Sear"><span class="spanright1popupmenuDiv1Sear" onclick="selectList2()">[确定]</span><span class="spanright2popupmenuDiv1Sear" onclick="cancelList2()">[关闭]</span></span>
            </div>
            <div class="popupmenu2Div1Sear">
            	<div class="listdiv21Sear"><input name="list" type="checkbox" />计算机软件</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />计算机硬件</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />计算机服务</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />通信/电信/网络设备</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />互联网/电子商务</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />网络游戏</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />会计/审计</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />金融/投资/证券</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />银行</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />批发/零售</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />贸易/进出口</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />保险</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />办公用品设备</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />快速消费品</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />机械/设备/重工</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />教育/培训</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />学术/科研</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />科研人员</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />检测/认证</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />餐饮/娱乐</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />酒店/旅游</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />生活服务</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />美容/保健</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />航天/航空</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />石油/化工/矿产</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />采掘业/冶炼</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />电力/水利</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />原材料和加工</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />政府</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />非盈利机构</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />环保</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />农业/渔业/林业</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />多元化业务集团</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />法律</div>
                <div class="listdiv21Sear"><input name="list" type="checkbox" />其他行业</div>
            </div>
        </div>
        <!--列表菜单1-->
        <div class="deltaDivSear" id="id4">
        	<div class="listDiv1Sear" id="id5">
                <div class="listdiv12Sear" id="list0" >IT开发及应用</div>
                <div class="listdiv12Sear" id="list1">IT管理</div>
                <div class="listdiv12Sear" id="list2">销售管理</div>
                <div class="listdiv12Sear" id="list3">销售人员</div>
                <div class="listdiv12Sear" id="list4">银行</div>
                <div class="listdiv12Sear" id="list5">广告/媒介</div>
                <div class="listdiv12Sear" id="list6">写作/出版/印刷</div>
                <div class="listdiv12Sear" id="list7">生产/营运</div>
                <div class="listdiv12Sear" id="list8">服装/纺织/皮革</div>
                <div class="listdiv12Sear" id="list9">交通运输服务</div>
                <div class="listdiv12Sear" id="list10">市场/营销</div>
                <div class="listdiv12Sear" id="list11">房地产</div>
                <div class="listdiv12Sear" id="list12">医院/医疗/护理</div>
                <div class="listdiv12Sear" id="list13">财务/审计/税务</div>
                <div class="listdiv12Sear" id="list14">公务员</div>
                <div class="listdiv12Sear" id="list15">物业管理</div>
                <div class="listdiv12Sear" id="list16">人力资源</div>
                <div class="listdiv12Sear" id="list17">科研人员</div>
                <div class="listdiv12Sear" id="list18">教师</div>
                <div class="listdiv12Sear" id="list19">餐饮/娱乐</div>
                <div class="listdiv12Sear" id="list20">行政/后勤</div>
                <div class="listdiv12Sear" id="list21">美容/健身</div>
                <div class="listdiv12Sear" id="list22">在校学生</div>
                <div class="listdiv12Sear" id="list23">兼职</div>
                <div class="listdiv12Sear" id="list24">其他</div>
            </div>
            <!--列表菜单2-->
            <div class="listDiv2Sear" id="id6">
                <div class="listdiv22Sear" id="list25">计算机软件</div>
                <div class="listdiv22Sear" id="list26">计算机硬件</div>
                <div class="listdiv22Sear" id="list27">计算机服务</div>
                <div class="listdiv22Sear" id="list28">通信/电信/网络设备</div>
                <div class="listdiv22Sear" id="list29">互联网/电子商务</div>
                <div class="listdiv22Sear" id="list30">网络游戏</div>
                <div class="listdiv22Sear" id="list31">会计/审计</div>
                <div class="listdiv22Sear" id="list32">金融/投资/证券</div>
                <div class="listdiv22Sear" id="list33">银行</div>
                <div class="listdiv22Sear" id="list34">批发/零售</div>
                <div class="listdiv22Sear" id="list35">贸易/进出口</div>
                <div class="listdiv22Sear" id="list36">保险</div>
                <div class="listdiv22Sear" id="list37">办公用品设备</div>
                <div class="listdiv22Sear" id="list38">快速消费品</div>
                <div class="listdiv22Sear" id="list39">机械/设备/重工</div>
                <div class="listdiv22Sear" id="list40">教育/培训</div>
                <div class="listdiv22Sear" id="list41">学术/科研</div>
                <div class="listdiv22Sear" id="list42">科研人员</div>
                <div class="listdiv22Sear" id="list43">检测/认证</div>
                <div class="listdiv22Sear" id="list44">餐饮/娱乐</div>
                <div class="listdiv22Sear" id="list45">酒店/旅游</div>
                <div class="listdiv22Sear" id="list46">生活服务</div>
                <div class="listdiv22Sear" id="list47">美容/保健</div>
                <div class="listdiv22Sear" id="list48">航天/航空</div>
                <div class="listdiv22Sear" id="list49">石油/化工/矿产</div>
                <div class="listdiv22Sear" id="list50">采掘业/冶炼</div>
                <div class="listdiv22Sear" id="list51">电力/水利</div>
                <div class="listdiv22Sear" id="list52">原材料和加工</div>
                <div class="listdiv22Sear" id="list53">政府</div>
                <div class="listdiv22Sear" id="list54">非盈利机构</div>
                <div class="listdiv22Sear" id="list55">环保</div>
                <div class="listdiv22Sear" id="list56">农业/渔业/林业</div>
                <div class="listdiv22Sear" id="list57">多元化业务集团</div>
                <div class="listdiv22Sear" id="list58">法律</div>
                <div class="listdiv22Sear" id="list59">其他行业</div>
            </div>
        </div>
        
        
        <%--<div class="divtable1Sear">--%>
        	<table cellspacing="10">
            	<tr>
                	<td align="right" style="width:80px;">
                    	发布日期
                    </td>
                    <td>
                    	<select>
                        	<option selected="selected">--请选择--</option>
                            <option id="date">近一天</option>
                            <option id="date">近两天</option>
                            <option id="date">近三天</option>
                            <option id="date">近一周</option>
                            <option id="date">近两周</option>
                            <option id="date">近三周</option>
                            <option id="date">近一月</option>
                            <option id="date">近两月</option>
                            <option id="date">近三月</option>
                        </select>
                    </td>
                    <td align="right" style="width:80px;">
                    	工作年限
                    </td>
                    <td>
                    	<select id="user">
                        	<option selected="selected">--请选择--</option>
                            <option >在读学生</option>
                            <option >应届毕业生</option>
                            <option >一年以上</option>
                            <option >二年以上</option>
                            <option >三年以上</option>
                            <option >五年以上</option>
                            <option >八年以上</option>
                            <option >十年以上</option>
                        </select>
                    </td>
                    <td align="right" style="width:80px;">
                    	月薪范围
                    </td>
                    <td>
                    	<select id="salary">
                        	<option selected="selected">--请选择--</option>
                            <option >面议</option>
                            <option >1500以下</option>
                            <option >1500-1999</option>
                            <option >2000-2999</option>
                            <option >3000-5000</option>
                            <option >5001-8999</option>
                            <option >9000-12000</option>
                            <option >12000以上</option>
                        </select>
                    </td>
                </tr>
                <tr>
                	<td align="right" style="width:80px;">
                    	公司性质
                    </td>
                    <td>
                    	<select>
                        	<option selected="selected">--请选择--</option>
                            <option>外资（欧美）</option>
                            <option>外资（非欧美）</option>
                            <option>合资（欧美）</option>
                            <option>合资（非欧美）</option>
                            <option>国企/上市公司</option>
                            <option>民营/私营企业</option>
                            <option>外企代表处</option>
                            <option>其他</option>
                        </select>
                    </td>
                    <td align="right" style="width:80px;">
                    	学历要求
                    </td>
                    <td>
                    	<select id="requirement">
                        	<option selected="selected">--请选择--</option>
                            <option>无</option>
                            <option>初中</option>
                            <option>高中</option>
                            <option>中技</option>
                            <option>中专</option>
                            <option>大专</option>
                            <option>本科</option>
                            <option>硕士</option>
                            <option>博士</option>
                            <option>其他</option>
                            <option>不限</option>
                        </select>
                    </td>
                    <td align="right" style="width:80px;">
                    	工作类型
                    </td>
                    <td>
                    	<select>
                        	<option selected="selected">--请选择--</option>
                            <option>全职</option>
                            <option>兼职</option>
                        </select>
                    </td>
                </tr>
                <tr>
                	<td align="center" colspan="6">
                    	<input id="submit" type="button" style="background-image:url(static/images1/search-job.gif); width:134px; height:32px; border:0px;" />
                    </td>
                </tr>
            </table>
       <%-- </div>--%>
        <div >
            <table id="occupation"   cellpadding="0" cellspacing="1" style="height:0px; width:520px;">

        </table>
            <ul id="page"  class="pagination"></ul>
        </div>
    </div>
    <div class="div14Sear" id="id3"></div>
    <div class="div15Sear"></div>
    
    <div class="provinceSelectSear" id="prov">
    	<div class="proDiv1Sear">
           	<img src="static/images1/orangearrow.gif" align="middle" /><span class="spanpopupmenuDiv1Sear">请选择工作地点</span>
            <span class="spanrightpopupmenuDiv1Sear1"><span class="spanright2popupmenuDiv1Sear" onclick="changeContent(0)">[关闭]</span></span>
        </div>
        <div>
        	<div class="provSear"><a class="aSear" href="javascript:changeContent('北京市')">北京市</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('上海市')">上海市</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('广东省')">广东省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('深圳市')">深圳市</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('天津市')">天津市</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('重庆市')">重庆市</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('江苏省')">江苏省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('浙江省')">浙江省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('四川省')">四川省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('海南')">海南</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('福建省')">福建省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('山东省')">山东省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('江西省')">江西省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('广西')">广西</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('安徽省')">安徽省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('河北省')">河北省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('河南省')">河南省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('湖北省')">湖北省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('湖南省')">湖南省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('陕西省')">陕西省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('山西省')">山西省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('黑龙江省')">黑龙江省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('辽宁省')">辽宁省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('吉林省')">吉林省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('云南省')">云南省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('贵州省')">贵州省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('甘肃省')">甘肃省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('内蒙古')">内蒙古</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('宁夏')">宁夏</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('西藏')">西藏</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('新疆')">新疆</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('青海省')">青海省</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('香港')">香港</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('澳门')">澳门</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('台湾')">台湾</a></div>
            <div class="provSear"><a class="aSear" href="javascript:changeContent('国外')">国外</a></div>
        </div>
    </div>

</div>
<!--搜索栏结束-->
<!-- InstanceEndEditable -->
</div>
<div class="divdwt">
	网站导航&nbsp;&nbsp;|&nbsp;&nbsp;<a href="index1.jsp" class="adwt">网站首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="search.jsp" class="adwt">职位搜索</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">Myjob</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="register.html" class="adwt">用户注册</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">用户登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="intro.jsp" class="adwt">简历管理</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="company.jsp" class="adwt">招聘公司</a>
</div>
<div>
  <span class="spandwt">人才招聘&nbsp;Email:hr@51job.com</span>
  <span class="spandwt">个人求职&nbsp;Email:club@51job.com&nbsp;&nbsp;或垂询:800-820-5100</span>
  <span class="spandwt">未经本招聘网站同意，不得转载本网站之所有招聘信息及作品</span>
  <span class="spandwt">无忧工作网版权所有&copy;1999-2007</span>
  <span class="spandwt"><a href="index1.jsp"><img src="static/images1/bottom1.gif" class="imgdwt" /></a></span>
</div>
<script src="./static/js/jquery.min.js"></script>
<!-- InstanceBeginEditable name="EditRegion4" -->
<script type="text/javascript">



var numLeft=0;//记录左边选中的项目数目
var numRight=0;//记录右边选中的项目数目

var popup1=document.getElementById("popup1");

popup1.style.left=(document.body.clientWidth-570)/2;   //应该是对大小的判断

var popup2=document.getElementById("popup2");

popup2.style.left=(document.body.clientWidth-540)/2;

if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
{
	popup1.style.left=(document.body.clientWidth-570)/2+"px";
	popup2.style.left=(document.body.clientWidth-540)/2+"px";
}

var boxes=document.getElementsByName("list");//可用的全部checkbox数组  获得的是职能和行业的选择信息

var div1=document.getElementById("id0");

var div12=document.getElementById("id1");

var div13=document.getElementById("id2");

var div14=document.getElementById("id3");

var delta=document.getElementById("id4");

var listdiv1=document.getElementById("id5");

var listdiv2=document.getElementById("id6");

$(function (){
    $("#submit").click(function (){
        $.ajax({
            url:'search'
            ,method:'post'
            ,data:{data:selectList2(),ocname:selectList1(),salary:$("#salary").val(),requirement:$("#requirement").val()}
            ,success:function (data){
                $(".div13Sear").css('height','900px');  //左边的
                $(".div12Sear").css('height','900px');  //下方的
                $(".div14Sear").css('height','900px');  //右边的
                $(".div1Sear").css('height','940px');   //中间的主体
                    var str='';
                    var Page='';
                str+="<tr><th style='width:20px; height:25px'></th>"+
                    "<th style='width:150px''>职位名称</th>"+"<th style='width:150px''>职位要求 </th>"+"<th style='width:50px''>工资 </th>"+"<th style='width:60px''>工作地点 </th>"+"<th style='width:60px''>工时 </th>"+"<th style='width:60px''>公司名称 </th>"+"<th style='width:60px''>选择 </th>"+
                    "</tr>";
                for (var i = 0; i < data.data.list.length; i++) {
                    str+="<tr><th style='width:20px; height:25px'></th>"+
                        "<th style='width:150px''>"+
                    data.data.list[i].ocname+
                    "</th>"+"<th style='width:150px''>"+
                        data.data.list[i].requirement+
                        "</th>"+"<th style='width:50px''>"+
                        data.data.list[i].salary+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].workplace+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].worktime+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].cpyname+
                        "</th>"+"<th style='width:60px''><a href='SignUp?ocid="+data.data.list[i].id+"'>"+
                        "报名"+"</a></th>"+
                        "</tr>";
                }

                //换页
                for(var i=1;i<=data.data.pages; i++){
                    Page+="<li><a id='currectpage' onclick=''>«</a></li>";
                    Page+="<li><a id='currectpage' value='+i+'>"+i+"</a></li>";
                    Page+="<li><a id='currectpage' onclick=''>»</a></li>";
                }
                $("#occupation").html(str);
                $("#page").html(Page);
                alert("成功")
            }
            ,error:function (data){
                alert("失败")
            }
        })

    })

})



function selectList1()
{
	
	listdiv1.style.height=0;
	
	var numselected=0;
    var data='';
	for(i=0;i<25;i++)
	{
		if(boxes[i].checked&&numselected==0)
		{
			document.getElementById("list"+i).style.display="block";//将所有选中的显示出来
            data=document.getElementById("list"+i).innerHTML;
			numselected++;
		}
		else
		{
			document.getElementById("list"+i).style.display="none";//将所有未选中的隐藏
		}
	}
	numLeft=numselected;
	resetHeights();
	
	listdiv1.style.height=parseInt(listdiv1.offsetHeight)+numselected*25;
	
	if(numselected>=numRight)
	{
		setHeights(numselected);
	}
	else
	{
		setHeights(numRight);
	}
	numselected=0;
	//关闭选项面板2
	popup1.style.display="none";
    return data;
}

function resetHeights()
{
	
	if(navigator.userAgent.indexOf("MSIE")==-1)
	{
		
		div1.style.height=280+"px";
		
		div12.style.height=234+"px";
			
		div13.style.height=234+"px";
			
		div14.style.height=234+"px";
			
		delta.style.height=0+"px";
	}
	else
	{
		div1.style.height=280;
	
		div12.style.height=234;
			
		div13.style.height=234;
			
		div14.style.height=234;
			
		delta.style.height=0;
	}
	
	
}

function selectList2()
{
	var numselected=0;
	var data='';
	listdiv2.style.height=0;
	
	resetHeights();
	
	for(i=25;i<boxes.length;i++)
	{
		if(boxes[i].checked&&numselected==0)
		{
			document.getElementById("list"+i).style.display="block";//将所有选中的显示出来
            data=document.getElementById("list"+i).innerHTML;
            console.log(document.getElementById("list"+i).innerHTML)
			numselected++;
		}
		else
		{
			document.getElementById("list"+i).style.display="none";//将所有未选中的隐藏
		}
	}
	numRight=numselected;
	
	listdiv2.style.height=parseInt(listdiv2.offsetHeight)+numselected*25;
	
	if(numselected>=numLeft)
	{
		setHeights(numselected);
	}
	else
	{
		setHeights(numLeft);
	}
	numselected=0;
	//关闭选项面板2
	popup2.style.display="none";
    return data;
}


function setHeights(heights)
{
	if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
	{
		div1.style.height=div1.clientHeight+heights*25+"px";
		div12.style.height=div12.clientHeight+heights*25+"px";
		div13.style.height=div13.clientHeight+heights*25+"px";
		div14.style.height=div14.clientHeight+heights*25+"px";
		delta.style.height=delta.clientHeight+heights*25+"px";
	}
	else
	{
		div1.style.height=parseInt(div1.offsetHeight)+heights*25;
		div12.style.height=parseInt(div12.offsetHeight)+heights*25;
		div13.style.height=parseInt(div13.offsetHeight)+heights*25;
		div14.style.height=parseInt(div14.offsetHeight)+heights*25;
		delta.style.height=parseInt(delta.offsetHeight)+heights*25;
	}
}

function cancelList1()
{
	popup1.style.display="none";
}

function cancelList2()
{
	popup2.style.display="none";
}
//打开选项面板1
function openPop1()
{
	popup1.style.display="block";
}
//打开选项面板2
function openPop2()
{
	popup2.style.display="block";
}

var province=document.getElementById("prov");
province.style.left=(document.body.clientWidth-500)/2-40;

if(navigator.userAgent.indexOf("MSIE")==-1)
{
	province.style.left=(document.body.clientWidth-500)/2-40+"px";
}

function changeContent(index)
{
	if(index==0)
	{
		province.style.display="none";
	}
	else
	{
		document.getElementById("btn").value=index;
        alert(index);
        alert($("#text").val());
        $.ajax({
            url:'detailedSearch'
            ,method:'post'
            ,data:{ocname:$("#text").val(),workplace:index}
            ,success:function (data){
                $(".div13Sear").css('height','900px');  //左边的
                $(".div12Sear").css('height','900px');  //下方的
                $(".div14Sear").css('height','900px');  //右边的
                $(".div1Sear").css('height','940px');   //中间的主体
                var str='';
                var Page='';
                str+="<tr><th style='width:20px; height:25px'></th>"+
                    "<th style='width:150px''>职位名称</th>"+"<th style='width:150px''>职位要求 </th>"+"<th style='width:50px''>工资 </th>"+"<th style='width:60px''>工作地点 </th>"+"<th style='width:60px''>工时 </th>"+"<th style='width:60px''>公司名称 </th>"+"<th style='width:60px''>选择 </th>"+
                    "</tr>";
                for (var i = 0; i < data.data.list.length; i++) {
                    str+="<tr><th style='width:20px; height:25px'></th>"+
                        "<th style='width:150px''>"+
                        data.data.list[i].ocname+
                        "</th>"+"<th style='width:150px''>"+
                        data.data.list[i].requirement+
                        "</th>"+"<th style='width:50px''>"+
                        data.data.list[i].salary+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].workplace+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].worktime+
                        "</th>"+"<th style='width:60px''>"+
                        data.data.list[i].cpyname+
                        "</th>"+"<th style='width:60px''><a href='SignUp?ocid="+data.data.list[i].id+"'>"+
                        "报名"+"</a></th>"+
                        "</tr>";
                }
                //换页
                for(var i=1;i<=data.data.pages; i++){
                    Page+="<li><a id='currectpage' onclick=''>«</a></li>";
                    Page+="<li><a id='currectpage' value='+i+'>"+i+"</a></li>";
                    Page+="<li><a id='currectpage' onclick=''>»</a></li>";
                }

                $("#occupation").html(str);
                $("#page").html(Page);
                alert("成功")
            }
            ,error:function (data){
                alert("失败")
            }
        })

		province.style.display="none";
	}
	
}
/*function formfeedreduce(index){
    if(index==1){
        document.getElementById("currectpage").value=index;
    }else {
        document.getElementById("currectpage").value=index-1;
    }
}


function formfeed(index){
    document.getElementById("currectpage").value=index;
    alert(index);
}
function formfeedadd(index){
    if(index==data.data.pages){
        document.getElementById("currectpage").value=index;
    }else {
        document.getElementById("currectpage").value=index+1;
    }

}*/




function showchangeContent()
{
	province.style.display="block";
}


var pics=document.getElementsByName("pic");

pics[1].innerHTML="<img src='static/images1/menu2-1.gif' class='imgheaderdwt' />";


</script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>

