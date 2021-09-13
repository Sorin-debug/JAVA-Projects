package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		// load the spring configuration file		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		// retrieve bean from spring container			
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// check if they are the same		
		boolean result = (theCoach == alphaCoach);
		
		// print the result (false for prototype, true for Singletone)
		System.out.println("Pointing to the same object: " + result);
		
		// print the memory  location
		// By default is Singleton and the objects will have same memory location
		// Prototype scope used for getting unique memory location for each object
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
				
		// close the context
		context.close();
		
		
		
		

	}

}
