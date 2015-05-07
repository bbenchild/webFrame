<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>中二的注册页面</title>
	</head>
<body>
<form action="<c:url value="/register"/>">
   用户名： <input type="text" name="name"><br>
   密码：<input type="password" name="password"><br>   
   <input type="submit" value="注册">   <br>   
   <a href="<c:url value="/login.jsp"/>">登录</a>   
   </form>
   </body>
</html>
