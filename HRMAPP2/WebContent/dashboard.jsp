<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ include file="navbar.jsp" %>
<% if(session.getAttribute("user")!=null) { %>
<div>
<h1>Welcome ${user.username}</h1>
</div>
<%} else {
	response.sendRedirect("index.jsp");
}
 %>
</body>
</html>