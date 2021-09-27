package com.JobTech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Index {
	
	// return view name
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
	
	
}
