<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yelp Results</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/sandstone/bootstrap.min.css" />
<link rel="stylesheet" href="main.css">
</head>
<body>
<div class="row">
    <div class="column" id="vacation">
                <c:forEach var="y1" items="${yelpSearch1}">
                    <div id="eachVacationHotel">
                    <tr>
                        <td>${y1.name}<br></td>
                        <td>${y1.location}<br></td>
                        <td>${y1.rating}<br></td>
                        <td>${y1.price}<br></td>                  
                        <td>${y1.phone}<br></td>
                        <td>${y1.url}<br></td>        
                        <td>${y1.imageUrl}</td>
                    </tr>
                    </div>
                </c:forEach>
    </div>
    <div class="column" id="staycation">
                <c:forEach var="y2" items="${yelpSearch2}">
                    <div id="eachStaycationHotel">
                    <tr>
                        <td>${y2.name}<br></td>
                        <td>${y2.location}<br></td>
                        <td>${y2.rating}<br></td>
                        <td>${y2.price}<br></td>                  
                        <td>${y2.phone}<br></td>
                        <td>${y2.url}<br></td>        
                        <td>${y2.imageUrl}</td>
                    </tr>
                    </div>
                </c:forEach>
    </div>
</div>
</body>
</html>