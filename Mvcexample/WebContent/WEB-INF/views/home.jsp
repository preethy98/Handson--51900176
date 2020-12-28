<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome home....
<a href="./display">display details</a>
<table border="1">
<c:forEach items="${requestScope.employee}"  var="e"><tr>
<td><c:out value="${e.eno}"/> </td>
<td><c:out value="${e.name}"/> </td>
<td><c:out value="${e.address}"/> </td>
</tr>
</c:forEach>
</table>
</body>
</html>