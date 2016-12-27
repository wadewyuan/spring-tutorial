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
    <strong>Something is running in background...</strong>
    <%
        SpringContextUtil.getBean("testBean");
    %>
    <ul>
        <li><a href="jsp/dependency-injection.jsp">DI</a></li>
        <li><a href="jsp/custom-event.jsp">Event</a></li>
        <li><a href="jsp/aop-demo.jsp">AOP</a></li>
        <li><a href="jsp/dynamic-proxy.jsp">Dynamic Proxy</a></li>
    </ul>
</body>
</html>
