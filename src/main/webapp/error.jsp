<%@page import="com.java.model.product_detail"%>
<%@page import="com.java.product_detail.dao.productDaoImpl"%>
<%@page isErrorPage="true" import="com.java.product_detail.dao.productDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




<jsp:include page="navbar.jsp"></jsp:include>
<div class="row" style="margin-top : 30px;margin-bottom:30px">
	<div class="col-md-3"></div>
	<div class="col-md-6" style="margin: 5px; border: 2px solid black">
			<table>
				<tr>
				<th><h1> exception Occurs : <%= exception %></h1></th>
						
					</tr>
			</table>
		
		
	</div>
	<div class="col-md-3"></div>
	</div>
<jsp:include page="footer.jsp"></jsp:include>




</body>
</html>