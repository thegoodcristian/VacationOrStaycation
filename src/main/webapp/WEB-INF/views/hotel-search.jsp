<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Hotel - Vacation or Staycation</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sketchy/bootstrap.min.css" />
</head>
<body>
	<h1>Search Hotel Information</h1>
	<form action="hotel-search">
	
	<input type="text" name="country" placeholder="Country"><br>
	<input type="text" name="latitude" placeholder="Latitude"><br>
	<input type="text" name="longitude" placeholder="Longitude"><br>
	<input type="text" name="fromDate" placeholder="From Date"><br>
	<input type="text" name="toDate" placeholder="To Date"><br>
	<input type="text" name="clientNationality" placeholder="Client Nationality"><br>
	<input type="text" name="currency" placeholder="Currency"><br>
	<input type="text" name="isAddress" placeholder="Is Address"><br>
	<input type="text" name="sessionKey" value="${getKey}" placeholder="API Key"><br>
	<input type="submit" value="Search">
	
	
	
	
	
	
	
	
	
	
	
	</form>
	

</body>
</html>