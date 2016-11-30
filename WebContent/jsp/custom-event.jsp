<%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 11/30/2016
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %>
<%@ page import="com.wadeyuan.tutorial.events.publisher.MyCustomEventPublisher" %>
<html>
<head>
    <title>Custom Event</title>
</head>
<body>
    <%
        MyCustomEventPublisher cep = (MyCustomEventPublisher) SpringContextUtil.getBean("customEventPublisher");
        cep.publish();
    %>
    Event published, check your console
</body>
</html>
