package com.finalproject.VacationOrStaycation.flightEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Carriers {

	@JsonProperty("Name")
	private String name;

	public Carriers() {
		// TODO Auto-generated constructor stub
	}

	public Carriers(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Carriers [name=" + name + "]";
	}
	
	
	
}
