package com.SpringIoC;

public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your putting skills for 3 hours today!";
	}

	@Override
	public String getCross() {
		
		return "Get your 9 cross.";
	}

}
