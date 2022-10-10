<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<h2>list of leads</h2>
<table>
<tr>
<th>first Name</th>
<th>last Name</th>
<th>email</th>
<th>mobile</th>
<th>delete</th>
<th>update</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
<td><a href="delete?id">delete</a></td>
<td><a href="update?id">update</a></td>
</tr>
</c:forEach>

</table>
</body>
</html>