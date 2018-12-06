package com.finalproject.VacationOrStaycation.flightEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResults {
	@JsonProperty("Quotes")
	private ArrayList<Quotes> quotes;
//	@JsonProperty("Carriers")
//	private ArrayList<Carrier> carriers;
	
	public FlightResults() {

	}

	public FlightResults(ArrayList<Quotes> quote) {
		super();
		this.quotes = quote;
	}

	public ArrayList<Quotes> getQuote() {
		return quotes;
	}

	public void setQuote(ArrayList<Quotes> quote) {
		this.quotes = quote;
	}

	@Override
	public String toString() {
		return "FlightResponse [quote=" + quotes + "]";
	}

}
