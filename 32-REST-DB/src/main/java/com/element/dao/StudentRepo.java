package com.element.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.element.entity.Student;
@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student, Serializable> {

	
	Student save(Student student);



	Student deleteById(Integer id);
	



	
	
	

	

	

}
