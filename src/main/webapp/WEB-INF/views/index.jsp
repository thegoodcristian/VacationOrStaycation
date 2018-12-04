<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home - Vacation or Staycation!</title>
</head>
<body>
	${indexGate }
	<h1>Get Flight information</h1>
	<form action="search-session">
		<input type="text" name="adults" placeholder="Number of Adult Passengers(1-8)"><br>
		<input type="text" name="cabinClass" placeholder="Cabin Class"><br>
		<input type="text" name="children" placeholder="Number of Child Passengers(0-8)"><br>
		<input type="text" name="infants" placeholder="Number of Infant Passengers(0-8)"><br>
		<input type="text" name="groupPricing" placeholder="Group Pricing"><br>
		<input type="text" name="currency" placeholder="Currency"><br>
		<input type="text" name="country" placeholder="Market Country"><br>
		<input type="text" name="originPlace" placeholder="Origin Place"><br>
		<input type="text" name="destinationPlace" placeholder="Destination Place"><br>
		<input type="text" name="inboundDate" placeholder="Inbound Date"><br>
		<input type="text" name="outboundDate" placeholder="Outbound Date"><br>
		<input type="text" name="locale" placeholder="Locale"><br>
		<!--<input type="text" name="apiKey" placeholder="API Key"><br>-->
		<input type="submit" value="Search">
	
	</form>
	
	<a href="search">Test w/ no vals</a>

</body>
</html>