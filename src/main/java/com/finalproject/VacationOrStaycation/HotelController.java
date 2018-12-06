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

import com.finalproject.VacationOrStaycation.yelpEntity.YelpSearch;


@Controller
public class HotelController {


	
	@Value("${yelp.key}")
	String yelpKey;

	
	
	@RequestMapping("/yelp-search")
	public ModelAndView searchStaycation(@RequestParam("term2") String term2, @RequestParam("term1") String term1,
			@RequestParam("location2") String location2, @RequestParam("location1") String location1,
			@RequestParam("price2") String price2, @RequestParam("price1") String price1)
	{
		RestTemplate rt = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + yelpKey);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		String url1 = "https://api.yelp.com/v3/businesses/search?term=" + term1 + "&location=" + location1 + "&price=" + price1;
		String url2 = "https://api.yelp.com/v3/businesses/search?term=" + term2 + "&location=" + location2 + "&price=" + price2;
		ResponseEntity<YelpSearch> response1 = rt.exchange(url1, HttpMethod.GET, entity, YelpSearch.class);
		ResponseEntity<YelpSearch> response2 = rt.exchange(url2, HttpMethod.GET, entity, YelpSearch.class);		
		YelpSearch yelpSearch1 = response1.getBody();
		YelpSearch yelpSearch2 = response2.getBody();

		ModelAndView mv = new ModelAndView("yelp-result", "yelpSearch1", yelpSearch1.getBusinesses());
		mv.addObject("yelpSearch2", yelpSearch2.getBusinesses());
		
		return mv;

	}
	
	
}