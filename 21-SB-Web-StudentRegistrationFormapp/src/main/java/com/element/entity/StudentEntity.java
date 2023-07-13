package com.element.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Entity
@Data
public class StudentEntity {
	
	
	@GeneratedValue
	@jakarta.persistence.Id
	private Integer Id;
	
    private String name;
	
	private String address;
	
	private String pwd;
	
	private Integer age;
	
	private String timings;
	
	private String gender;
	
	private String course;
	
	
	

	

	
	

	
	  @Override public String toString() { return "Student [Id=" + Id +
	  ", name=" + name + ", address=" + address + ", pwd=" + pwd + ", age=" +
	  age + ", timings=" + timings + ", gender=" + gender + ", course=" + course +
	  "]"; }
	  
	  public Integer getId() { 
		  return Id; }
	  
	  public void setId(Integer id) {
		  Id = id; }
	 

	

	public String getStuName() {
		return name;
	}

	public void setName(String stuName) {
		this.name = stuName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	

}
