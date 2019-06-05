<%@ page language="java" contentType="text\html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
System.out.println(request.getParameter("name"));



%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
My First JSP ${test} and password is ${password}


${message}
<form action = "/login.do" method="POST">
ENter your Name <input type="text" name = "name"/>
ENter your Password <input type="password" name = "password"/>
<input type="submit"/>
</form>
</body>
</html>