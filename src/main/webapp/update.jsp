<%@page import="com.java.model.product_detail"%>
<%@page import="com.java.product_detail.dao.productDaoImpl"%>
<%@page import="com.java.product_detail.dao.productDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>
	<jsp:useBean id="update" class="com.java.servlet.updateProduct"></jsp:useBean>
	<jsp:setProperty property="*" name="update" />
	
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	System.out.println(id);
	productDao pd = new productDaoImpl();
	product_detail p = pd.findById(id);
	
	%>

	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6" style="margin: 5px; border: 2px solid black">
		<br>
		<div style='background-color:blue'><h2 style="color:white;text-align:center">Update Product</h2></div>
		<hr>
			<form action="update_product" method="post">
				<table>

					<tr>
						<td><input type="hidden" name="id"
							value="<%=p.getId()%>"></td>
					</tr>

					<tr>
					<th>Product Name :</th>
						<td>
						<input type="text" name="name"
							value=<%=p.getPname()%>  >
						</td>
					</tr>
					<tr>
					<th>Price :</th>
						<td>
							<input type="number" name="price"
							value=<%=p.getPrice()%>>
						</td>
					</tr>
					<tr>
					<th>Quantity In Stock :</th>
						<td>
							<input type="number" name="quantity"
							value=<%=p.getQuantity()%>>
						</td>
					</tr>

					<tr>
					<th>Vendor :</th>
						<td>
							 <input type="text" name="vendor"
							value=<%=p.getVendor()%>>
						</td>
					</tr>
					<tr>
					<th>Warranty :</th>
						<td>
							 <input type="number" name="waranty"
							value=<%=p.getWarranty()%>>
						</td>
					</tr>




				</table>
				<br> 
				<table style='margin-bottom:10px'>
				<td><input class='btn btn-success' type="submit" value="Update">
				 <a class='btn btn-primary' href="product_list">Back</a></td>
				</table>
				
			</form>
			
		</div>
		<div class="col-md-3"></div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>