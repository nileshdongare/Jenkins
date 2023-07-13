package com.element.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.element.dao.StudentRepo;
import com.element.entity.Student;

@RestController
public class StudentController {
	
	private static final String Student = null;
	@Autowired
	private StudentRepo repo;
	
	@PostMapping(value = "/add",consumes = {"application/json","application/xml"})
	public ResponseEntity<String> addStuent(@RequestBody Student student){
		String msg =null;
		Student save = repo.save(student);
		if(save.getId()!=null) {
			msg="Student created";
			
		}else {
			msg="Failed";
		}
		
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
		
	}
	@PutMapping(value = "/update/{id}",produces = {"apllication/json","application/xml"})
	public ResponseEntity<String> updateStudent(@RequestBody Student student,@PathVariable Integer id){
		String msg=null;
		Student updateById = repo.save(student);
		if(updateById.getId()!=null) {
			msg="Student update";
		}else {
			msg="Failed";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		
	}
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer id ){
		
		String msg=null;
		//Student deleteById = repo.deleteById(id);
		Student deleteById = repo.deleteById(id);
		
		msg="Student Deleted";
		if(deleteById.getId()!=null) {
			msg="Student Deleted";
			return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
		}else {
			msg="failed";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	
	}
	
}
