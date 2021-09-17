package com.springDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	// Autowired For field injection - Accomplished by using Java Reflection, no need for setter methods.
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {System.out.println(">> Inside the default constructor.");}
	
	
	// Using @Qualifier with a constructor
	
	/*
	   @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {

        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
        
        fortuneService = theFortuneService;
    }
	 */
	
	
	
	/*
	@Autowired
	public void AnyMethodSilly(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside AnyMethodSilly(); method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	// define a setter method for injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService(); method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	// Create a constructor for injections	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyworkout() {
				
		return "Practice your daily workout";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	
	

}
