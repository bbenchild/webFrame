<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>中二的注册页面</title>
	</head>
<body>
<form action="<%=request.getContextPath()%>/register.action" method="get">
   用户名： <input type="text" name="user.name"><br>
   密码：<input type="password" name="user.password"><br>   
   <input type="submit" value="注册">     
   </form>
   </body>
</html>