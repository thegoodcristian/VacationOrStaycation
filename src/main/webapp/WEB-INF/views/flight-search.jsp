<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Search Flights - Vacation or Staycation?</title>
	<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/simplex/bootstrap.min.css" rel="stylesheet" integrity="sha384-C/fi3Y7sgGQc3Lxu71QIVbBJ9iNQ/11o+YZNg2GRUrRrJayHEMpEc2I/jFSkMXAW" crossorigin="anonymous">
</head>
<body>
	<h1>Search Flight Information - Vacation Or Staycation</h1>
	<form action="search-flight" >
		<input type="text" class=form-control name="country" placeholder="Current Country (Format: US)"><br>
		<input type="text" class=form-control name="currency" placeholder="Desired Currency (Format: USD)"><br>
		<input type="text" class=form-control name="destinationplace" placeholder="Destination Airport (Format: JFK-sky)"><br>
		<input type="text" class=form-control name="outboundpartialdate" placeholder="Outbound Date (Format: yyyy-mm-dd or yyyy-mm))"><br>
		<input type="text" class=form-control name="inboundpartialdate" placeholder="Inbound Date (Format: yyyy-mm-dd or yyyy-mm)"><br>
		<input type="text" class=form-control name="locale" placeholder="Locale (Format: en-US)"><br>
		<input type="text" class=form-control name="originplace" placeholder="Origin Airport (Format: SFO-sky)"><br>
		<input type="submit" value="Search">
	</form>
</body>
</html>