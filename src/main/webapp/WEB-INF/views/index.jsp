<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home - Vacation or Staycation!</title>
</head>
<body>
	${indexGate}
	<h1>Get Flight information</h1>
	<a href="flight-search">Get Flight information</a>

            <h1>Get Vacation information</h1>
    <form action="yelp-search">
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