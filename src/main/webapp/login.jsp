<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
        href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- link
        href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"
        rel="stylesheet" id="bootstrap-css"-->
    <!-- script
        src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script-->
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script
        src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <!-- script src="http://getbootstrap.com/dist/js/bootstrap.min.js"></script-->
</head>
<body>
	<div class="container-fluid">
		<h2>LOGIN</h2>
		<form action="login">
			<div class="form-group">
				<label for="uname"><b>Username : </b></label> <input type="text" class="form-control"
					placeholder="Enter Username" name="username" class="login" required>
				<label for="psw"><b>Password : </b></label> <input type="password" class="form-control"
					placeholder="Enter Password" name="password" class="login" required>
				<br>
				<button type="submit" class="btn btn-primary">Login</button>
			</div>

			<div class="contaier-fluid">
				<button type="button" class="btn btn-danger">Cancel</button>
				<span class="psw">Forgot <a href="#">password?</a></span>
			</div>
			<br>
			<a href="signup.jsp">signup</a>
		</form>
	</div>
</body>
</html>
