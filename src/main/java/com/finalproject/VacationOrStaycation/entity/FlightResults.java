package com.finalproject.VacationOrStaycation.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class FlightResults {
	private String imageUrl;
	private Integer id;
	private String Code;
	private String name;
	private String displayCode;
	private String carrierId;
	private Integer flightNumber;
	private String journeyMode;
	private String destinationStation;
	private Integer stops;
	private String duration;
	private String arrival;
	private String carriers;
	private String directionality;
	private String originStation;
	private String departure;
	private String flightNumbers;
	
	private ArrayList<Flight> results;
	
}
