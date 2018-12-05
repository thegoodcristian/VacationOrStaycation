package com.finalproject.VacationOrStaycation.hotelEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelSearch {
	
	@JsonProperty("city")
	private String City;
	@JsonProperty("country")
	private String Country;
	@JsonProperty("latitude")
	private String Latitude;
	@JsonProperty("longitude")
	private String Longitude;
	@JsonProperty("fromDate")
	private String FromDate;
	@JsonProperty("toDate")
	private String ToDate;
	@JsonProperty("clientNationality")
	private String ClientNationality;
	@JsonProperty("currency")
	private String Currency;
	@JsonProperty("isAddress")
	private boolean IsAddress;
	@JsonProperty("isDescription")
	private boolean IsDescription;
	@JsonProperty("isFacility")
	private boolean IsFacility;
	@JsonProperty("noOfAdults")
	private String NoOfAdults;
	@JsonProperty("childrenAges")
	private ArrayList<Integer> ChildrenAges = new ArrayList<>();
	@JsonProperty("occupancies")
	private ArrayList<Occupancies> Occupancies = new ArrayList<>();
	
	public HotelSearch() {
		
	}

	public HotelSearch(String city, String country, String latitude, String longitude, String fromDate, String toDate,
			String clientNationality, String currency, boolean isAddress, boolean isDescription, boolean isFaciltiy,
			String noOfAdults) {
		super();
		this.City = city;
		this.Country = country;
		this.Latitude = latitude;
		this.Longitude = longitude;
		this.FromDate = fromDate;
		this.ToDate = toDate;
		this.ClientNationality = clientNationality;
		this.Currency = currency;
		this.IsAddress = isAddress;
		this.IsDescription = isDescription;
		this.IsFacility = isFaciltiy;
		this.NoOfAdults = noOfAdults;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getFromDate() {
		return FromDate;
	}

	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}

	public String getToDate() {
		return ToDate;
	}

	public void setToDate(String toDate) {
		ToDate = toDate;
	}

	public String getClientNationality() {
		return ClientNationality;
	}

	public void setClientNationality(String clientNationality) {
		ClientNationality = clientNationality;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public boolean isIsAddress() {
		return IsAddress;
	}

	public void setIsAddress(boolean isAddress) {
		IsAddress = isAddress;
	}

	public boolean isIsDescription() {
		return IsDescription;
	}

	public void setIsDescription(boolean isDescription) {
		IsDescription = isDescription;
	}

	public boolean isIsFaciltiy() {
		return IsFacility;
	}

	public void setIsFaciltiy(boolean isFaciltiy) {
		IsFacility = isFaciltiy;
	}

	public String getNoOfAdults() {
		return NoOfAdults;
	}

	public void setNoOfAdults(String noOfAdults) {
		NoOfAdults = noOfAdults;
	}

	@Override
	public String toString() {
		return "FlightSearch [City=" + City + ", Country=" + Country + ", Latitude=" + Latitude + ", Longitude="
				+ Longitude + ", FromDate=" + FromDate + ", ToDate=" + ToDate + ", ClientNationality="
				+ ClientNationality + ", Currency=" + Currency + ", IsAddress=" + IsAddress + ", IsDescription="
				+ IsDescription + ", IsFaciltiy=" + IsFacility + ", NoOfAdults=" + NoOfAdults + "]";
	}
	

}
