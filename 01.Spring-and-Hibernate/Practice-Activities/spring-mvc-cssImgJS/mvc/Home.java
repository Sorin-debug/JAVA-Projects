package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	// return view name
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	
	
}
