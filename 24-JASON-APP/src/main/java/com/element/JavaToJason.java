package com.element;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJason {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		Student s = new Student();
		s.setId(101);
		s.setName("Nilesh");
		s.setAddress("Gondia");
		
		ObjectMapper mapper=new ObjectMapper();
		String json = mapper.writeValueAsString(s);
		
		System.out.println(json);
	}

}
