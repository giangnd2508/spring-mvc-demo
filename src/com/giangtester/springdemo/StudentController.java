package com.giangtester.springdemo;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		return "student-detail";
	}
}
