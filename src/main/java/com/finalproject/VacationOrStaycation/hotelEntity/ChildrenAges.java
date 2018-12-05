package com.finalproject.VacationOrStaycation.hotelEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChildrenAges {
	
	private int age;

	public ChildrenAges() {
		
	}

	public ChildrenAges(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ChildrenAges [age=" + age + "]";
	}
	
	
}
