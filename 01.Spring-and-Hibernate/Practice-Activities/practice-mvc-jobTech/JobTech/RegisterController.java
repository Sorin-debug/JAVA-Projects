package com.JobTech;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String processForm( @Valid @ModelAttribute("register") Register theRegister, BindingResult theBindingResult) {
		
		// log the input data
		System.out.println("Register new: " + theRegister.getFirstName() 
						+ " " + theRegister.getLastName());
		
		if(theBindingResult.hasErrors()) {
			
			return "register-form";
		}else {
			return "register-confirmation";
		}
		
		
		
	}
	
	
	
	
	

}
