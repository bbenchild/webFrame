<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>中二的登录页面</title>
	</head>
<body>
<form action="<c:url value="/login"/>">
   用户名： <input type="text" name="name"><br>
   密码：<input type="password" name="password"><br>   
   <input type="submit" value="登录">     <br>
   <a href="<c:url value="/register.jsp"/>">注册</a>   
   </form>
   </body>
</html>
