package com.suchi.springbootstarter.course;

import java.util.List;

import javax.websocket.server.PathParam;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService course_service;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return course_service.getCourses();
	}
	@RequestMapping("/course/{Id}")
	public Course getCourse(@PathVariable("Id")  int course_Id){
		return course_service.getCourse(course_Id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {
		//RequestBody is going to tell that request payload body is going to contain the json
		//convert to instance Cource and send further.
		course_service.createCourse(course);
		
	}
}
