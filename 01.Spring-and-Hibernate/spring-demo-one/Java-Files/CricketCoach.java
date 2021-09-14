package com.springDemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	//adds new field for e-mail address and team
	private String emailAddress;
	private String team;

		
	//create a no-arg constructor	
	public CricketCoach () {
		System.out.println("CricketCoach: Inside the  no-arg constructor.");
	}
		
	
	// setter method	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}

	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside the setter method - setEmailAddress.");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method - setTeam.");
		this.team = team;
	}

		

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min/day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
