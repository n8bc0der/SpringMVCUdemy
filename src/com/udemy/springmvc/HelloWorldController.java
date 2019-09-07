package com.udemy.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showFormPage")
	public String showFormPage() {
		
		return "displayForm";
		
	}
	
	@RequestMapping("/processFormPage")
	public String processFormPage() {
		
		return "processForm";
		
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormAllCaps(HttpServletRequest request, Model model) {
		
//		read the request parameter from HTML Form
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Hello, you there !!!! " + name;
		
		model.addAttribute("message", result);
		
		return "processForm";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormRequestParam(@RequestParam("studentName") String name, Model model) {
		
//		read the request parameter from HTML Form
//		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Hello, you there !!!! " + name;
		
		model.addAttribute("message", result);
		
		return "processForm";
		
	}

}
