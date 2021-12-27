<%@ page errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="row">
		<div class="col-md-3"></div>
		<div class="col-md-6" style="margin: 5px; border: 2px solid black">
		<br>
			<div style='background-color:blue'>
				<h3 style='color: white; text-align: center'>Register</h3>
			</div>
<hr>
			<form action="register" method="POST">
				<table>
				
					<tr>
					<th>Name :</th>
						<td>
						 <input type="text" name="name"
							placeholder="Enter name" required="required">
						</td>
					</tr>
					<tr>
					<th>Contact :</th>
						<td>
							<input type="text" name="contact"
							placeholder="Enter contact number" required="required">
						</td>
					</tr>
					<tr>
					<th>Email :</th>
						<td>
						 <input type="email" name="email"
							placeholder="Enter email" required="required">
						</td>
					</tr>
					<tr>
					<th>User Name :</th>
						<td>
						 <input type="text" name="username"
							placeholder="Enter user name" required="required">
						</td>
					</tr>

					<tr>
					<th>Password :</th>
						<td>
							<input type="password" name="password"
							placeholder="Enter password" required="required">
						</td>
					</tr>




				</table>
				<br> <br> <input class="btn btn-primary" type="submit"
					value="register"> <br> <br>
			</form>
			<p>
				if you are registered click <a href="login.jsp">login</a>
			</p>
		</div>
		<div class="col-md-3"></div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>