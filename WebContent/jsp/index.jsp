<%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 11/26/2016
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <%
        SpringContextUtil.getBean("testBean");
    %>
</body>
</html>
