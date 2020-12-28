<%@ page import="org.hcl.model.Emp" %>
   <%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Emp> employees =(List<Emp>)request.getAttribute("empdet");%>
<table border="1">
<tr>
<th>Eno   </th>
<th>Name   </th>
<th>Address</th>
</tr><%
for(Emp e:employees)
{%>
<tr>
<td><%=e.getEno()%></td>
<td><%=e.getName()%></td>
<td><%=e.getAddress()%></td>
</tr>
<%
}
%>
</table>
</body>
</html>