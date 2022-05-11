
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/my51JobDwt.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>招聘公司网页</title>

<style type="text/css">
.menuBar
{
	background-image:url(static/images1/menu-bg1.gif);
	height:33px;
	width:1000px;
	margin:auto;
	font-size:12px;
	color:#FFF;
	line-height:28px;
}

.cenCom
{
	height:631px;
	width:700px;
	margin:auto;
	/*border:1px dashed #00F;*/
}

.cen1Com
{
	height:65px;
	width:698px;
	text-align:left;
	background-color:#E5E5E5;
}

.cen2Com
{
	height:565px;
	width:698px;
	/*background-color:#F00;*/
}

.cen21Com
{
	display:inline-block;
	float:left;
	width:172px;
	height:540px;
	background-image:url(static/images1/company-bg.gif);
}

.cen211Com
{
	width:172px;
	height:120px;
	font-size:12px;
	text-align:left;
}

.cen212Com
{
	width:172px;
	height:130px;
	font-size:12px;
}

.cen213Com
{
	width:172px;
	height:120px;
	font-size:12px;
}

.cen22Com
{
	float:right;
	width:522px;
	height:540px;
	/*background-color:#00F;*/
}

.popupCom
{
	position:relative;
	width:698px;
	height:25px;
	background-color:#FFF;
}

.p0Com
{
	float:left;
	line-height:23px;
	font-size:12px;
	height:23;
	width:172px;
	margin-left:1px;
	margin-top:1px;
	margin-bottom:1px;
	background-color:#E5E5E5;
	text-align:center;
	color:#000;
}

.p1Com
{
	float:left;
	line-height:23px;
	font-size:12px;
	height:24px;
	width:86px;
	margin-left:1px;
	margin-top:1px;
/*	margin-bottom:1px;*/
	background-color:#E5E5E5;
	text-align:center;
	color:#000;
}

.p1Com:hover
{
	color:#FFF;
	background-color:#900;
}

.aDivCom
{
	text-decoration:none;
}

.aDivCom:hover
{
	color:#FFF;
	background-color:#900;
	text-decoration:none;
}

.p11Com
{
	line-height:23px;
	font-size:12px;
	height:23px;
	width:86px;
	margin-left:1px;
	margin-top:1px;
	background-color:#E5E5E5;
	text-align:center;
	color:#000;
}

.p11Com:hover
{
	color:#FFF;
	background-color:#900;
}

.p12Com
{
	line-height:23px;
	font-size:12px;
	height:23px;
	width:87px;
	margin-right:1px;
	margin-top:1px;
	background-color:#E5E5E5;
	text-align:center;
	color:#000;
}
.p12Com:hover
{
	color:#FFF;
	background-color:#900;
}


.p13Com
{
}

.p116Com
{
}

.ab1Com
{
	display:none;
	width:87px;
	height:192px;
	position:absolute;
	left:173px;
	top:25px;
	/*background-color:#9CF;*/
	background-color:#FFFFF7;
	z-index:9;
}

.ab2Com
{
	display:none;
	width:87px;
	height:48px;
	position:absolute;
	left:260px;
	top:25px;
	background-color:#FFFFF7;
	z-index:9;
}

.ab3Com
{
	display:none;
	width:87px;
	height:72px;
	position:absolute;
	left:347px;
	top:25px;
	background-color:#FFFFF7;
	z-index:9;
}

.ab6Com
{
	display:none;
	width:88px;
	height:72px;
	position:absolute;
	left:611px;
	top:25px;
	background-color:#FFFFF7;
	z-index:9;
}

