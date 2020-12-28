<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>.form-group{margin:1rem}</style>
</head>
<body>
<%@include file="header.jsp" %>
<section class="empform">
<form action="./process" method="post">
<div  class="form-group">
<label for="eno">Employee Number</label>
<input type="text" name="eno" id="eno" class="eno">
<label for="name">Employee Name</label>
<input type="text" name="name" id="name" class="name">
<label for="address">Employee Address</label>
<input type="text" name="address" id="address" class="address">
<button class="btn" type="submit">Submit</button>
</div>
</form>
</section>
</body>
</html>