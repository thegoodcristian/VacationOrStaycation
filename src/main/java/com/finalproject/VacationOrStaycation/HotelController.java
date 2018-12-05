package com.finalproject.VacationOrStaycation;


import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.VacationOrStaycation.hotelEntity.ChildrenAges;
import com.finalproject.VacationOrStaycation.hotelEntity.Occupancies;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Controller
public class HotelController {

	@Value("${airhob.key}")
	String hotelKey;
	
	
	//Forms
	@RequestMapping("/hotel-search")
	public ModelAndView searchHotel(@RequestParam("city") String city,
			@RequestParam("country") String country,
			@RequestParam("latitude") String latitude,
			@RequestParam("longitude") String longitude,
			@RequestParam("fromDate") String fromDate,
			@RequestParam("toDate") String toDate,
			@RequestParam("clientNationality") String clientNationality,
			@RequestParam("currency") String currency,
			@RequestParam("isAddress") boolean isAddress,
			@RequestParam("isDescription") boolean isDescription,
			@RequestParam("isFacility") boolean isFacility,
			@RequestParam("occupancies") List<Occupancies> occupancies,
			@RequestParam("noOfAdults") String noOfAdults,
			@RequestParam("childrenAges") List<ChildrenAges> childrenAges)
			{
			
	
	HttpResponse<JsonNode> session;
	
	
	try {
		session = Unirest.post("https://dev-sandbox-api.airhob.com/sandboxapi/stays/v1/search")
			.header("apikey", hotelKey)
			.header("mode", "sandbox")
			.header("Content-Type", "application/json")
			.field("city", city)
			.field("country", country)
			.field("latitude", latitude)
			.field("longitude", longitude)
			.field("fromDate", fromDate)
			.field("toDate", toDate)
			.field("clientNationality", clientNationality)
			.field("currency", currency)
			.field("isAddress", isAddress)
			.field("isDescription", isDescription)
			.field("isFacility", isFacility)
			.field("occupancies", occupancies)
			.field("noOfAdults", noOfAdults)
			.field("childrenAges", childrenAges)
			.asJson();


		return new ModelAndView("hotel-result", "hotelResult", "Your search results");
		
		
	} catch (UnirestException e) {
		
		e.printStackTrace();
		
		System.out.println("Error, contact support ninjas!");
		
	}
	
	return new ModelAndView("travel-result", "getPage", "Error");
	

}
}