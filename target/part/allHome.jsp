<%@ page import="com.zx.beans.Company" %><%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2022/3/16
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Free Bluebox Website Template | Home </title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="./static/css/style.css" rel="stylesheet" type="text/css" media="all" />

    <!-- jQuery -->
    <script type="text/javascript" src="./static/js/jquery.min.js"></script>
    <!-- Add fancyBox main JS and CSS files -->
    <script src="./static/js/jquery.magnific-popup.js" type="text/javascript"></script>
    <link href="./static/css/magnific-popup.css" rel="stylesheet" type="text/css">
    <script>
        $(document).ready(function() {
            $('.popup-with-zoom-anim').magnificPopup({
                type: 'inline',
                fixedContentPos: false,
                fixedBgPos: true,
                overflowY: 'auto',
                closeBtnInside: true,
                preloader: false,
                midClick: true,
                removalDelay: 300,
                mainClass: 'my-mfp-zoom-in'
            });
        });
    </script>
    <script src="./static/js/jquery.hoverdir.js"></script>
    <script type="text/javascript">
        $(function() {

            $(' #da-thumbs > li ').each( function() { $(this).hoverdir({
                hoverDelay : 50,
                inverse : true
            }); } );

        });
    </script>
</head>
<body>
<div class="header">
    <div class="wrap">
        <div class="logo">
            <a href="allHome.jsp"><img src="./static/images/logo.png" alt=""/></a>
        </div>
        <div class="header-right">
            <div id='cssmenu'>
                <ul>
                    <li><a href='static/about.html'><span>About</span></a></li> |
                    <li class='active'><a href='allHome.jsp'><span>Services</span></a>
                        <ul>
                            <li class='has-sub'><a href='allHome.jsp'><span>Service 1</span></a></li>
                            <li class='has-sub'><a href='allHome.jsp'><span>Service 2</span></a></li>
                        </ul>
                    </li>
                    <li class='has-sub'><a href='static/works.html'><span>Works</span></a></li> |
                    <li class='has-sub'><a href='static/blog.html'><span>Blog</span></a></li> |
                    <li class='last'><a href='myInformation?user=${user}' ><span>我的信息</span></a></li>
                </ul>
                <%--<%=session.getAttribute("user")  %>--%>


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
<div class="index-banner">
    <div class="wrap">
        <div class="wmuSlider example1">
            <article style="position: absolute; width: 100%; opacity: 0;">
                <div class="banner-wrap">
                    <div class="cont span_2_of_3">
                        <h1>We are a Creative Digital Agency</h1>
                    </div>
                    <div class="rsidebar span_1_of_3">
                        <div class="btn"><a href="static/works.html">Learn More</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="banner">
                    <img src="./static/images/mac.png" alt=""/>
                </div>
            </article>
            <article style="position: relative; width: 100%; opacity: 1;">
                <div class="banner-wrap">
                    <div class="cont span_2_of_3">
                        <h1>We are a Creative Digital Agency</h1>
                    </div>
                    <div class="rsidebar span_1_of_3">
                        <div class="btn"><a href="static/works.html">Learn More</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="banner">
                    <img src="./static/images/mac1.png" alt=""/>
                </div>
            </article>
            <article style="position: absolute; width: 100%; opacity: 0;">
                <div class="banner-wrap">
                    <div class="cont span_2_of_3">
                        <h1>We are a Creative Digital Agency</h1>
                    </div>
                    <div class="rsidebar span_1_of_3">
                        <div class="btn"><a href="static/works.html">Learn More</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="banner">
                    <img src="./static/images/mac.png" alt=""/>
                </div>
            </article>
            <article style="position: absolute; width: 100%; opacity: 0;">
                <div class="banner-wrap">
                    <div class="cont span_2_of_3">
                        <h1>We are a Creative Digital Agency</h1>
                    </div>
                    <div class="rsidebar span_1_of_3">
                        <div class="btn"><a href="static/works.html">Learn More</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="banner">
                    <img src="./static/images/mac1.png" alt=""/>
                </div>
            </article>
            <article style="position: absolute; width: 100%; opacity: 0;">
                <div class="banner-wrap">
                    <div class="cont span_2_of_3">
                        <h1>We are a Creative Digital Agency</h1>
                    </div>
                    <div class="rsidebar span_1_of_3">
                        <div class="btn"><a href="static/works.html">Learn More</a></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="banner">
                    <img src="./static/images/mac.png" alt=""/>
                </div>
            </article>
        </div>
    </div>
    <script src="./static/js/jquery.wmuSlider.js"></script>
    <script>
        $('.example1').wmuSlider();
    </script>
