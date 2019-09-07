package com.udemy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	
	@RequestMapping("/showFormPage")
	public String viewForm() {
		
		return "silly";
	}

}
