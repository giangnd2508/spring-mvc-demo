package com.giangtester.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")	
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")	
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		name = name.toUpperCase();
		String result = "Hey " + name + "!";
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("name") String name, Model model) {
		name = name.toUpperCase();
		String result = "Hey " + name + "! It's from processFormVersionThree";
		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
