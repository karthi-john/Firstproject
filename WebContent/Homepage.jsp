<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>

    
<!DOCTYPE html>
<html lang="en">
<head>
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <title>Welcome</title>
  <link rel="stylesheet" href="styles/Background.css">
  <style>
  body{
  	background-image: url("images/welcome.jpg");
  	background-repeat: no-repeat;
  	background-attachment: fixed;
  	background-size: cover;
   
  }
  </style>
</head>

<body>
<ul>
        <li><a href="Homepage.jsp">Home</a></li>
        <li><a href="Customers.jsp">Customers</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a href="help.jsp">Help</a></li>
        <li id="logout"><a href="logout.jsp">Logout</a></li>
 </ul>

     <%
 	String username=session.getAttribute("user").toString();
 	out.println("<h1 id='greet'> HI "+username+"!<h1>");
 %>

</body>
</html>