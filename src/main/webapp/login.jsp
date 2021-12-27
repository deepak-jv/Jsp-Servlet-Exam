<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>


	<jsp:include page="navbar.jsp"></jsp:include>
	<div class="row" style="margin-top: 10px; margin-bottom: 10px">
		<div class="col-md-3"></div>
		<div class="col-md-6" style="margin: 5px; border: 2px solid black">
		<br>
		<div style='background-color:blue'><h3 style='color:white;text-align:center'>Login</h3></div>
		<hr>
			<form action='login' method="post">
				<table>
				
					<tr>
					<th>User Name :</th>
						<td>
						 <input type="text" name="username"
							placeholder="User Name" required="required">
						</td>
					</tr>
					<br>
					<tr>
					<th>Password :</th>
						<td>
							<input type="password" name="password"
							placeholder="Password" required="required">
						</td>
					</tr>
				</table>
				<br> <br> <input class="btn btn-success" type="submit" value="login"><br>
			</form>
			<p>
				if you are not a user of this site please <a href="register.jsp" >register</a>
				first
			</p>
		</div>
		<div class="col-md-3"></div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>