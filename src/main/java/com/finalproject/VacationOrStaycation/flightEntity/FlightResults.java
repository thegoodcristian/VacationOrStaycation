package com.finalproject.VacationOrStaycation.flightEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResults {
	@JsonProperty("Quotes")
	private ArrayList<Quote> quotes;
	@JsonProperty("Carriers")
	private ArrayList<Carriers> carriers;
	
	public FlightResults() {

	}

	public FlightResults(ArrayList<Quote> quotes, ArrayList<Carriers> carriers) {
		this.quotes = quotes;
		this.carriers = carriers;
	}

	public ArrayList<Quote> getQuotes() {
		return quotes;
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	public ArrayList<Carriers> getCarriers() {
		return carriers;
	}

	public void setCarriers(ArrayList<Carriers> carriers) {
		this.carriers = carriers;
	}

	@Override
	public String toString() {
		return "FlightResults [quotes=" + quotes + ", carriers=" + carriers + "]";
	}


}
