<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Index page
<table border=1>
<thead>
	<th>Branch Id</th><th>Name</th><th>City</th>
</thead>
<c:forEach var="b" items="${branches }">
	<tr>
		<td>${b.bid }</td>
		<td>${b.bname }</td>
		<td>${b.bcity }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>