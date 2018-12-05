<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Search Flights - Vacation or Staycation?</title>
</head>
<body>
	<div class=container>
		<h1>Available Flights - Vacation Or Staycation</h1>
	</div>
	<div class=container>
		<table class="table">
		<c:forEach var="load" items="${getFlights}">
			<tr>
				<td>${load.pricingOptions}</td>
			</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>