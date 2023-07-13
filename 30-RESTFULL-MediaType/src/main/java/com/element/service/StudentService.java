package com.element.service;

import org.springframework.stereotype.Service;

import com.element.bind.Student;
@Service
public class StudentService {
	
	public Student getStudent() {
	Student student = new Student(101, "Nilesh", 25);
	
	return student;
	}
}
