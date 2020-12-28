 <%@page import="org.hcl.model.Product" %>
   <%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="navbar.jsp" %>
<style> .products{width:100%;margin:2rem 1rem;}
.product{width:20%; padding:16px; box-shadow:0 2px 8px black; text-align:center; display:inline-block;}

button:focus{outline:none;}
.btn_action a{text-decoration:none;padding:8px;display:inline-block;border-radius:8px;}
.btn_action .add{border:1px solid red;background-color:red;color:white;}
.btn_action .edit,.btn_action .delete{border:2px solid blue;background-color:blue;color:white;}
</style>
</head>
<body>

<c:choose><c:when test="${sessionScope.user!=null }">
<div class="container">
<h1 >Products</h1>
<section class="products">
<%List<Product> products=(List<Product>)session.getAttribute("productdetails");%>
<% for(Product product:products)
{
%>
	<article  class="product">
	<div class="img_url">
	<img width="200px" height="100px" src="<%=product.getImageurl() %>" alt="<%=product.getPname() %>" >
	</div>
	<h2 class="product_title"><%=product.getPname() %></h2>
	<p class="description"><%=product.getDescription() %></p>
	<h3 class="price">$<%=product.getPrice() %></h3>
	<div class="btn_action">
	<c:if test="${sessionScope.user.designation=='Customer'}"><a class="add" href="#">Add to cart</a></c:if>
	<c:if test="${sessionScope.user.designation=='Manager'}"><a class="edit" href="#">Edit</a></c:if>
	<c:if test="${sessionScope.user.designation=='Manager'}"><a class="delete" href="#">Delete</a></c:if>
	</div>
	 </article>
<%}%>
</section>
</div>
</c:when>
<c:otherwise>
<jsp:forward page="index.jsp"></jsp:forward>
	</c:otherwise>
	</c:choose>
</body>
</html>