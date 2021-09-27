package com.JobTech;

import java.util.LinkedHashMap;

public class Register {

	
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	private String itOptionField;
	private LinkedHashMap <String, String> itOption;
	
	private String jobLevel;
	
	public Register() {
		
		itOption = new LinkedHashMap<>();	
		
		itOption.put("SW", "Software");
		itOption.put("HW", "Hardware");
				
	}
	
	
	
	// create the getter/setter
	
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getItOptionField() {
		return itOptionField;
	}



	public void setItOptionField(String itOptionField) {
		this.itOptionField = itOptionField;
	}



	public LinkedHashMap<String, String> getItOption() {
		return itOption;
	}

	public void setItOption(LinkedHashMap<String, String> itOption) {
		this.itOption = itOption;
	}



	public String getJobLevel() {
		return jobLevel;
	}



	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	
	
	
}
