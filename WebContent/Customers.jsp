<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>database</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <link rel="stylesheet" href="styles/Background.css">
<link rel="stylesheet" href="styles/customers.css">
</head>
<body >
	<ul>
        <li><a href="Homepage.jsp">Home</a></li>
        <li><a href="Customers.jsp">Customers</a></li>
        <li><a href="Products.jsp">Products</a></li>
        <li><a href="help.jsp">Help</a></li>
        <li id="logout"><a href="logout.jsp">Logout</a></li>
 </ul>

<% 	
	
		if (session.getAttribute("user")==null){
			response.sendRedirect("login.jsp");
		}
		else{ %>
	<table id="customers">
		<tr>
		  <th >Id </th>
		  <th >Name </th>
		  <th>City</th>
		  <th >Mobile </th>
		</tr>
	</table>
	<hr>
	
	<form id="dataform"  >
	 <input type="text" placeholder="Enter_Id only for deleting" name="customerid"><br>
	 <input type="text" placeholder="Enter_Name" name="customername"  autofocus><br>
	 <input type="text" placeholder="Enter_City" name="customercity" ><br>
	 <input type="text" placeholder="Enter_Mobileno" name="customermobile"><br>
	 <input id="add" type="submit" value="add">
	<input id="delete" type="submit" value="delete">
	</form>
	
	<% }%>
	<script>
	$(document).ready(function(){
		$.get("Controller/Customers",function(data){
			var cusobj=JSON.parse(data);
			for(var i=0;i<cusobj.length;i++){
				$("#customers").append("<tr><td>"+cusobj[i].Id+
						"<td>"+cusobj[i].Name+
						"<td>"+cusobj[i].City+
						"<td>"+cusobj[i].Mobile+
						"</td></tr>");
			}
		});
		$("#delete").click(function(){
			$("#dataform").attr("action","Controller/deletedata");
		});
		$("#add").click(function(){
			$("#dataform").attr("action","Controller/insertdata");
		});
	});
	
	</script>
	
	
</body>
</html>