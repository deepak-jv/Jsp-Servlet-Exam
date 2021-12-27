<!DOCTYPE html>
<%@ page   language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.java.user.registerdao.registerDao"%>
<%@page import="com.java.user.registerdao.registerDaoImpl"%>
<%@page import="com.java.model.userRegister"%>
<%@page import="com.java.servlet.Login"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>menu</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>
/* Add a black background color to the top navigation */
.topnav {
	background-color: white;
	overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
	float: left;
	color: black;
	text-align: center;
	padding: 14px 16px;
	font-size: 17px;
}

body {
	background-color: lightcyan;
}
</style>
</head>
<body>


	<%
	String password = request.getParameter("password");
	String username = request.getParameter("username");
	HttpSession hs = request.getSession(false);
	hs.setAttribute("username",username);
	
	%>
	
	<div class="row" style="margin: 5px">
		<div class="col-md-9">
			<h2>Product Management</h2>
		</div>
		<div class="col-md-3">
		<%if(hs!= null && username != null) {%>
			<p>Welcome : <%=username%> </p>
			<%} %>
		</div>
	</div>
	<div class="topnav" style="border: 2px solid black; margin: 2px;background-color:lightblue;color:white">
		<b> <a class="active" href="home.jsp">Home</a> <a href="#">AboutUs</a>
			<a href="product_list">Show Report</a> <a href="add_product.jsp">Add
				Product Detail</a> 
				
				
				<a href="logout">Login/Logout</a> 
				
		</b>
	</div>





</body>
</html>