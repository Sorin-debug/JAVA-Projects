package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
// removed the explicit bean id and let the default id (same name as the class )
@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	// Configure dependency injection with @ Autowired annotation
	@Autowired 
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice now or never.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
