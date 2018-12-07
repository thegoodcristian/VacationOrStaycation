package com.finalproject.VacationOrStaycation;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.finalproject.VacationOrStaycation.flightEntity.FlightResults;



@Controller
public class FlightController {
	@Value("${skyscanner.key}")
	String skyKey;

//	@RequestMapping("/search-flight")
//	public ModelAndView cheapFlight(@RequestParam("country") String country, @RequestParam("currency") String currency,
//			@RequestParam("destinationplace") String destinationPlace,
//			@RequestParam("inboundpartialdate") String inboundPartialDate,
//			@RequestParam("outboundpartialdate") String outboundPartialDate, @RequestParam("locale") String locale,
//			@RequestParam("originplace") String originPlace) {
//
//		Unirest.setObjectMapper(new ObjectMapper() {
//			private com.fasterxml.jackson.databind.ObjectMapper jacksonObjectMapper = new com.fasterxml.jackson.databind.ObjectMapper();
//
//			public <T> T readValue(String value, Class<T> valueType) {
//				try {
//					return jacksonObjectMapper.readValue(value, valueType);
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//				}
//			}
//
//			public String writeValue(Object value) {
//				try {
//					return jacksonObjectMapper.writeValueAsString(value);
//				} catch (JsonProcessingException e) {
//					throw new RuntimeException(e);
//				}
//			}
//		});
//
//		HttpResponse<FlightResults> flightSession;
//		try {
//			flightSession = Unirest.get(
//					"https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/{country}/{currency}/{locale}/{originplace}/{destinationplace}/{outboundpartialdate}/{inboundpartialdate}")
//					.header("X-Mashape-Key", skyKey).header("Accept", "application/json").routeParam("country", country)
//					.routeParam("currency", currency).routeParam("destinationplace", destinationPlace)
//					.routeParam("inboundpartialdate", inboundPartialDate)
//					.routeParam("outboundpartialdate", outboundPartialDate).routeParam("locale", locale)
//					.routeParam("originplace", originPlace).asObject(FlightResults.class);
//			// .asJson();
//
//			System.out.println("Status: " + flightSession.getStatus());
//			System.out.println("Headers: " + flightSession.getHeaders());
//
//			FlightResults newFlights = flightSession.getBody();
//
//			System.out.println(newFlights);
//
//			return new ModelAndView("flight-result", "getFlights", newFlights.getQuote());
//
//		} catch (UnirestException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//			System.out.println("Error, contact support ninjas!");
//		}
//
//		return new ModelAndView("travel-result", "getPage", "Error");
//	}

	
	//most recent successful connection
//	@RequestMapping("search-flight")
//	public ModelAndView flightSearch(@RequestParam("country") String country, @RequestParam("currency") String currency,
//			@RequestParam("destinationplace") String destinationPlace,
//			@RequestParam("inboundpartialdate") String inboundPartialDate,
//			@RequestParam("outboundpartialdate") String outboundPartialDate, @RequestParam("locale") String locale,
//			@RequestParam("originplace") String originPlace) throws URISyntaxException {
////		URI uri = new URI("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/"
////				+ country + "/" + currency + "/" + locale + "/" + originPlace + "/" + destinationPlace + "/"
////				+ outboundPartialDate + "/" + inboundPartialDate);
//		String uri = "https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/"
//				+ country + "/" + currency + "/" + locale + "/" + originPlace + "/" + destinationPlace + "/"
//				+ outboundPartialDate + "/" + inboundPartialDate;
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("X-Mashape-Key", skyKey);
//		headers.add("Accept", "application/json");
////		RequestEntity<MultiValueMap<String, String>> request = new RequestEntity<MultiValueMap<String, String>>(null,
////				headers, HttpMethod.GET, uri);
//		RestTemplate rT = new RestTemplate();
//		ResponseEntity<FlightResults> response = rT.exchange(uri,HttpMethod.GET, new  HttpEntity<String>(headers), FlightResults.class);
//		return new ModelAndView("flight-result", "getFlights", response.getBody().getCarriers());
//
//	}
	
	//@RequestMapping("flighttest")
//	public ModelAndView flightSearches() throws URISyntaxException {
//		URI uri = new URI("https://skyscanner-skyscanner-flight-search-v1.p.mashape.com/apiservices/browsequotes/v1.0/US/USD/en-US/DTW-sky/DEN-sky/2019-01-01/2019-01-02");
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("X-Mashape-Key", skyKey);
//		headers.add("Accept", "application/json");
//		RequestEntity<MultiValueMap<String, String>> request = new RequestEntity<MultiValueMap<String, String>>(null,
//				headers, HttpMethod.GET, uri);
//		RestTemplate rT = new RestTemplate();
//		ResponseEntity<FlightResults> response = rT.exchange(request, FlightResults.class);
//		return new ModelAndView("flighttest", "flighttest", response.getBody());
//	}
	
}
