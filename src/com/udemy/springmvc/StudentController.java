package com.udemy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StudentController")
public class StudentController {
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
//		Create Student Object
		Student theStudent = new Student();
		
//		Adding the object to model attribute
		model.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	@RequestMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		
		System.out.println("TheStudent details : " + theStudent.getFirstName() + " " + 
							theStudent.getLastName());
		
		return "student-confirmation";
	}

}
