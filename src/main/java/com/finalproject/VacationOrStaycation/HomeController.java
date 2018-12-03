package com.finalproject.VacationOrStaycation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.finalproject.VacationOrStaycation.entity.Flight;
import com.finalproject.VacationOrStaycation.entity.FlightResults;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Controller
public class HomeController {

	@Value("${skyscanner.key}")
	String skyKey;
	
	//Pages
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "indexGate", "Live!");
	}
	
	
	//Forms 
	@RequestMapping("/search")
	public ModelAndView getFlights(@RequestParam("adults")Integer adults,
			@RequestParam("cabinClass")String cabinClass,
			@RequestParam("children")Integer children,
			@RequestParam("infants")Integer infants,
			@RequestParam("groupPricing")Boolean groupPricing,
			@RequestParam("currency")String currency,
			@RequestParam("country")String country, 
			@RequestParam("originPlace")String originPlace,
			@RequestParam("destinationPlace")String destinationPlace,
			@RequestParam("inboundDate")String inboundDate,
			@RequestParam("outboundDate")String outboundDate,
			@RequestParam("locale")String locale) {
		
		HttpResponse<JsonNode> session;
		try {
			session = Unirest.post("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/pricing/v1.0")
					.header("X-Mashape-Key", skyKey)
					.header("Content-Type", "application/x-www-form-urlencoded")
					.header("Accept", "application/json")
					.field("adults", adults)
					.field("cabinClass", cabinClass)
					.field("children", children)
					.field("country", country)
					.field("currency", currency)
					.field("destinationPlace", destinationPlace)
					.field("groupPricing", groupPricing)
					.field("inboundDate", inboundDate)
					.field("infants", infants)
					.field("locale", locale)
					.field("originPlace", originPlace)
					.field("outboundDate", outboundDate)
					.asJson();
			//System.out.println(session.getStatus());
			
		Map <String, String> sessionReturn = new HashMap<>();
		sessionReturn.put("location", session.getHeaders().getFirst("Location"));
		//System.out.println(sessionReturn.get("location"));
		
		String sessionKey = sessionReturn.get("location").substring(64, 100);
		//System.out.println(sessionKey);
			
//		HttpResponse<FlightResults> pollSession = Unirest.get("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/pricing/uk2/v1.0/" + sessionKey + "?pageIndex=0&pageSize=10")
//				.header("X-Mashape-Key", skyKey)
//				.asObject(FlightResults.class);
		
		HttpResponse<JsonNode> pollSession = Unirest.get("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/pricing/uk2/v1.0/" + sessionKey + "?pageIndex=0&pageSize=10")
				.header("X-Mashape-Key", skyKey)
				.asJson();
		
		Unirest.setObjectMapper(new ObjectMapper() {
		    private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper
		                = new com.fasterxml.jackson.databind.ObjectMapper();

		    public <T> T readValue(String value, Class<T> valueType) {
		        try {
		            return jacksonObjectMapper.readValue(value, valueType);
		        } catch (IOException e) {
		            throw new RuntimeException(e);
		        }
		    }

		    public String writeValue(Object value) {
		        try {
		            return jacksonObjectMapper.writeValueAsString(value);
		        } catch (JsonProcessingException e) {
		            throw new RuntimeException(e);
		        }
		    }
		});
		
//		FlightResults getFlights = pollSession.getBody();
			
			return new ModelAndView("travel-result", "getSession", pollSession.getBody());
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error, contact support!");
		}
		
		return new ModelAndView("travel-result", "getPage", "Error");
	}
	
	@RequestMapping("/search-results")
	public ModelAndView flightResult() {
		
		RestTemplate rt = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("X-Mashape-Key", skyKey);
		headers.add("Accept", MediaType.APPLICATION_PROBLEM_JSON_VALUE);
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		String url = "https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/pricing/uk2/v1.0/{sessionkey}?pageIndex=0&pageSize=10";
		
		ResponseEntity<Flight> response = rt.exchange(url, HttpMethod.GET, entity, Flight.class);
		
		System.out.println(response.getBody());
		
		return new ModelAndView("travel-result", "travel", "Live!");
	}
			
	
}
