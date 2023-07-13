package com.element.binding;

import java.util.Arrays;

import jakarta.persistence.Id;
import lombok.Data;
@Data
public class Student {
	@Id
	private Integer id;
	private String name;
	private String address;
	private String pwd;
	private Integer age;
	
	private String gender;
	private String course;
	private String[] timings;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", pwd=" + pwd + ", age=" + age
				+ ", gender=" + gender + ", course=" + course + ", timings=" + Arrays.toString(timings) + "]";
	}
	

	
	
}
