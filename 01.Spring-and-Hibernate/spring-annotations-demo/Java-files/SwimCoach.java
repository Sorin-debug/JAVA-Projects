package com.springDemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyworkout() {
		return "Swim 5000 meters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
