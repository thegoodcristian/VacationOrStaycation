package com.finalproject.VacationOrStaycation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class PricingOptions {
	
//	@JsonProperty("Agents")
//	String agents;
	@JsonProperty("QuoteAgeInMinutes")
	String quoteAgeInMinutes;
	@JsonProperty("Price")
	double price;
	@JsonProperty("DeepLinkUrl")
	String deepLinkUrl;

	public PricingOptions() {
		
	}
	
	public PricingOptions(String agents, String quoteAgeInMinutes, double price, String deepLinkUrl) {
		super();
		//this.agents = agents;
		this.quoteAgeInMinutes = quoteAgeInMinutes;
		this.price = price;
		this.deepLinkUrl = deepLinkUrl;
	}
	

//	public String getAgents() {
//		return agents;
//	}
//
//
//
//	public void setAgents(String agents) {
//		this.agents = agents;
//	}



	public String getQuoteAgeInMinutes() {
		return quoteAgeInMinutes;
	}



	public void setQuoteAgeInMinutes(String quoteAgeInMinutes) {
		this.quoteAgeInMinutes = quoteAgeInMinutes;
	}



	public String getDeepLinkUrl() {
		return deepLinkUrl;
	}



	public void setDeepLinkUrl(String deepLinkUrl) {
		this.deepLinkUrl = deepLinkUrl;
	}



	public PricingOptions(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PricingOptions [price=" + price + "]";
	} 
	
	
}
