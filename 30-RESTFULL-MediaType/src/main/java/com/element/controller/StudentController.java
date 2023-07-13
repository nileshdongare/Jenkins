package com.element.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.element.bind.Student;
import com.element.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping(value="/student",produces = "Application/xml")
	public ResponseEntity<Student> getStudent(){
		
		Student student = service.getStudent();
		
		return new ResponseEntity<Student>(student,HttpStatus.OK);
		
	}
	

}
