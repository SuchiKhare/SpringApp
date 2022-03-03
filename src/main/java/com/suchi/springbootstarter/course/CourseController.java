package com.suchi.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService course_service;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return course_service.getCourses();
	}
	
}
