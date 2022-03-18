<%--
  Created by IntelliJ IDEA.
  User: 王川川
  Date: 2022/3/13
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>公司信息查询</title>
    <!--basic_css-->
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css" />
    <meta name="viewport"
          content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no">

</head>

<body>
<form  method="post" action="CompanyServlet?method=updateCompanyById&&companyid=${company.id}">
    <div class="layui-form-item">
        <h1>公&nbsp;司&nbsp;信&nbsp;息&nbsp;查&nbsp;看</h1>
    </div>

    <div>
            <span class="decrib">账&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号：</span>
            <input  name="cpyaccount" value="${company.cpyaccount}">
    </div>

    <div>
            <span class="decrib">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</span>
            <input  name="cpypassword" value="${company.cpypassword}">
    </div>


    <div>
            <span class="decrib">公司名称：</span>
            <input  name="cpyname" value="${company.cpyname}">
    </div>
    <div>
            <span class="decrib">公司电话：</span>
            <input  name="cpyphone" value="${company.cpyphone}">
    </div>
    <div>
            <span class="decrib">公司地址：</span>
            <input  name="cpyaddress" value="${company.cpyaddress}">
    </div>
    <div>
            <span class="decrib">公司简介：</span>
            <input  name="cpyinfo" value="${company.cpyinfo}">
    </div>

    <br>
    <div>
        <span><input type="submit"  value="修改"></span>
    </div>
    <br>
    <br>
</form>
</body>
</html>

