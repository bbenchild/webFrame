<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">



<html>
<head>
<title>抱歉~</title>
</head>
<body>    注册失败，错误的用户名：<s:property value="user.name"/><br>
   <a href="<%=request.getContextPath()%>/register.jsp">返回</a>   
   </body>
</html>