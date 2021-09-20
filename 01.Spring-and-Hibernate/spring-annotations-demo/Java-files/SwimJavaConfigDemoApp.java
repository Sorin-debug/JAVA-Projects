package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
	
		// read spring Java configuration class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyworkout());
		
		// call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new method from swim coach which has props values
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		System.out.println("welcome msg: " + theCoach.getWelcomeMsg());
		
		
	
				
		// close the context
		context.close();
		
		
	}

}
