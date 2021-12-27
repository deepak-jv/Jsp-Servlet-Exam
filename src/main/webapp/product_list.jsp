<%@page import="com.java.model.product_detail"%>
<%@page import="com.java.product_detail.dao.productDaoImpl"%>
<%@page import="com.java.product_detail.dao.productDao"%>
<%@ page isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>


	<jsp:useBean id="product" class="com.java.model.product_detail" 
		scope="session"></jsp:useBean> 
	<jsp:setProperty property="*" name="product" />

	
	<jsp:include page="navbar.jsp"></jsp:include>

	<br>
	<div style='background-color:blue;margin-left:2px;margin-right:2px'>
		<h2 style="color: white; text-align: center">Product Report</h2>
	</div>
	<hr>

	<table class="table table-bordered table-hover table-dark"
		style="margin: 2px;margin-bottom:10px">
		<thead>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Vendor</th>
				<th>Quantity($)</th>
				<th>Warranty(years)</th>
				<th>Operations</th>
			</tr>
		</thead>

		<tbody>

			<%
			productDao p = new productDaoImpl();
			List<product_detail> pd = p.getall();
		
			for(product_detail p1:pd){
				
			%>

			<tr>
				<td><%=p1.getId()%></td>
				<td><%=p1.getPname()%></td>
				<td><%=p1.getPrice()%></td>
				<td><%=p1.getVendor()%></td>
				<td><%=p1.getQuantity()%></td>
				<td><%=p1.getWarranty()%></td>

				<td><a href="update.jsp?id=<%=p1.getId()%>"
					class="btn btn-primary">Edit</a> <a
					href="delete.jsp?id=<%=p1.getId()%>" class="btn btn-danger">Delete</a>
				</td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>