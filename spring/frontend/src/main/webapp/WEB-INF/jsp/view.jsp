<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron text-center">
		<h1>My First Bootstrap Page</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<br/><hr/>
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<c:if test="${employees.size() ne 0 }">
			<table class="table table-bordered table-hover table-striped">
				<thead>
					<th>Id</th>
					<th>Name</th>
					<th>Department Name</th>
					<th></th>
				</thead>
				<tbody>
					<c:forEach var="e" items="${employees }">
						<tr>
							<td>${e.id }</td>
							<td>${e.name }
							<td>
								${e.department.name }
							</td>
							<td>
								
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>