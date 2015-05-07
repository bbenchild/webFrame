<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><html>
<head>

<title>恭喜！注册成功</title>
</head>
<body>
注册成功！欢迎您，${user.name}
<a href="<%=request.getContextPath()%>/login.jsp">登录</a>
</body>
</html>