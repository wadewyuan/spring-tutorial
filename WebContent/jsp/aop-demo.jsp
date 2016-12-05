<%@ page import="com.wadeyuan.tutorial.beans.TaskProcessor" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %><%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 12/5/2016
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AOP Demo</title>
</head>
<body>
    <%
        TaskProcessor taskProcessor = (TaskProcessor) SpringContextUtil.getBean("taskProcessor");
        taskProcessor.process();
    %>
    Task processed, check your console for AOP info
</body>
</html>
