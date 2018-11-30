package com.finalproject.VacationOrStaycation;

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
import org.springframework.web.util.UriComponentsBuilder;

import com.finalproject.VacationOrStaycation.entity.Flight;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Controller
public class HomeController {

	@Value("${skyscanner.key}")
	String skyKey;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "indexGate", "Live!");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/search")
	public ModelAndView testNoVals(Flight flight) {
		
		HttpResponse<JsonNode> response;
		try {
			response = Unirest.post("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/pricing/v1.0")
					.header("X-Mashape-Key", skyKey)
					.header("Content-Type", "application/x-www-form-urlencoded")
					.header("Accept", "application/json")
					.field("adults", 1)
					.field("cabinClass", "business")
					.field("children", 0)
					.field("country", "US")
					.field("currency", "USD")
					.field("destinationPlace", "LHR-sky")
					.field("groupPricing", "false")
					.field("inboundDate", "2019-01-10")
					.field("infants", 0)
					.field("locale", "en-US")
					.field("originPlace", "SFO-sky")
					.field("outboundDate", "2019-01-01")
					.asJson();
			System.out.println(response.getStatus());
			return new ModelAndView("travel-result", "getSession", response);
			
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("please work plz");
		}
		
		return new ModelAndView("travel-result", "getPage", flight  );
	}
			
	
}