</div>
<div class="main">
    <div class="wrap">
        <div class="content-top">
            <div class="col_1_of_3 span_1_of_3">
                <h3>Web Design</h3>
                <img src="./static/images/icon.png" alt=""/>
                <p>Lorem ipsum dolor sit amet, consectetur <br>adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                <div class="btn-link"><a href="#">read more</a></div>
            </div>
            <div class="col_1_of_3 span_1_of_3">
                <h3>Social Media</h3>
                <img src="./static/images/icon1.png" alt=""/>
                <p>Lorem ipsum dolor sit amet, consectetur <br>adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                <div class="btn-link"><a href="#">read more</a></div>
            </div>
            <div class="col_1_of_3 span_1_of_3">
                <h3>Mobile Apps</h3>
                <img src="./static/images/icon2.png" alt=""/>
                <p>Lorem ipsum dolor sit amet, consectetur <br>adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                <div class="btn-link"><a href="#">read more</a></div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="content-bottom">
        <div class="wrap">
            <h2 class="head">Our Works</h2>
            <div class="bottom-box">
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic1.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic2.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic3.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
            <div class="section bottom">
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic4.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic5.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic6.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="col_1_of_4 span_1_of_4">
                    <a href="static/single.html" class="image" href="#">
                        <span class="rollover"></span>
                        <img class="imgborder" alt="" src="./static/images/pic7.jpg">
                    </a>
                    <div class="text"><h4><a href="#">adipisicing</a></h4>
                        <p>Lorem ipsum dolor sit amet, consectetuer</p>
                    </div>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <div class="clients">
        <div class="wrap">
            <h2 class="head">Clients</h2>
            <ul id="flexiselDemo3">
                <li><img src="./static/images/c1.png" alt=""/></li>
                <li><img src="./static/images/c2.png" alt=""/></li>
                <li><img src="./static/images/c3.png" alt=""/></li>
                <li><img src="./static/images/c4.png" alt=""/></li>
            </ul>
            <script type="text/javascript">
                $(window).load(function() {
                    $("#flexiselDemo1").flexisel();
                    $("#flexiselDemo2").flexisel({
                        enableResponsiveBreakpoints: true,
                        responsiveBreakpoints: {
                            portrait: {
                                changePoint:480,
                                visibleItems: 1
                            },
                            landscape: {
                                changePoint:640,
                                visibleItems: 2
                            },
                            tablet: {
                                changePoint:768,
                                visibleItems: 3
                            }
                        }
                    });

                    $("#flexiselDemo3").flexisel({
                        visibleItems: 5,
                        animationSpeed: 1000,
                        autoPlay: true,
                        autoPlaySpeed: 3000,
                        pauseOnHover: true,
                        enableResponsiveBreakpoints: true,
                        responsiveBreakpoints: {
                            portrait: {
                                changePoint:480,
                                visibleItems: 1
                            },
                            landscape: {
                                changePoint:640,
                                visibleItems: 2
                            },
                            tablet: {
                                changePoint:768,
                                visibleItems: 3
                            }
                        }
                    });

                });
            </script>
            <script type="text/javascript" src="./static/js/jquery.flexisel.js"></script>
        </div>
    </div>
</div>
<div class="footer">
    <div class="wrap">
        <div class="footer-left">
            <ul class="footer-nav">
                <li><a href="allHome.jsp">Home</a></li> |
                <li><a href="static/about.html">About</a></li> |
                <li><a href="allHome.jsp">Services</a></li> |
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
</body>a
</html>
