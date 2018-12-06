package com.finalproject.VacationOrStaycation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.finalproject.VacationOrStaycation.entity.Flight;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Controller
public class HomeController {
	
//	@Autowired
//	FlightRepository fr;

	@Value("${skyscanner.key}")
	String skyKey;
	
	//Pages
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "indexGate", "Live!");
	}
	
	@RequestMapping("/flight-search")
	public ModelAndView searchFlight() {
		return new ModelAndView("flight-search", "flightGate", "Live!");
	}
	
}
