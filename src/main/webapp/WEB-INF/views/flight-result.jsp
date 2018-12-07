<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Search Flights - Vacation or Staycation?</title>
	<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/simplex/bootstrap.min.css" rel="stylesheet" integrity="sha384-C/fi3Y7sgGQc3Lxu71QIVbBJ9iNQ/11o+YZNg2GRUrRrJayHEMpEc2I/jFSkMXAW" crossorigin="anonymous">
	
</head>
<body>
	<div class=container>
		<h1>Available Flights - Vacation Or Staycation</h1>
	</div>
	
	<%-- </div>
	<div class=container>
	<table class="table">
		<c:forEach var="load" items="${getFlights}">
			<tr>
				<td>${load.minPrice}</td>
				<td>${load.direct}</td>
				<td>${load.quoteId}</td>
				<td><a class="btn btn-primary" href="/update?personid=">Update</a></td>
				<td><a class="btn btn-primary" href="/delete?personid=">Delete</a></td>
			</tr>
		</c:forEach>
	</table> 
	</div> --%>
	
	                <c:forEach var="f1" items="${getFlights}">
                    <div id="eachVacationHotel">
                    <tr>
                        <td>${f1.name}<br></td>
                    </tr>
                    </div>
                </c:forEach>
	
</body>
</html>