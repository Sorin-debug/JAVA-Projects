package com.JobTech;

import java.util.LinkedHashMap;

public class Register {

	
	private String firstName;
	private String lastName;
	private String emailAddress;
	private Integer phoneNumber;
	
	
	private String itOptionField;
	private LinkedHashMap <String, String> itOption;
	
	private String jobLevel;
	
	public Register() {
		
		itOption = new LinkedHashMap<>();	
		
		itOption.put("SW", "Software");
		itOption.put("HW", "Hardware");
				
	}
	
	private String timeTravel;
	
	
	
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


	public Integer getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getTimeTravel() {
		return timeTravel;
	}
	public void setTimeTravel(String timeTravel) {
		this.timeTravel = timeTravel;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
