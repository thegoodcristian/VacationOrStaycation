package com.finalproject.VacationOrStaycation.flightEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotes {
	@JsonProperty("QuoteId")
	private String quoteId;
	@JsonProperty("MinPrice")
	private String minPrice;
	@JsonProperty("Direct")
	private String direct;
	//private ArrayList<OutboundLeg> outboundLeg;
	//private ArrayList<InboundLeg> inboundLeg;
	
	public Quotes() {
		
	}
	
	public Quotes(String quoteId, String minPrice, String direct) {
		super();
		this.quoteId = quoteId;
		this.minPrice = minPrice;
		this.direct = direct;
	}

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	@Override
	public String toString() {
		return "Quotes [quoteId=" + quoteId + ", minPrice=" + minPrice + ", direct=" + direct + "]";
	}
	
	
	
	
	
}
