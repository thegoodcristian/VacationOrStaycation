package com.finalproject.VacationOrStaycation;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.finalproject.VacationOrStaycation.flightEntity.FlightResults;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Controller
public class FlightController {
	@Value("${skyscanner.key}")
	String skyKey;
	
	@RequestMapping("/search-flight")
	public ModelAndView cheapFlight(
			@RequestParam("country") String country,
			@RequestParam("currency") String currency, 
			@RequestParam("destinationplace") String destinationPlace, 
			@RequestParam("inboundpartialdate") String inboundPartialDate,
			@RequestParam("outboundpartialdate") String outboundPartialDate, 
			@RequestParam("locale") String locale,
			@RequestParam("originplace") String originPlace) {
		
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
	
		HttpResponse<FlightResults> flightSession;
		try {
				flightSession = Unirest.get("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}/{inboundpartialdate}")
				.header("X-Mashape-Key", skyKey)
				.header("Accept", "application/json")
				.routeParam("country", country)
				.routeParam("currency", currency)
				.routeParam("destinationplace", destinationPlace)
				.routeParam("inboundpartialdate", inboundPartialDate)
				.routeParam("outboundpartialdate", outboundPartialDate)
				.routeParam("locale", locale)
				.routeParam("originplace", originPlace)
				.asObject(FlightResults.class);
				//.asJson();
				
			//System.out.println(flightSession.getBody());
			
			
			FlightResults newFlights = flightSession.getBody();
			
			System.out.println(newFlights);
			
			return new ModelAndView("flight-result", "getFlights", newFlights.getQuote());
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Error, contact support ninjas!");
		}
		
		return new ModelAndView("travel-result", "getPage", "Error");
	}
}
