package com.finalproject.VacationOrStaycation;


import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.VacationOrStaycation.flightEntity.FlightResults;
import com.finalproject.VacationOrStaycation.yelpEntity.YelpSearch;


@Controller
public class HotelController {

	@Value("${skyscanner.key}")
	String skyKey;
	
	@Value("${yelp.key}")
	String yelpKey;

	
	
	@RequestMapping("/yelp-search")
	public ModelAndView searchStaycation(@RequestParam("term2") String term2, @RequestParam("term1") String term1,
			@RequestParam("location2") String location2, @RequestParam("location1") String location1,
			@RequestParam("price2") String price2, @RequestParam("price1") String price1,
			@RequestParam("country") String country, @RequestParam("currency") String currency,
			@RequestParam("destinationplace") String destinationPlace,
			@RequestParam("inboundpartialdate") String inboundPartialDate,
			@RequestParam("outboundpartialdate") String outboundPartialDate, @RequestParam("locale") String locale,
			@RequestParam("originplace") String originPlace) throws URISyntaxException
	{
		String skyUrl = "https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/"
				+ country + "/" + currency + "/" + locale + "/" + originPlace + "/" + destinationPlace + "/"
				+ outboundPartialDate + "/" + inboundPartialDate;	
		HttpHeaders skyHeaders = new HttpHeaders();
		skyHeaders.add("X-Mashape-Key", skyKey);
		skyHeaders.add("Accept", "application/json");
		
		RestTemplate rt = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + yelpKey);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		ResponseEntity<FlightResults> response = rt.exchange(skyUrl,HttpMethod.GET, new  HttpEntity<String>(skyHeaders), FlightResults.class);
		System.out.println(response.getStatusCodeValue()); //this line is necessary
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		String url1 = "https://api.yelp.com/v3/businesses/search?term=" + term1 + "&location=" + location1 + "&price=" + price1;
		String url2 = "https://api.yelp.com/v3/businesses/search?term=" + term2 + "&location=" + location2 + "&price=" + price2;
		ResponseEntity<YelpSearch> response1 = rt.exchange(url1, HttpMethod.GET, entity, YelpSearch.class);
		ResponseEntity<YelpSearch> response2 = rt.exchange(url2, HttpMethod.GET, entity, YelpSearch.class);		
		YelpSearch yelpSearch1 = response1.getBody();
		YelpSearch yelpSearch2 = response2.getBody();

		ModelAndView mv = new ModelAndView("yelp-result", "yelpSearch1", yelpSearch1.getBusinesses());
		mv.addObject("yelpSearch2", yelpSearch2.getBusinesses());
		mv.addObject("getFlights", response.getBody().getCarriers());
		
		return mv;

	}
	
	
}