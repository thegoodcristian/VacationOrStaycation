package com.finalproject.VacationOrStaycation.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)

public class FlightResults {
	
	private int count;
	private String next;
	private ArrayList<Flight> results;
	
	public FlightResults() {
		
	}

	public FlightResults(int count, String next, ArrayList<Flight> results, String sessionKey) {
		super();
		this.count = count;
		this.next = next;
		this.results = results;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public ArrayList<Flight> getResults() {
		return results;
	}

	public void setResults(ArrayList<Flight> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "FlightResults [count=" + count + ", next=" + next + ", results="
				+ results + "]";
	}

	

	
	
	
}
