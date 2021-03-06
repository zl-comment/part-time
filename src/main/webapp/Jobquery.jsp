<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/15
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>招聘发布</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="./static/css/style.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
<div class="single-header">
    <div class="wrap">
        <div class="logo">
            <a href="static/index.html"><img src="./static/images/logo.png" alt="加载中"/></a>
        </div>
        <div class="header-right">
            <div id='cssmenu'>
                <ul>
                    <li><a href='static/about.html'><span>About</span></a></li> |
                    <li class='active'><a href='static/index.html'><span>Services</span></a>
                        <ul>
                            <li class='has-sub'><a href='static/index.html'><span>Service 1</span></a></li>
                            <li class='has-sub'><a href='static/index.html'><span>Service 2</span></a></li>
                        </ul>
                    </li> |
                    <li class='has-sub'><a href='static/works.html'><span>Works</span></a></li> |
                    <li class='has-sub'><a href='static/blog.html'><span>Blog</span></a></li> |
                    <li class='last'><a href='static/contact.html'><span>Contact Us</span></a></li>
                </ul>
            </div>
            <div class="search_box">
                <form>
                    <input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
                </form>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="work-top">
    <div class="wrap">
        <div class="single-left">
            <h1>Get in touch with us</h1>
        </div>
        <div class="clear"></div>
    </div>
</div>
<div class="main">
    <div class="contact">
        <div class="wrap">
            <div class="section group example">
                <div class="col_1_of_2 span_1_of_2">
                    <div class="contact-form">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                        <form method="post" action="updateOccupationById">
                            <div>
                                <input  type="hidden"  name="ocid"  value="${occupation.id}">   <%--gongsiid--%>
                            </div>

                            <div>
                                <span><label>职位名称</label></span>
                                <input   name="ocname"  value="${occupation.ocname}">
                            </div>
                            <div>
                                <span><label>工作地点</label></span>

                                <input  name="workplace"  value="${occupation.workplace}">
                            </div>
                            <div>
                                <span><label>工作时间</label></span>

                                <input   name="worktime" value="${occupation.worktime}">
                            </div>

                            <div>
                                <span><label>工作薪水</label></span>
                                <span>
                                    <select name ="salary">
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
                                </span>
                            </div>

                            <div>
                                <span><label>招聘要求</label></span>
                                <input   name="requirement" value="${occupation.requirement}">
                            </div>

                            <div class="button" >    <%--你的ocid只在这传，传给jobQuery 那在传一下么，那就写在页面中--%>
                                <span><a href="getOccupationsCompany?ocid=${occupation.id}&&companyid=${companyid}"  >返回</a></span>
                            </div>
                            <div>
                                <span><input type="submit"  value="修改"></span>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col_1_of_2 span_1_of_2">
                    <ul class="list3">
                        <li>
                            <img src="./static/images/location.png" alt=""/>
                            <div class="company_address">
                                <h3>Company Information :</h3>
                                <p>500 Lorem Ipsum Dolor Sit,</p>
                                <p>22-56-2-9 Sit Amet, Lorem,</p>
                                <p>USA</p>
                                <p>Phone:(00) 222 666 444</p>
                                <p>Fax: (000) 000 00 00 0</p>
                                <p>Email: <span>info[at]bluebox.com</span></p>
                            </div>
                        </li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
<div class="footer">
    <div class="wrap">
        <div class="footer-left">
            <ul class="footer-nav">
                <li><a href="static/index.html">Home</a></li> |
                <li><a href="static/about.html">About</a></li> |
                <li><a href="static/index.html">Services</a></li> |
                <li><a href="static/works.html">Work</a></li> |
                <li><a href="static/blog.html">Blog</a></li> |
                <li><a href="static/contact.html">Contact</a></li>
            </ul>
            <div class="copy">
                <p>© 2018 </p>
            </div>
        </div>
        <div class="social">
            <ul>
                <li class="facebook"><a href="#"><span> </span></a></li>
                <li class="linkedin"><a href="#"><span> </span></a></li>
                <li class="twitter"><a href="#"><span> </span></a></li>
                <li class="pinterest"><a href="#"><span> </span></a></li>
                <li class="dribble"><a href="#"><span> </span></a></li>
                <li class="google"><a href="#"><span> </span></a></li>
            </ul>
        </div>
        <div class="clear"></div>
    </div>
</div>
</body>
</html>