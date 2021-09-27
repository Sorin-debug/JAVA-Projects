package com.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Tomorrow never comes.",
			"Read,listen and act.",
			"Act like an Owner."
	};
	
	// create a random number generator	
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
