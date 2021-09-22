package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
			
	// need a controler method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// new  a controller method to read form data and
	// add data to the model 
	
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter  from HTML form
		String theName = request.getParameter("studentName");
		
		// convert the  data to all caps
		theName = theName.toUpperCase();
		
		// create the message 
		String result = "YO!" + theName;
		
		// add message to the model
		model.addAttribute("message",result);
			
		return "helloworld";
				
	}
	
	// Bind the studentName to the variable theName with @RequestParam
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		// Below will not be needed due to @RequestParam("studentName")
		/*
		// read the request parameter  from HTML form
		String theName = request.getParameter("studentName");
		*/
		
		
		// convert the  data to all caps
		theName = theName.toUpperCase();
		
		// create the message 
		String result = "Hallo, friend v3! " + theName;
		
		// add message to the model
		model.addAttribute("message",result);
			
		return "helloworld";
				
	}
	
	
	
	

}
