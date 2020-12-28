<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

</head>
<body>
 <%@ include file="navbar.jsp" %>
<div class="container">
<section class="loginmodal">
<form action="login" method="post">
<div class="form-group">
Username<input type="text" name="username" id="username">
</div><div>
Password<input type="password" name="password" id="password">
</div>
<div>
<input type="submit" value="Login" id="loginaccess"><input type="button" value="Cancel" id="cancel">
</div>
</form>
</section>
<section class="signupmodal">
<form action="signup" method="post">
<div class="form-group">
UserId<input type="text" name="uid" id="uid">
</div><div class="form-group">
Username<input type="text" name="username" id="username">
</div><div class="form-group">
Password<input type="password" name="password" id="password">
</div>
<div class="form-group">
Gender<input type="radio"  id="male" value="male" name="gender">Male
<input type="radio" id="female" value="female" name="gender">Female</div>
<div class="form-group">
Designation<select name="designation">
<option value="Manager">Manager</option>
<option value="Customer">Customer</option>
</select>
</div>
<div>
<input type="submit" value="signup" id="signupaccess"><input type="button" value="Cancel" id="cancelsignup">
</div>
</form>
</section>
</div>
<script type="text/javascript">
const loginlink=document.getElementById('login');
const cancel=document.getElementById('cancel');
const signuplink=document.getElementById('signup');
const loginmodal=document.querySelector('.loginmodal');
const signupmodal=document.querySelector('.signupmodal');
const cancelsignup=document.getElementById('cancelsignup');
function showLogin()
{
	signupmodal.classList.remove('visible');
	loginmodal.classList.add('visible');
	}
	function cancelLogin()
	{
		loginmodal.classList.remove('visible');
	}
	function showSignUp()
	{
		loginmodal.classList.remove('visible');
	signupmodal.classList.add('visible');	
	}
	function cancelSignUp()
	{
		signupmodal.classList.remove('visible');
	}
loginlink.addEventListener('click',showLogin);
cancel.addEventListener('click',cancelLogin);
signuplink.addEventListener('click',showSignUp);
cancelsignup.addEventListener('click',cancelSignUp);

</script>
<div class="errmsg">
<h1> ${message}</h1>
</div>
</body>
</html>