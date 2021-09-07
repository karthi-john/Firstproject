<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<% 	String str=session.getAttribute("user").toString();
		if(str!="null"){
		session.removeAttribute("user");
		out.print("successfully logged out");
		response.sendRedirect("login.jsp");
		}
		else
			response.sendRedirect("Error.jsp");
		
		
	%>
		<h2>successfully logged out..</h2>

		

</body>
</html>