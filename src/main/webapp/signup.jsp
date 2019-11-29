<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
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
	<form action="signup">
			<h1>Sign Up</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>
					<label for="username"><b>User Name</b></label> 
					<input type="text" placeholder="Enter username" name="username" class="form-control" required> 
					<label for="email"><b>Email</b></label> 
					<input type="email" placeholder="Enter Email" name="email" class="form-control" required> 
					<label for="psw"><b>Password</b></label> 
					<input type="password" placeholder="Enter Password" name="password" class="form-control" required> 
					<label for="psw-repeat"><b>Repeat Password</b></label> 
					<input type="password" placeholder="Repeat Password" name="psw-repeat" class="form-control" required> <label>
					<input type="checkbox" checked="checked" name="remember" style="margin-bottom: 15px"> Remember me
					</label>


				<p>
					By creating an account you agree to our <a href="#"
						style="color: dodgerblue">Terms & Privacy</a>.
				</p>

				<div class="container-fluid">
					<button type="button" class="btn btn-danger">Cancel</button>
					<button type="submit" class="btn btn-primary">Sign Up</button>
				</div>
		</div>
	</form>
	</div>

</body>
</html>