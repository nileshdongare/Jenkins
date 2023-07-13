package com.element;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeSirilization {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("abc.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Student obj = mapper.readValue(file, Student.class);
		
		System.out.println(obj);
	}

}
