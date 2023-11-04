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

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h3>Column 1</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris...</p>
			</div>
			<div class="col-sm-4">
				<h3>Department page</h3>
				<form:form modelAttribute="department" method="post" action="/department/dml">
					Id:<form:input path="id" class="form-control" />
					Name:<form:input path="name" class="form-control" />
					<br/>
					<input type="submit" value="Add" name="add" class="btn btn-success" />&nbsp;
					<input type="submit" value="Update" name="update" class="btn btn-warning" />&nbsp;
					<input type="submit" value="Delete" name="delete" class="btn btn-danger" />&nbsp;
				</form:form>
			</div>
			<div class="col-sm-4">
				<h3>Column 3</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
				<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco
					laboris...</p>
			</div>
		</div>
	</div>
	<br/><hr/>
	<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<table class="table table-bordered table-hover table-striped">
				<thead>
					<th>Id</th>
					<th>Name</th>
					<th></th>
					<th></th>
				</thead>
				<tbody>
					<c:forEach var="d" items="${departments }">
						<tr>
							<td>${d.id }</td>
							<td>${d.name }
							<td>
								<a class="btn btn-info" href="/department/select?id=${d.id }">Select</a>
							</td>
							<td>
								<a class="btn btn-primary" href="/department/view/${d.id}">View</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-sm-2"></div>
	</div>
</body>
</html>