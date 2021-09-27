package com.springDemo;

import java.util.Random;

public class randomFortuneService implements FortuneService {
		
	// create an array of strings
	private String[] arr = { 
			"You need to work harder!",
			"Luck is on your side!",
			"Sometimes, is just the best to take a break, come back after."
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(arr.length);
		
		String theFortune = arr[index];
		
		return theFortune;
	}
	
	

}
