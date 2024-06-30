package com.jawed.springbootpilot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello JAWED. This is your first REST Service....";
	}
	
	@RequestMapping(value = "/greetings", method = RequestMethod.GET)
	public String[] greetings() {
		String []messages= {"Good Morning", "Good Afternoon", "Good Evening", "Good Night"};
		return messages;
	}
	
	@RequestMapping(value = "/days", method = RequestMethod.GET)
	public String[] days() {
		String []messages= {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
		return messages;
	}

}
