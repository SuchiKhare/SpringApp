package com.suchi.springbootstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/greet")
	public String greetStudent() {
		return "Hello Student";
	}
	
	@RequestMapping("/")
	public String home() {
		return "Welcome logged in user - both user and admin";
	}
	
	@RequestMapping("/user")
	public String user() {
		return "Welcome user";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome only admin";
	}
}
