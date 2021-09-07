<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error</title>
</head>
<body style="background-color:red">
	<%
			response.sendRedirect("login.jsp");
	%>
	
</body>
</html>