package com.JobTech;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;




@Controller
@RequestMapping("register")
public class RegisterController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create a new person job seeker object
		Register theRegister = new Register();
		
	    // add register object to the model
		theModel.addAttribute("register", theRegister);
		
		return "register-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("register") Register theRegister) {
		
		// log the input data
		System.out.println("Register new: " + theRegister.getFirstName() 
						+ " " + theRegister.getLastName());
		return "register-confirmation";
	}
	
	
	
	
	

}
