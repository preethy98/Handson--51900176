<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="container">
<form action="add" method="post">
<div class="form-group">
<label for="pid">productid</label>
<input type="text" name="pid"></div>
<div class="form-group">
<label for="pname">productname</label>
<input type="text" name="pname"></div>
<label for="imgurl">Imageurl</label>
<input type="text" name="imgurl"></div>
<div class="form-group">
<label for="pdesc">description</label>
<input type="text" name="description"></div>
<div class="form-group">
<label for="price">price</label>
<input type="text" name="price"></div>
<div class="btn-action">
<button type="submit" >Add product</button>
<button type="reset" >Reset</button>
</div>
</form>
</div>
</body>
</html>