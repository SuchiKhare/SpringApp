package com.suchi.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService course_service;
	
	@RequestMapping("/topics/{Id}/courses")
	public List<Course> getCourses(@PathVariable("Id") String Id){
		int tId = Integer.parseInt(Id);
		return course_service.getCourses(tId);
	}
	@RequestMapping("/topic/{topicId}/course/{Id}")
	public Course getCourse(@PathVariable("Id")  int course_Id){
		return course_service.getCourse(course_Id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable("topicId")  int topic_Id) {
		//RequestBody is going to tell that request payload body is going to contain the json
		//convert to instance Course and send further.
		course.setTopic(new Topic(topic_Id, "", ""));
		course_service.createCourse(course);
		
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{course_Id}")
	public void updateCourse(@PathVariable("Id")  int course_Id, @RequestBody Course course, @PathVariable("topicId")  int topic_Id) {
		//RequestBody is going to tell that request payload body is going to contain the json
		//convert to instance Cource and send further.
		course.setTopic(new Topic(topic_Id, "", ""));
		course_service.updateCourse(course);
		
	}
}
