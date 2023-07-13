package com.element.WebController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.element.binding.Student;
import com.element.entity.StudentEntity;
import com.element.service.StudentService;

@Controller
@SessionAttributes
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@GetMapping("/studentFormLoad")
	public String loadRegForm(Model model) {
		
		model.addAttribute("genders",studentService.getGender());
		model.addAttribute("courses",studentService.getCourse());
		model.addAttribute("timings",studentService.getTiming());
		
		
		
		model.addAttribute("student", new Student());
		 
		
		return "stuRegistration";
		
	}
	
	
	
	@PostMapping("/saveStudent")
	public String saveStudent( Student student, Model model) {
		
		System.out.println(student);
		
		studentService.saveStudent(student);
		
		return "success";
	}
	
	

}
