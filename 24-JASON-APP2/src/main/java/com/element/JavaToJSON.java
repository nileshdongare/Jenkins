package com.element;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSON {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		Address address=new Address("Pune", "MH");
		
		InsurancePolicy policy=new InsurancePolicy("Arogya", "27-6-23", "27-6-33", 500000.00);
		User user=new User(101, "Nilesh", 25, address, policy);
		
		ObjectMapper mapper=new ObjectMapper();
		
		
		String json = mapper.writeValueAsString(user);
		
		System.out.println(json);
	}

}
