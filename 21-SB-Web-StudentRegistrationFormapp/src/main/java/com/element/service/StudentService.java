package com.element.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
//import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.element.binding.Student;
import com.element.dao.CourseDao;
import com.element.dao.GenderDao;
import com.element.dao.StudentDao;
import com.element.dao.TimingDao;
//import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.element.entity.StudentEntity;

@Service
public class StudentService {

	@Autowired
	private StudentDao service;

	@Autowired
	private TimingDao timingDao;

	@Autowired
	private CourseDao courseDao;

	@Autowired
	private GenderDao genderDao;

	public List<String> getGender() {

		List<String> genders = genderDao.getGenderName();
		return genders;
	}

	public List<String> getCourse() {

		List<String> courses = courseDao.getCourseName();
		return courses;
	}

	public List<String> getTiming() {

		List<String> timings = timingDao.getTimingName();
		return timings;
	}


	
	
	
	public boolean saveStudent(Student student) {
		
		StudentEntity studentEntity= new StudentEntity();
		
		BeanUtils.copyProperties(student, studentEntity);
		
		StudentEntity save = service.save(studentEntity);
		
		return save!=null & save.getId()!=null;
		
	}

}
