<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights - Vacation or Staycation?</title>
</head>
<body>
	<h1>Search Flight Information - Vacation Or Staycation<</h1>
	<form action="search-results">
	<input type="text" name="destinationAirports" placeholder="Destination Airport"><br>
	<input type="text" name="duration" placeholder="Duration"><br>
	<input type="text" name="excludeCarriers" placeholder="Exclude Carriers"><br>
	<input type="text" name="inboundArriveEndTime" placeholder="Inbound Arrive End Time"><br>
	<input type="text" name="inboundArriveStartTime" placeholder="Inbound Arrive Start Time"><br>
	<input type="text" name="inboundDepartEndTime" placeholder="Inbound Depart End Time"><br>
	<input type="text" name="inboundDepartStartTime" placeholder="Inbound Depart Start Time"><br>
	<input type="text" name="inboundDepartTime" placeholder="Inbound Depart Time"><br>
	<input type="text" name="includeCarriers" placeholder="Included Carriers"><br>
	<input type="text" name="originAirports" placeholder="Origin Airport"><br>
	<input type="text" name="outboundArriveEndTime" placeholder="Outbound Arrive End Time"><br>
	<input type="text" name="outboundArriveStartTime" placeholder="Outbound Arrive Start Time"><br>
	<input type="text" name="outboundDepartEndTime" placeholder="Outbound Depart End Time"><br>
	<input type="text" name="outboundDepartStartTime" placeholder="Outbound Depart Start Time"><br>
	<input type="text" name="outboundDepartTime" placeholder="Outbound Depart Time"><br>
	<input type="text" name="pageIndex" placeholder="Page Index(0 is default)"><br>
	<input type="text" name="pageSize" placeholder="page Size(10 is default)"><br>
	<input type="text" name="sortOrder" placeholder="Sort Order"><br>
	<input type="text" name="sortType" placeholder="Sort Type"><br>
	<input type="text" name="stops" placeholder="Stops"><br>
	<input type="text" name="sessionKey" value="${getKey}" placeholder="API Key"><br>
	<input type="submit" value="Search">

</form>
</body>
</html>