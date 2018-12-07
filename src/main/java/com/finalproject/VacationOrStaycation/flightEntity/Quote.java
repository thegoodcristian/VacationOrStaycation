package com.finalproject.VacationOrStaycation.flightEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	@JsonProperty("QuoteId")
	private Integer quoteId;
	@JsonProperty("MinPrice")
	private Integer minPrice;
	@JsonProperty("Direct")
	private Boolean direct;
	//private ArrayList<OutboundLeg> outboundLeg;
	//private ArrayList<InboundLeg> inboundLeg;
	
	public Quote() {
		
	}
	
	public Quote(Integer quoteId, Integer minPrice, Boolean direct) {
		super();
		this.quoteId = quoteId;
		this.minPrice = minPrice;
		this.direct = direct;
	}

	public Integer getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public Integer getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}

	public Boolean getDirect() {
		return direct;
	}

	public void setDirect(Boolean direct) {
		this.direct = direct;
	}

	@Override
	public String toString() {
		return "Quotes [quoteId=" + quoteId + ", minPrice=" + minPrice + ", direct=" + direct + "]";
	}
	
	
	
	
	
}
