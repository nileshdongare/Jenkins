package com.element.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.element.entity.Gender;

@Repository
@EnableJpaRepositories
public interface GenderDao extends JpaRepository<Gender, Serializable> {
	
	@Query("select genderName from Gender")
	public List<String> getGenderName();

}
