<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <link rel="stylesheet" href="styles/logincss.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="script.js"></script>
  <title>Sign in</title>
  
</head>

<body>
<%
	if(session.getAttribute("user")!=null){
		response.sendRedirect("Homepage.jsp");
	}else{
%>

  <div class="main">
    <p class="sign" align="center">Sign in</p>
    <p id="invalid" align="center" style="color:red"></p>
    <form class="form1"   method="post" >
     
      <input class="un " type="text"  placeholder="Username" autofocus >
      <input class="pass" type="text"  placeholder="Password" >
      <input  class="signin" type="submit"  value="Sign in">
      <hr>
      <input  class="signup" type="submit"  value="Sign up">
      </form>
    </div>
    <%} %>

     
    
</body>

</html>