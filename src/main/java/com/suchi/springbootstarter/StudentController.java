package com.suchi.springbootstarter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/greet")
	public String greetStudent() {
		return "Hello Student";
	}
	
	
}
