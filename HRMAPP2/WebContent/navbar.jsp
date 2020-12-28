<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
*{
margin:0px;
box-sizing:border-box;}
.navbar{width:100%;
background-color:#ccccc;}
.nav-items{display:block;background-color:lightblue;padding-bottom:20px;padding-top:20px;}
.nav-item{display:inline-block;
width:150px;}
.formgroup{padding:10px;}
.nav-item a{text-decoration:none;color:black;font-weight:bold;font-family:verdana;}
.loginmodal{position:fixed;width:200px;top:30%;left:40%;display:none;box-shadow:0 4px 8px lightblue;}
.signupmodal{position:fixed;width:400px;top:30%;left:40%;display:none; box-shadow:0 2px 8px blue;}
.visible{display:block;}
#loginaccess,#signupaccess{background-color:green;}
#cancel,#cancelsignup{background-color:red;}
.errmsg{color:red;text-align:center;margin-top:50px;box-shadow:2px 2px 8px blue;}
</style>

<nav class="navbar">
<ul class="nav-items">
<div class="heading">
<li class="nav-item"><a href="home" ><h3>Home</h3></a>
<li class="nav-item"><a href="product" ><h3>Products</h3></a>
<c:if test="${sessionScope.user.designation=='Manager'}"><li class="nav-item"><a href="add">Add Products</a></li></c:if>
<c:if test="${sessionScope.user==null}"><li class="nav-item"><a id="login" href="#" ><h3>Login</h3></a></li></c:if>
<c:if test="${sessionScope.user==null}"><li class="nav-item"><a id="signup" href="#" ><h3>SignUp</h3></a></li></c:if>
<c:if test="${sessionScope.user!=null}"> <li class="nav-item"><a href="signout" ><h3>SignOut</h3></a></li></c:if>
</li>
</div>
</ul>
</nav>