th
{
	background-color:#DCE2EE;
	border-top:1px solid #98ACC4;
	height:20px;
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
	<div class="headerleftdwt"><img src="static/images1/logo.gif" /></div>
    <div class="headerrightdwt">
        <a href="allLogin.jsp" name="pic"><img src="static/images1/menu1-2.gif" class="imgheaderdwt" /></a>
        <a href="search.jsp" name="pic"><img src="static/images1/menu2-2.gif" class="imgheaderdwt" /></a>
        <a href="intro.jsp" name="pic"><img src="static/images1/menu3-2.gif" class="imgheaderdwt" /></a>
    </div>
</div>
<!-- InstanceBeginEditable name="EditRegion3" -->
<!--菜单栏开始-->

<div class="menuBar">
	公司招聘网页
</div>
<!--菜单栏结束-->

<div id="cenCom" class="cenCom">
	<!--头部开始-->
	<div class="cen1Com">
    	<div style="vertical-align:top; margin-left:10px">
        	<img src="static/images1/zx-banner.gif" style="margin-right:80px; margin-top:10px;" align="top" /><!--style="height:50px; margin-right:10px; width:390px; margin-top:8px"-->
        	<div id="flashpic" style="height:50px; margin-right:0px; margin-top:5px; width:390px; background-color:#0FF; display:inline-block">
            	<embed src="static/images1/zxtop.swf" style="height:50px; width:390px;" ></embed>
            </div>
        </div>
        <div class="popupCom">
        	<a href="index.html"><div class="p0Com">首页</div></a>
            <a class="aDivCom" href="#"><div id="pop1Com" onmouseover="showChilds(1)" onmouseout="resetC()" class="p1Com">关于中信</div></a>
            <a class="aDivCom" href="#"><div id="pop2Com" onmouseover="showChilds(2)" onmouseout="resetC()" class="p1Com">公司业务</div></a>
            <a class="aDivCom" href="#"><div id="pop3Com" onmouseover="showChilds(3)" onmouseout="resetC()" class="p1Com">公益事业</div></a>
            <a class="aDivCom" href="#"><div id="pop4Com" class="p1Com" style="width:87px;">中信研究</div></a>
            <a class="aDivCom" href="#"><div id="pop5Com" class="p1Com" style="width:87px;">推荐招聘</div></a>
            <a class="aDivCom" href="#"><div id="pop6Com" onmouseover="showChilds(4)" onmouseout="resetC()" class="p1Com" style="width:87px">特色推荐</div></a>
            
            <!--以下为弹出内容-->
            <div id="cd1" class="ab1Com" onmouseover="showChilds(1)" onmouseout="resetC()">
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('公司简介')"><div id="pop2Com" class="p11Com">公司简介</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('集团领导')"><div id="pop3Com" class="p11Com">集团领导</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('领导题词')"><div id="pop3Com" class="p11Com">领导题词</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('业务回顾')"><div id="pop3Com" class="p11Com">业务回顾</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('公司历史')"><div id="pop3Com" class="p11Com">公司历史</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('中信风格')"><div id="pop3Com" class="p11Com">中信风格</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('公司年报')"><div id="pop3Com" class="p11Com">公司年报</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('公司要闻')"><div id="pop3Com" class="p11Com">公司要闻</div></a>
                
            </div>
            <div id="cd2" class="ab2Com" onmouseover="showChilds(2)" onmouseout="resetC()">
            	<a class="aDivCom" onclick="resetC()" href="javascript:showcontent('金融')"><div id="pop2Com" class="p11Com">金融</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('非金融')"><div id="pop3Com" class="p11Com">非金融</div></a>
            </div>
            <div id="cd3" class="ab3Com" onmouseover="showChilds(3)" onmouseout="resetC()">
            	<a class="aDivCom" onclick="resetC()" href="javascript:showcontent('扶贫')"><div id="pop2Com" class="p11Com">扶贫</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('绿化')"><div id="pop3Com" class="p11Com">绿化</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('援藏')"><div id="pop3Com" class="p11Com">援藏</div></a>
            </div>
            <div id="cd4" class="ab6Com" onmouseover="showChilds(4)" onmouseout="resetC()">
            	<a class="aDivCom" onclick="resetC()" href="javascript:showcontent('网络金融')"><div id="pop2Com" class="p12Com">网络金融</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('中信出版')"><div id="pop3Com" class="p12Com">中信出版</div></a>
                <a class="aDivCom" onclick="resetC()" href="javascript:showcontent('会展服务')"><div id="pop3Com" class="p12Com">会展服务</div></a>
            </div>
            
        </div>
    </div>
	<!--头部结束-->
	<!--中间开始-->
	<div id="cen2Com" class="cen2Com">
    	<!--左边开始-->
        <div id="cen21Com" class="cen21Com">
        	<div class="cen211Com">
            	<table style="height:100px; margin-top:5px;">
                	<tr>
                    	<td style="width:60px" align="center">
                        	用户名：
                        </td>
                        <td>
                        	<input type="text" style="width:95px; height:13px" />
                        </td>
                    </tr>
                    <tr>
                    	<td align="center">
                        	密码：
                        </td>
                        <td>
                        	<input type="password" style="width:95px; height:13px" />
                        </td>
                    </tr>
                    <tr>
                    	<td align="right">
                        	<input type="button" value="登录" style="border:1px solid #999; width:50px; height:25px;" />
                        </td>
                        <td align="center" style="padding-left:20px">
                        	<input type="button" value="重置" style="border:1px solid #999; width:50px; height:25px" />
                        </td>
                    </tr>
                </table>
            </div>
            <img src="static/images1/company-left01.gif" />
            <div class="cen212Com">
            	<table style="height:120px; width:140px; margin-left:20px; padding-top:5px">
                	<tr>
                    	<td style="width:15px; height:15px" align="left">
                        	<img src="static/images1/company-arrow.gif" />
                        </td>
                        <td align="left" style="height:15px;">
                        	<a href="javascript:showTable(1)" style="text-decoration:none; color:#000">热点招聘</a>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2" style="height:2px; background-repeat:repeat-x; background-image:url(static/images1/company-dot.gif)"></td>
                    </tr>
                    <tr>
                    	<td style="width:15px; height:15px" align="left">
                        	<img src="static/images1/company-arrow.gif" />
                        </td>
                        <td align="left" style="height:15px">
                        	<a href="javascript:showTable(2)" style="text-decoration:none; color:#000">检索职位</a>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2" style="height:2px; background-repeat:repeat-x; background-image:url(static/images1/company-dot.gif)"></td>
                    </tr>
                    <tr>
                    	<td style="width:15px; height:15px" align="left">
                        	<img src="static/images1/company-arrow.gif" />
                        </td>
                        <td align="left" style="height:15px">
                        	<a href="javascript:showTable(3)" style="text-decoration:none; color:#000">注册</a>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2" style="height:2px; background-repeat:repeat-x; background-image:url(static/images1/company-dot.gif)"></td>
                    </tr>
                    <tr>
                    	<td style="width:15px; height:15px" align="left">
                        	<img src="static/images1/company-arrow.gif" />
                        </td>
                        <td align="left" style="height:15px">
                        	<a href="javascript:showTable(4)" style="text-decoration:none; color:#000">找回密码</a>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2" style="height:2px; background-repeat:repeat-x; background-image:url(static/images1/company-dot.gif)"></td>
                    </tr>
                </table>
            </div>
            <img src="static/images1/company-left02.gif" />
            <div class="cen213Com">
            	<table style="width:150px; margin-left:10px; margin-top:5px" >
                	<tr>
                    	<td align="left">
                        	请选择城市：
                        </td>
                    </tr>
                    <tr>
                    	<td>
                        	<select id="pro" style="width:120px" onchange="addCities()">
                                <!--option value="0">--请选择--</option-->
                            </select>
                            
                        	<!--select style="width:120px">
                            	<option selected="selected">——选择省份——</option>
                            	<option>北京市</option>
                                <option>上海市</option>
                                <option>广东省</option>
                                <option>深圳市</option>
                                <option>天津市</option>
                                <option>重庆市</option>
                                <option>江苏省</option>
                                <option>浙江省</option>
                                <option>四川省</option>
                                <option>海南</option>
                                <option>福建省</option>
                                <option>山东省</option>
                                <option>江西省</option>
                                <option>广西</option>
                                <option>安徽省</option>
                                <option>河北省</option>
                                <option>河南省</option>
                                <option>湖北省</option>
                                <option>湖南省</option>
                                <option>陕西省</option>
                                <option>山西省</option>
                                <option>黑龙江省</option>
                                <option>辽宁省</option>
                                <option>吉林省</option>
                                <option>云南省</option>
                                <option>贵州省</option>
                                <option>甘肃省</option>
                                <option>内蒙古</option>
                                <option>宁夏</option>
                                <option>西藏</option>
                                <option>新疆</option>
                                <option>青海省</option>
                                <option>香港</option>
                                <option>澳门</option>
                                <option>台湾</option>
                                <option>国外</option>
                            </select-->
                        </td>
                    </tr>
                    <tr>
                    	<td>
                        	<select id="city" style="width:120px">
                                <option value="0">--请选择--</option>
                            </select>
                        	<!--select style="width:120px">
                            	<option>——选择城市——</option>
                            </select-->
                        </td>
                    </tr>
                    <tr>
                    	<td valign="bottom" style="height:25px;">
                        	<input type="button" value="查询" style="border:1px solid #999; height:20px" />
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    	<!--左边结束-->
        <!--右边开始-->
        <div id="cen22Com" class="cen22Com" style="z-index:-10">
        	<div id="scrollPic" style="height:65px; width:520px; margin-top:2px; z-index:-10">
            	<img src="static/images1/scroll1.jpg" width="520" style="z-index:-10" />
            </div>
            <div id="name1" style="width:520px; height:12px; margin-top:15px; text-align:left; display:block; z-index:-10">
            	<img src="static/images1/company-arrow.gif" />
                <span style="color:#FF7000; font-weight:bold; font-size:12px; margin-left:5px">热点招聘</span>
            </div>
            
            <div id="table1" style="font-size:12px; height:500px; width:520px; margin-top:20px; display:block; z-index:-10">
                <table cellpadding="0" cellspacing="1" style="height:400px; width:520px;">
                    <tr>
                        <th style="width:20px; height:25px">
                            
                        </th>
                        <th style="width:150px">
                            职位名称
                        </th>
                        <th style="width:150px;">
                            公司名称
                        </th>
                        <th style="width:40px">
                            人数
                        </th>
                        <th style="width:60px">
                            地点
                        </th>
                        <th style="width:60px">
                            发布时间
                        </th>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            1
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            计划管理主管
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            1
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            北京
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-13
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            2
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            数字电视产品策划
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中心网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            北京
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-12
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            3
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            数字电视业务管理专员
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            北京
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-12
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            4
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            运维工程师-电源系统
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            1
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            南京，郑州 北京，上海 广州，深圳 福州，武汉 天津，长沙 郑州，济南
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-08
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            5
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            运行维护工程师
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            北京，上海 广州，深圳 杭州，南京 福州，武汉
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-07
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            6
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            战略研究投资分析师
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信网络有限公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            北京
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-07
                        </td>
                    </tr>
                    <tr style="background-color:#FBFAFF;">
                        <td style="border-bottom:1px #DCE2EE solid">
                            7
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            预算管理主管
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            中信天津工业发展公司
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            1
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            天津
                        </td>
                        <td style="border-bottom:1px #DCE2EE solid">
                            2007-10-06
                        </td>
                    </tr>
                </table>
            </div>
            <!--111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111-->
            
            <div id="name2" style="width:520px; height:12px; margin-top:15px; text-align:left; display:none; z-index:-10">
            	<img src="static/images1/company-arrow.gif" />
                <span style="color:#FF7000; font-weight:bold; font-size:12px; margin-left:5px">添加检索器</span>
            </div>
            
            <div id="table2" style="font-size:12px; height:500px; width:520px; margin-top:20px; display:none; z-index:-10">
                <table cellpadding="0" cellspacing="2" style="height:280px; width:520px;">
                    <tr>
                    	<td style="background-color:#DCE2EE; width:160px">
                        	公司名称关键字
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	职位名称关键字
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	职位类型
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	发布日期
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	工作地区
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	薪酬范围
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	其他关键字
                        </td>
                        <td align="left">
                        	<textarea style="height:80px; width:280px"></textarea>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2">
                        	<input type="button" value="搜索" style="border:1px solid #000; background-color:#CCC" />
                        </td>
                    </tr>
                </table>
            </div>
            
            <!--222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222-->
            
            <div id="name3" style="width:520px; height:12px; margin-top:15px; text-align:left; display:none; z-index:-10">
            	<img src="static/images1/company-arrow.gif" />
                <span style="color:#FF7000; font-weight:bold; font-size:12px; margin-left:5px">用户注册</span>
            </div>
            
            <div id="table3" style="font-size:12px; height:500px; width:520px; margin-top:20px; display:none; z-index:-10">
                <table cellpadding="0" cellspacing="2" style="height:140px; width:520px;">
                    <tr>
                    	<td style="width:50px; background-color:#DCE2EE">
                        	E-mail
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                        <td style="width:30px">
                        	
                        </td>
                        <td style="width:50px; background-color:#DCE2EE">
                        	用户名
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	密码
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                        <td>
                        	
                        </td>
                        <td style="background-color:#DCE2EE">
                        	确认密码
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td style="background-color:#DCE2EE">
                        	联系方式
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                        <td>
                        	
                        </td>
                        <td style="background-color:#DCE2EE">
                        	地址
                        </td>
                        <td>
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="5" style="height:40px">
                        	<input type="button" value="注册" style="border:1px solid #666; background-color:#CCC" />
                        </td>
                    </tr>
                </table>
            </div>
            
            
            <!--3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333-->
            
            <div id="name4" style="width:520px; height:12px; margin-top:15px; text-align:left; display:none; z-index:-10">
            	<img src="static/images1/company-arrow.gif" />
                <span style="color:#FF7000; font-weight:bold; font-size:12px; margin-left:5px">找回密码</span>
            </div>
            
            <div id="table4" style="font-size:12px; height:500px; width:520px; margin-top:20px; display:none; z-index:-10">
                <table cellpadding="0" cellspacing="2" style="height:80px; width:350px;">
                    <tr>
                    	<td bgcolor="#DCE2EE" style="width:150px">
                        	请输入用户名
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td bgcolor="#DCE2EE" style="width:150px">
                        	请输入注册邮箱
                        </td>
                        <td align="left">
                        	<input type="text" />
                        </td>
                    </tr>
                    <tr>
                    	<td>
                        	
                        </td>
                        <td>
                        	<input type="button" value="确定" style="border:1px solid #999; background-color:#CCC" />
                        </td>
                    </tr>
                </table>
            </div>
            
            <!--4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-->
        </div>
        
        <!--右边结束-->
	</div>
	<!--中间结束-->
</div>

<!-- InstanceEndEditable -->
</div>
<div class="divdwt">
	网站导航&nbsp;&nbsp;|&nbsp;&nbsp;<a href="index1.jsp" class="adwt">网站首页</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="search.jsp" class="adwt">职位搜索</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">Myjob</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;<a href="allLogin.jsp" class="adwt">用户登录</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="intro.jsp" class="adwt">简历管理</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="company.jsp" class="adwt">招聘公司</a>
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
/**************************************************城市级联JS开始**************************************************/

var pro=new Array();
pro[0]=["--请选择--"];
pro[1]=["浙江省","杭州","嘉兴","宁波"];
pro[2]=["江苏省","苏州","南京","无锡"];
pro[3]=["山东省","济南","济宁","德州"];

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

/**************************************************城市级联JS结束**************************************************/
function showcontent(index)
{
	alert(index);
}




var c1=document.getElementById("cd1");
var c2=document.getElementById("cd2");
var c3=document.getElementById("cd3");
var c4=document.getElementById("cd4");

function showChilds(index)
{
	switch (index)
	{
		case 1:
			c1.style.display="block";
			break;
		case 2:
			c2.style.display="block";
			break;
		case 3:
			c3.style.display="block";
			break;
		case 4:
			c4.style.display="block";
			break;
	}
	
	resetO(index);
}


function resetO(index)
{
	for(i=1;i<5;i++)
	{
		if(i!=index)
		{
			document.getElementById("cd"+i).style.display="none";
		}
	}
}

function resetC()
{
	c1.style.display="none";
	c2.style.display="none";
	c3.style.display="none";
	c4.style.display="none";
}

var myIndex=1;

function scrollPic()
{
	document.getElementById("scrollPic").innerHTML="<img src='images/scroll"+myIndex+".jpg' style='z-index:-10' width='520' />";
	myIndex++;
	if(myIndex>4)
	{
		myIndex=1;
	}
	window.setTimeout("scrollPic()",1000);
}



var name1=document.getElementById("name1");
var table1=document.getElementById("table1");

var name2=document.getElementById("name2");
var table2=document.getElementById("table2");

var name3=document.getElementById("name3");
var table3=document.getElementById("table3");

var name4=document.getElementById("name4");
var table4=document.getElementById("table4");


var cenCom=document.getElementById("cenCom");
var cen2Com=document.getElementById("cen2Com");
var cen21Com=document.getElementById("cen21Com");
var cen22Com=document.getElementById("cen22Com");

if(navigator.userAgent.indexOf("MSIE")==-1)
{
	if(navigator.userAgent.indexOf("Chrome")==-1)
	{
		document.getElementById("flashpic").innerHTML="";//关闭flash播放，因为没有安装插件
	}
	//document.getElementById("flashpic").style.display="none";
	cenCom.style.height=602+"px";
	cen2Com.style.height=536+"px";
	cen21Com.style.height=516+"px";
	cen22Com.style.height=516+"px";
	
	
	
	
}

function showTable(index1)
{
	
	name1.style.display="none";
	table1.style.display="none";
	name2.style.display="none";
	table2.style.display="none";
	name3.style.display="none";
	table3.style.display="none";
	name4.style.display="none";
	table4.style.display="none";
	

	
	
	switch (index1)
	{
		case 1:
		name1.style.display="block";
		table1.style.display="block";
		if(navigator.userAgent.indexOf("MSIE")!=-1)
		{
			cenCom.style.height=631;
			cen2Com.style.height=565;
			cen21Com.style.height=540;
			cen22Com.style.height=540;
		}
		else if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
		{
			cenCom.style.height=602+"px";
			cen2Com.style.height=536+"px";
			cen21Com.style.height=516+"px";
			cen22Com.style.height=516+"px";
		}
		
		
			break;
		case 2:
		name2.style.display="block";
		table2.style.display="block";
		if(navigator.userAgent.indexOf("MSIE")!=-1)
		{
			cenCom.style.height=551;
			cen2Com.style.height=485;
			cen21Com.style.height=460;
			cen22Com.style.height=460;
		}
		else if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
		{
			cenCom.style.height=551+"px";
			cen2Com.style.height=485+"px";
			cen21Com.style.height=460+"px";
			cen22Com.style.height=460+"px";
		}
		
			break;
		case 3:
		name3.style.display="block";
		table3.style.display="block";
		
		if(navigator.userAgent.indexOf("MSIE")!=-1)
		{
			cenCom.style.height=551;
			cen2Com.style.height=485;
			cen21Com.style.height=460;
			cen22Com.style.height=460;
		}
		else if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
		{
			cenCom.style.height=551+"px";
			cen2Com.style.height=485+"px";
			cen21Com.style.height=460+"px";
			cen22Com.style.height=460+"px";
		}
		
			break;
		case 4:
		name4.style.display="block";
		table4.style.display="block";
		
		if(navigator.userAgent.indexOf("MSIE")!=-1)
		{
			cenCom.style.height=551;
			cen2Com.style.height=485;
			cen21Com.style.height=460;
			cen22Com.style.height=460;
		}
		else if(navigator.userAgent.indexOf("Chrome")!=-1||navigator.userAgent.indexOf("Mozilla")!=-1)
		{
			cenCom.style.height=551+"px";
			cen2Com.style.height=485+"px";
			cen21Com.style.height=460+"px";
			cen22Com.style.height=460+"px";
		}
		
			break;
	}
}

//弹出广告
function openPopup()
{
	
	if(navigator.userAgent.indexOf("Chrome")!=-1&&navigator.userAgent.indexOf("MSIE")==-1)
	{
		window.showModalDialog("open.html","_blank","dialogHeight=300px; dialogWidth=366px; status=no; location=no; scroll=no; toolbar=no; menubar=no; status=no");

	}
	else if(navigator.userAgent.indexOf("Mozilla")!=-1&&navigator.userAgent.indexOf("MSIE")==-1)
	{
		window.showModalDialog("open.html","_blank","dialogHeight=300px; dialogWidth=370px; status=0; navigator='0'; location=0; scroll=0; toolbar=no; menubar=no; status=no");
	}
	else
	{
		window.showModalDialog("open.html","_blank","dialogHeight=290px; dialogWidth=350px; status=no; location=no; scroll=no; toolbar=no; menubar=no; status=no");
	}
}

/*window.onload=openPopup;//弹出广告*/

function startMth()
{
/*	if(navigator.userAgent.indexOf("Chrome")==-1)
	{
		openPopup();
	}*/
	
	/*if(navigator.userAgent.indexOf("Chrome")!=-1)
	{
		alert("这是谷歌浏览器");
	}*/
	openPopup();
	//
	scrollPic();
}

window.onload=startMth;


</script>
<!-- InstanceEndEditable -->
</body>
<!-- InstanceEnd --></html>

