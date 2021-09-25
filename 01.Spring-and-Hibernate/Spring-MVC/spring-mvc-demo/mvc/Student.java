package com.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	
	private String country;
	private String countryHash;
	
	
	
	private LinkedHashMap <String, String> countryOptions;
	
	// for radio button
    private LinkedHashMap<String, String> favoriteLanguageOptions;

	private String favoriteLanguage;
	
	// for operating systems, we need an array of strings
	private String[] operatingSystems;
	
	
	public Student() {
		
		// populate country options: used ISO country code
		
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("RO", "Romania");
		countryOptions.put("DE", "Germany");
		countryOptions.put("EN", "England");
		countryOptions.put("SP", "Spain");
		
		
		// populate favorite language options
        favoriteLanguageOptions = new LinkedHashMap<>();
        // parameter order: value, display label
        //
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");   
		
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	// getter method for radio button
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }
	
	
// getter and setters for array of operating systems
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
}
