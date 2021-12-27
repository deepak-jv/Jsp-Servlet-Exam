<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>
	<jsp:useBean id="product" class="com.java.model.product_detail"
		scope="page"></jsp:useBean>
	<jsp:setProperty property="*" name="product" />

	<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	session.getAttribute(name);
	session.getAttribute(password);
	%>
	<div class="row" style='margin-top:10px;margin-bottom:10px'>
		<div class="col-md-3"></div>
		<div class="col-md-6" style="margin: 5px; border: 2px solid black">
		<br>
			<div style='background-color:blue'>
				<h2 style="color: white; text-align: center;">Add Product</h2>

			</div>
			<hr>
			<form action="create_product" method='get'>
				<table>
					<tr>
						<th>Product Name :</th>
						<td><input type="text" name="name"
							placeholder="Enter product name"></td>
					</tr>
					<tr>
						<th>Price :</th>
						<td><input type="number" name="price"
							placeholder="Enter price"></td>
					</tr>
					<tr>
						<th>Quantity In Stock :</th>
						<td><input type="number" name="quantity"
							placeholder="Enter quantity"></td>
					</tr>

					<tr>
						<th>Vendor :</th>
						<td><input type="text" name="vendor"
							placeholder="Enter vendor name"></td>
					</tr>
					<tr>
						<th>Waranty :</th>
						<td><input type="number" name="waranty"
							placeholder="Enter waranty period"></td>
					</tr>




				</table>
				<table style='margin-bottom:10px ;margin-top:20px'>
				<td><input class='btn btn-success' type="submit" value="Create">
				 <a class='btn btn-primary' href="product_list">Back</a></td>
				</table>
				
			</form>

		</div>
		<div class="col-md-3"></div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>



</body>
</html>