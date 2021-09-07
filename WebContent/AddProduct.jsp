<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addproduct</title>
<link rel="stylesheet" href="styles/Background.css">	
<style>
div{
background-color:silver;
width:300px;
padding:15px;
margin-left:500px;
margin-top:200px;
border:2px solid black;
align-content: center;
}
input[type=submit],[type=text]{
		width: auto;
		padding: 12px 20px;
		margin: 8px 0;
		box-sizing: border-box;
}
input[type=submit]{
		 background-color:lightgreen;
}
</style>
</head>
<body>
	<ul>
        <li><a href="Homepage.jsp">Home</a></li>
        <li><a href="Customers.jsp">Customers</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a href="AddProduct.jsp">Add Products</a></li>
        <li id="logout"><a href="logout.jsp">Logout</a></li>
    </ul>
    <div>
    <form  action="Controller/Addproduct" method="post" enctype="multipart/form-data" >
	<input type="file" placeholder="select image" name="file"><br> 
	 <input type="text" placeholder="price" name="price"><br>
	 <input id="add" type="submit" value="add">
	</form>
    </div>
	
</body>
</html>