<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>中二的注册页面</title>
	</head>
<body>
<script>
function checkregister()
{
	var name = document.getElementById("name").value;
	if (name==null || name=="")
	  {
	  alert("用户名不能为空。");
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

<form action="<c:url value="/register"/>" onsubmit="return checkregister()">
   用户名： <input type="text" id = "name" name="name"><br>
   密码：<input type="password" id = "password" name="password"><br>   
   <input type="submit" value="注册">   <br>   
   <a href="<c:url value="/login.jsp"/>">登录</a>   
   </form>
   </body>
</html>
