package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// reference values from properties file
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Value("${foo.welcomeMsg}")
	private String welcomeMsg;
	
	
	
	@Override
	public String getDailyworkout() {
		return "Swim 5000 meters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	
	
}
