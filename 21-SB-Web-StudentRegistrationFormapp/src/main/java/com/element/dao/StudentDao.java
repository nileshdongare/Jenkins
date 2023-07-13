package com.element.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.element.entity.StudentEntity;

@Repository
public interface StudentDao extends JpaRepository<StudentEntity, Serializable> {
	
	

}
