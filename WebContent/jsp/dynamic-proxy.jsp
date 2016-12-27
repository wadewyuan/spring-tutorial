<%@ page import="com.wadeyuan.tutorial.beans.processor.GammaProcessor" %>
<%@ page import="com.wadeyuan.tutorial.beans.processor.impl.GammaProcessorImpl" %>
<%@ page import="com.wadeyuan.tutorial.beans.processor.impl.GammaProcessorProxy" %>
<%@ page import="java.lang.reflect.Proxy" %>
<%--
  Created by IntelliJ IDEA.
  User: wadey
  Date: 12/27/2016
  Time: 10:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dynamic Proxy</title>
</head>
<body>
    <%
        GammaProcessorProxy proxy = new GammaProcessorProxy();
        proxy.setTarget(new GammaProcessorImpl());
        GammaProcessor processorProxy = (GammaProcessor) Proxy.newProxyInstance(GammaProcessorProxy.class.getClassLoader(), GammaProcessorImpl.class.getInterfaces(), proxy);
        processorProxy.processGamma();
        System.out.println(processorProxy.getClass().toString());
        for(Class cls : processorProxy.getClass().getInterfaces()) {
            System.out.println(cls.toString());
        }
    %>
</body>
</html>
