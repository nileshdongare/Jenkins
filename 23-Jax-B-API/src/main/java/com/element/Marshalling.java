package com.element;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
	
	public static void main(String[] args) throws JAXBException {
		Student student = new Student();
		student.setId(101);
		student.setName("Nilesh");
		student.setAddress("Gondia");
		student.setCity("MH");
		
		
		JAXBContext newInstance = JAXBContext.newInstance(Student.class);
		
		Marshaller marshaller= newInstance.createMarshaller();
		marshaller.marshal(student, System.out);
	}

}
