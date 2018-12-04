package com.finalproject.VacationOrStaycation.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Entity
//@Table(name="flight")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightSession {
	
	private String adults;
	private String cabinClass;
	private String children;
	private String infants;
	private String groupPricing;
	private String currency;
	private String country;
	private String orginPlace;
	private String destinationPlace;
	private String inboundDate;
	private String outboundDate;
	private String locale;
	
	public FlightSession() {
		
	}

	public FlightSession(String adults, String cabinClass, String children, String infants, String groupPricing,
			String currency, String country, String orginPlace, String destinationPlace, String inboundDate,
			String outboundDate, String locale) {
		super();
		this.adults = adults;
		this.cabinClass = cabinClass;
		this.children = children;
		this.infants = infants;
		this.groupPricing = groupPricing;
		this.currency = currency;
		this.country = country;
		this.orginPlace = orginPlace;
		this.destinationPlace = destinationPlace;
		this.inboundDate = inboundDate;
		this.outboundDate = outboundDate;
		this.locale = locale;
	}

	public String getAdults() {
		return adults;
	}

	public void setAdults(String adults) {
		this.adults = adults;
	}

	public String getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getInfants() {
		return infants;
	}

	public void setInfants(String infants) {
		this.infants = infants;
	}

	public String getGroupPricing() {
		return groupPricing;
	}

	public void setGroupPricing(String groupPricing) {
		this.groupPricing = groupPricing;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOrginPlace() {
		return orginPlace;
	}

	public void setOrginPlace(String orginPlace) {
		this.orginPlace = orginPlace;
	}

	public String getDestinationPlace() {
		return destinationPlace;
	}

	public void setDestinationPlace(String destinationPlace) {
		this.destinationPlace = destinationPlace;
	}

	public String getInboundDate() {
		return inboundDate;
	}

	public void setInboundDate(String inboundDate) {
		this.inboundDate = inboundDate;
	}

	public String getOutboundDate() {
		return outboundDate;
	}

	public void setOutboundDate(String outboundDate) {
		this.outboundDate = outboundDate;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "Flight [adults=" + adults + ", cabinClass=" + cabinClass + ", children=" + children + ", infants="
				+ infants + ", groupPricing=" + groupPricing + ", currency=" + currency + ", country=" + country
				+ ", orginPlace=" + orginPlace + ", destinationPlace=" + destinationPlace + ", inboundDate="
				+ inboundDate + ", outboundDate=" + outboundDate + ", locale=" + locale + "]";
	}
	
	
	

	
	
	
	
}
	
	
	
	
