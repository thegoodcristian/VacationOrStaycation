package com.finalproject.VacationOrStaycation.hotelEntity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Occupancies {
	
	private int NoOfAdults;
	private ArrayList<ChildrenAges> search;
	
	
	public Occupancies() {	
		
	}


	public Occupancies(int noOfAdults, ArrayList<ChildrenAges> search) {
		super();
		this.NoOfAdults = noOfAdults;
		this.search = search;
	}


	public int getNoOfAdults() {
		return NoOfAdults;
	}


	public void setNoOfAdults(int noOfAdults) {
		NoOfAdults = noOfAdults;
	}


	public ArrayList<ChildrenAges> getSearch() {
		return search;
	}


	public void setSearch(ArrayList<ChildrenAges> search) {
		this.search = search;
	}


	@Override
	public String toString() {
		return "Occupancies [NoOfAdults=" + NoOfAdults + ", search=" + search + "]";
	}
	
	
	

}
