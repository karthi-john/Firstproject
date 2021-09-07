<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="styles/Background.css">
<title>Help</title>
<style>
button{
width:100px;
background-color:red;
padding:3px;
}
</style>
</head>
<body>
<ul>
        <li><a href="Homepage.jsp">Home</a></li>
        <li><a href="Customers.jsp">Customers</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a>Help</a></li>
        <li id="logout"><a href="logout.jsp">Logout</a></li>
 </ul>
<button>Support</button>
<br><p id="msg"> </p>
<script>
	$(document).ready(function(){
		$("button").click(function(){
			$("#msg").text("how can i help you?");
		});
	});
</script>
</body>
</html>