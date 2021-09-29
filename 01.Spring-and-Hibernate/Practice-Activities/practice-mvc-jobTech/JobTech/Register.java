package com.JobTech;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Register {

	
	private String firstName;
	private String lastName;
	
	
	// adding validation rules	
	@NotNull
	@Size(min=1, message="Is required")
	private String emailAddress;
	
	
	// adding validation for only digits
	@Pattern(regexp="\\d+", message="Only Numbers, please!")
	private String phoneNumber;
	
	
	private String itOptionField;
	private LinkedHashMap <String, String> itOption;
	
	private String jobLevel;
	
	public Register() {
		
		itOption = new LinkedHashMap<>();	
		
		itOption.put("SW", "Software");
		itOption.put("HW", "Hardware");
				
	}
	
	private String[] programmingLanguage;
	
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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

	public String[] getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String[] programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	
	
	
}
