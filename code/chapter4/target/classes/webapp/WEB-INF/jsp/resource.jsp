<%@ page language="java" contentType="text/html; charsetset=utf-8" pageEncoding="UTF-8" %>
<jsp:directive.page import="org.springframework.web.context.support.ServletContextResource" />
<jsp:directive.page import="org.springframework.core.io.Resource" />
<jsp:directive.page import="org.springframework.web.util.WebUtils" />
<%
    Resource res3 = new ServletContextResource(application, "/WEB-INF/classes/conf/file1.txt");
    System.out.print(res3.getFilename() + "<br/>");
    System.out.print(WebUtils.getTempDir(application).getAbsolutePath());
%>