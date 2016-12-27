<%@ page import="com.wadeyuan.tutorial.beans.processor.AlphaProcessor" %>
<%@ page import="com.wadeyuan.tutorial.util.SpringContextUtil" %>
<%@ page import="com.wadeyuan.tutorial.beans.processor.BetaProcessor" %>
<%--
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
        AlphaProcessor alphaProcessor = (AlphaProcessor) SpringContextUtil.getBean("alphaProcessor");
        BetaProcessor betaProcessor = (BetaProcessor) SpringContextUtil.getBean("betaProcessor");
        alphaProcessor.processAlpha();
        betaProcessor.processBeta();
    %>
    Task processed, check your console for AOP info
</body>
</html>
