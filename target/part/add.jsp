<%--
  Created by IntelliJ IDEA.
  User: 信思智学
  Date: 2021/5/18
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="UserController/addUser" method="post">
        用户名<input type="text" name="username"><br>
        密码<input type="password" name="password"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
