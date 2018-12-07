<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home - Vacation or Staycation!</title>
</head>
<body>
	<h1>Get Flight information</h1>
<!-- 	<a href="flight-search">Get Flight information</a> -->



    <form action="yelp-search">
    
    	<h1>Search Flight Information - Vacation Or Staycation</h1>
		<input type="text" class=form-control name="country" placeholder="Current Country (Format: US)"><br>
		<input type="text" class=form-control name="currency" placeholder="Desired Currency (Format: USD)"><br>
		<input type="text" class=form-control name="destinationplace" placeholder="Destination Airport (Format: JFK-sky)"><br>
		<input type="text" class=form-control name="outboundpartialdate" placeholder="Outbound Date (Format: yyyy-mm-dd or yyyy-mm))"><br>
		<input type="text" class=form-control name="inboundpartialdate" placeholder="Inbound Date (Format: yyyy-mm-dd or yyyy-mm)"><br>
		<input type="text" class=form-control name="locale" placeholder="Locale (Format: en-US)"><br>
		<input type="text" class=form-control name="originplace" placeholder="Origin Airport (Format: SFO-sky)"><br>
	
            <h1>Get Hotel information</h1>
    
        <input type="text" name="term1" placeholder="term1"><br>
        <input type="text" name="location1" placeholder="location1"><br>
        <input type="text" name="price1" placeholder="price1"><br>
    
    
    
                <h1>Get Staycation information</h1>
        <input type="text" name="term2" placeholder="term2"><br>
        <input type="text" name="location2" placeholder="location2"><br>
        <input type="text" name="price2" placeholder="price2"><br>
    
        <input type="submit" value="Search">
    </form>


</body>
</html>