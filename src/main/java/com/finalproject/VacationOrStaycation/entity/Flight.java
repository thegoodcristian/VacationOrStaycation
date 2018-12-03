package com.finalproject.VacationOrStaycation.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Flight {
	private String sessionKey;
	private String imageUrl;
	private Integer id;
	private String code;
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

	public Flight() {
		
	}

	public Flight(String sessionKey, String imageUrl, Integer id, String code, String name, String displayCode, String carrierId,
			Integer flightNumber, String journeyMode, String destinationStation, Integer stops, String duration,
			String arrival, String carriers, String directionality, String originStation, String departure,
			String flightNumbers) {
		super();
		this.sessionKey = sessionKey;
		this.imageUrl = imageUrl;
		this.id = id;
		this.code = code;
		this.name = name;
		this.displayCode = displayCode;
		this.carrierId = carrierId;
		this.flightNumber = flightNumber;
		this.journeyMode = journeyMode;
		this.destinationStation = destinationStation;
		this.stops = stops;
		this.duration = duration;
		this.arrival = arrival;
		this.carriers = carriers;
		this.directionality = directionality;
		this.originStation = originStation;
		this.departure = departure;
		this.flightNumbers = flightNumbers;
	}

	public Flight(String sessionKey, String imageUrl, String code, String name, String displayCode, String carrierId, Integer flightNumber,
			String journeyMode, String destinationStation, Integer stops, String duration, String arrival,
			String carriers, String directionality, String originStation, String departure, String flightNumbers) {
		super();
		this.sessionKey = sessionKey;
		this.imageUrl = imageUrl;
		this.code = code;
		this.name = name;
		this.displayCode = displayCode;
		this.carrierId = carrierId;
		this.flightNumber = flightNumber;
		this.journeyMode = journeyMode;
		this.destinationStation = destinationStation;
		this.stops = stops;
		this.duration = duration;
		this.arrival = arrival;
		this.carriers = carriers;
		this.directionality = directionality;
		this.originStation = originStation;
		this.departure = departure;
		this.flightNumbers = flightNumbers;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisplayCode() {
		return displayCode;
	}

	public void setDisplayCode(String displayCode) {
		this.displayCode = displayCode;
	}

	public String getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}

	public Integer getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getJourneyMode() {
		return journeyMode;
	}

	public void setJourneyMode(String journeyMode) {
		this.journeyMode = journeyMode;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Integer getStops() {
		return stops;
	}

	public void setStops(Integer stops) {
		this.stops = stops;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getCarriers() {
		return carriers;
	}

	public void setCarriers(String carriers) {
		this.carriers = carriers;
	}

	public String getDirectionality() {
		return directionality;
	}

	public void setDirectionality(String directionality) {
		this.directionality = directionality;
	}

	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getFlightNumbers() {
		return flightNumbers;
	}

	public void setFlightNumbers(String flightNumbers) {
		this.flightNumbers = flightNumbers;
	}

	@Override
	public String toString() {
		return "Flight [sessionKey=" + sessionKey + ", imageUrl=" + imageUrl + ", id=" + id + ", code=" + code
				+ ", name=" + name + ", displayCode=" + displayCode + ", carrierId=" + carrierId + ", flightNumber="
				+ flightNumber + ", journeyMode=" + journeyMode + ", destinationStation=" + destinationStation
				+ ", stops=" + stops + ", duration=" + duration + ", arrival=" + arrival + ", carriers=" + carriers
				+ ", directionality=" + directionality + ", originStation=" + originStation + ", departure=" + departure
				+ ", flightNumbers=" + flightNumbers + "]";
	}
	
	

	
	
	
	
	
}
