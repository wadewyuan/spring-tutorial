<%@ page import="com.wadeyuan.tutorial.beans.TextEditor" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %><%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 12/5/2016
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dependency Injection</title>
</head>
<body>
    <%
        // Dependency injection demo, monitor console output
        TextEditor textEditor = (TextEditor) SpringContextUtil.getBean("textEditor");
        textEditor.input("Hello");
    %>
</body>
</html>
