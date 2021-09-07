<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <link rel="stylesheet" href="styles/Background.css">	
 <link rel="stylesheet" href="styles/Products.css">
<title>Products</title>
</head>
<body>
	<ul>
        <li><a href="Homepage.jsp">Home</a></li>
        <li><a href="Customers.jsp">Customers</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a href="AddProduct.jsp">Add Products</a></li>
        <li id="logout"><a href="logout.jsp">Logout</a></li>
    </ul>
	<table id="ptable">
		<tr>
		  <th >Product</th>
		  <th >price</th>
		</tr>
	</table>


<script>
	$(document).ready(function(){
		$.get("Controller/Products",function(data){
			var product=JSON.parse(data);
			for(var i=0;i<product.length;i++){
				$("#ptable").append("<tr><td><img src="+product[i].srcpath+
						" alt='mobile' style='width:250px;height:250px'><td>"+
						product[i].price+"</td></tr>");
			}
			
		});
	});
</script>
</body>
</html>