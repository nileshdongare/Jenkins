package com.element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.element.model.Student;

@Controller
public class StudentController {
	@GetMapping("/student")
	public String getStu() {
		return "stuRegistration";
		
	}
	@PostMapping("/student")
	public String stuRegistration(Student student,Model model) {
		model.addAttribute("sName", student.getsName());
		return "success";
		
	}

}
