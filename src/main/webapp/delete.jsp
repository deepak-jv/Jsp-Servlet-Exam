<%@page import="com.java.model.product_detail"%>
<%@page import="com.java.product_detail.dao.productDaoImpl"%>
<%@page import="com.java.product_detail.dao.productDao"%>
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


<%
int id = Integer.parseInt(request.getParameter("id"));
productDao pd = new productDaoImpl();
product_detail p = pd.findById(id);

%>

<jsp:include page="navbar.jsp"></jsp:include>
<div class="row" style="margin-top : 30px;margin-bottom:30px">
	<div class="col-md-3"></div>
	<div class="col-md-6" style="margin: 5px; border: 2px solid black">
		<form action='delete'>
			<table>
				<tr>
				<th><h3 style='margin-top:30px'>Are you sure want to delete <b style='color:red'><%=p.getPname() %></b></h3></th>
						<td><input type="hidden" name="id"
							value="<%=p.getId()%>"></td>
					</tr>
				
			</table>
				<hr>
			<br>
			<br> <input class="btn btn-danger" type="submit" value="delete">
				<a href='product_list.jsp' class="btn btn-primary">cancel</a>
			
			 <br> <br>
			<br>
		</form>
		
	</div>
	<div class="col-md-3"></div>
	</div>
<jsp:include page="footer.jsp"></jsp:include>




</body>
</html>