package springFortune;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FotbalCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	// define a default constructor
	public FotbalCoach() {
		System.out.println(">> FortuneService: inside default constructor");
	}
		
	@Override
	public String getDailyWorkout() {
		return "Practice, run and shot";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
