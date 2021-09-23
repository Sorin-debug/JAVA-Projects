package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	
	private String country;
	private String countryHash;
	
	
	
	private LinkedHashMap <String, String> countryOptions;

	
	
	public Student() {
		
		// populate country options: used ISO country code
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("RO", "Romania");
		countryOptions.put("DE", "Germany");
		countryOptions.put("EN", "England");
		countryOptions.put("SP", "Spain");
		
	}
	
	// set getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	public String getCountryHash() {
		return countryHash;
	}

	public void setCountryHash(String countryHash) {
		this.countryHash = countryHash;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
	
	
	
}
