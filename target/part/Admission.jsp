<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/15
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%><!DOCTYPE html>
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
<table class="layui-table" lay-skin="line">
    <colgroup>-


    </colgroup>
    <thead>
    <tr>
        <th ><span class="layui-badge">*</span></th>
                <th><span style="color: red">学生姓名</span></th>
                <th><span style="color: red">学生学校</span></th>
                <th><span style="color: red">报名职业</span></th>
                <th><span style="color: red">职业薪水</span></th>
                <th><span style="color: red">操作</span></th>

    </tr>
    </thead>
<tbody>
            <c:forEach items="${students}" var="st">
                <tr>


                    <td><span class="layui-badge">*</span></td>
                    <td><span>${st.stname}</span></td>
                    <td><span>${st.stschool}</span></td>
                    <c:forEach items="${st.occupations}" var="oc">

                            <td><span>${oc.ocname}</span></td>
                            <td><span>${oc.salary}</span></td>
                            <td><span  style="color: #0A95"><a href="refuse?ocid=${oc.id}&&cpyandocid=${oc.cpyandocid}&&companyid=${companyid}&&studentid=${st.id}">拒绝</a></span>
                            <span  style="color: #0A95"><a href="accept?ocid=${oc.id}&&cpyandocid=${oc.cpyandocid}&&companyid=${companyid}&&studentid=${st.id}">通过&nbsp;</a></span>
                            <span  style="color: red"><a href="getStudentResume?ocid=${oc.id}&&companyid=${companyid}&&resumeid=${st.stresumeid}">查看简历&nbsp;</a></span></td>

                        </c:forEach>


                </tr>
            </c:forEach>





</body>
</html>
