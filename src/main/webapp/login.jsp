<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>中二的登录页面</title>
	</head>
<body>

<script>
function checklogin()
{
	var name = document.getElementById("name").value;
	if (name==null || name=="")
	  {
	  alert("用户名不能为空！");
	  return false;
	  }
	var password = document.getElementById("password").value;
	if (password==null || password=="")
	  {
	  alert("请填写密码。");
	  return false;
	  }
	return true;
}
</script>

Today's date: <%= (new java.util.Date()).toLocaleString()%><br> 
<%
out.println("Your IP address is " + request.getRemoteAddr());
%>

<form action="<c:url value="/login"/>" onsubmit="return checklogin()">
   用户名： <input type="text" id = "name" name="name"> <br>
   密码：<input type="password" id = "password" name="password"><br>   
   <input type="submit" value="登录">     <br>
   <a href="<c:url value="/register.jsp"/>">注册</a>   
   </form>
   </body>
</html>
