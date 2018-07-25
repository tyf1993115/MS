<%--
  Created by IntelliJ IDEA.
  User: Nick峰
  Date: 2018/7/25
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
    <form action="regis1">
        请输入用户名:<input name="name">
        请输入密码:<input type="password" name="pass">
        <input type="submit">
    </form>
</body>
</html>
