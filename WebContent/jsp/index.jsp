<%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 11/26/2016
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %>
<%@ page import="com.wadeyuan.tutorial.beans.TextEditor" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <strong>Something is running in background...</strong>
    <%
        SpringContextUtil.getBean("testBean");

        // Dependency injection demo, monitor console output
        TextEditor textEditor = (TextEditor) SpringContextUtil.getBean("textEditor");
        textEditor.input("Hello");
    %>
</body>
</html>
