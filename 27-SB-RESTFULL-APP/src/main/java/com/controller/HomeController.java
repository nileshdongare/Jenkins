package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Controller
public class HomeController {
	@GetMapping("/welcome")
	public String m1() {
		String msg="Hiii Tony Stark";
		return msg;
		
	}
	

}
