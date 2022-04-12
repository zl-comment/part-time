<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/15
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>招聘管理</title>
    <script type="text/javascript" src="./static/js/common/jquery.min.js"></script>
    <script type="text/javascript" src="./static/js/common/echarts.min.js"></script>
    <link type="text/css" rel="stylesheet" href="./static/layui/css/layui.css">
    <script type="text/javascript" src="./static/layui/layui.js"></script>
    <script type="text/javascript" src="./static/js/pages/home.js"></script>
    <link rel="stylesheet" type="text/css" href="./static/css/home.css">
</head>
<body>

<div class="layui-row">

    <form class="layui-form"  >


        <ul class="range-left">
            <li>
                <span class="layui-badge">*</span>
                <span style="color: red">学生姓名</span>
                <span style="color: red">学生学校</span>
                <span style="color: red">报名职业</span>
                <span style="color: red">职业薪水&nbsp;</span>
            </li>
            <c:forEach items="${students}" var="st">
                <li>
                    <span class="layui-badge">*</span>
                    <span>${st.stname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                    <span>${st.stschool}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                    <c:forEach items="${st.occupations}" var="oc">
                        <span>${oc.ocname}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                        <span>${oc.salary}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
                        <span class="con" style="color: #0A95"><a href="CompanyServlet?method=refuse&&ocid=${oc.id}&&cpyandocid=${oc.cpyandocid}&&companyid=${companyid}&&studentid=${st.id}">拒绝</a></span>
                        <span class="con" style="color: #0A95"><a href="CompanyServlet?method=accept&&ocid=${oc.id}&&cpyandocid=${oc.cpyandocid}&&companyid=${companyid}&&studentid=${st.id}">录用&nbsp;</a></span>
                        <span class="con" style="color: red"><a href="CompanyServlet?method=viewResume&&ocid=${oc.id}&&companyid=${companyid}&&resumeid=${st.stresumeid}">查看简历&nbsp;</a></span>
                    </c:forEach>

                </li>


            </c:forEach>


        </ul>


    </form>



</div>
</body>
</html>