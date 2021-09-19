package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
	
		// read spring Java configuration class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyworkout());
		
		// call the method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
	
				
		// close the context
		context.close();
		
		
	}

}
