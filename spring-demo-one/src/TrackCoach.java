package com.springDemo;

public class TrackCoach implements Coach {
	
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
		}
	
	// define the constructor for dependency injection		
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
	
		return	"Just do it: " + fortuneService.getFortune();
			
	}
	
	
	// LifeCycle of beans - add init method / hook
	public void initMethod() {
		System.out.println("TrackCoach: Method for init.");
	}
	
	
	// LifeCycle of beans - add destroy method	/ hook
	public void destroyMethod() {
		System.out.println("TrackCoach: Method for destroy.");
	}
	
	

}
