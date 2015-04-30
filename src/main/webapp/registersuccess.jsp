<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><html>
<head>

<title>恭喜！注册成功</title>
</head>
<body>
注册成功！欢迎您，<s:property value="user.name"/>
<a href="<%=request.getContextPath()%>/login.jsp">登录</a>
</body>
</html>