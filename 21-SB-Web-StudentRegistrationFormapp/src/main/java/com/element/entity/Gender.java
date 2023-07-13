package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gender {
	@Id
	private Integer genderId;
	private String genderName;
	
	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderNname(String genderName) {
		this.genderName = genderName;
	}

	
	
	

}
