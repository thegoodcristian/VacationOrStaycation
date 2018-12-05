package com.finalproject.VacationOrStaycation.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Itineraries {
	
	@JsonProperty("PricingOptions")
	private ArrayList<PricingOptions> pricingOptions;
	
	@JsonProperty("OutboundLegId")
	private String outboundLegId;
	@JsonProperty("InboundLegId")
	private String inboundLegId;
	
	public Itineraries() {
		
	}
	
	public Itineraries(ArrayList<PricingOptions> pricingOptions, String outboundLegId, String inboundLegId) {
		super();
		this.pricingOptions = pricingOptions;
		this.outboundLegId = outboundLegId;
		this.inboundLegId = inboundLegId;
	}

	public ArrayList<PricingOptions> getPricingOptions() {
		return pricingOptions;
	}

	public void setPricingOptions(ArrayList<PricingOptions> pricingOptions) {
		this.pricingOptions = pricingOptions;
	}

	public String getOutboundLegId() {
		return outboundLegId;
	}

	public void setOutboundLegId(String outboundLegId) {
		this.outboundLegId = outboundLegId;
	}

	public String getInboundLegId() {
		return inboundLegId;
	}

	public void setInboundLegId(String inboundLegId) {
		this.inboundLegId = inboundLegId;
	}

	@Override
	public String toString() {
		return "Itineraries [pricingOptions=" + pricingOptions + ", outboundLegId=" + outboundLegId + ", inboundLegId="
				+ inboundLegId + "]";
	}

	

	
	
	
}
