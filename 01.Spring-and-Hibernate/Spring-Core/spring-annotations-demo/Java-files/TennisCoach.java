package com.springDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Scope("prototype")

@Component
public class TennisCoach implements Coach {

	// Autowired For field injection - Accomplished by using Java Reflection, no need for setter methods.
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {System.out.println(">> Inside the default constructor.");}
	
		
	// Define my init method
	@PostConstruct
	public void doMyStartupStusff() {
		System.out.println(">>TennishCoach: inside of my doMyStartupStusff");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>TennishCoach: inside of my doMyCleanupStuff");
	}
	
	
	
	
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
