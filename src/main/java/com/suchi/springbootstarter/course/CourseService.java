package com.suchi.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository course_repo;
	
	public List<Course> getCourses(int topicId){
		List<Course> courses = new ArrayList<Course>();
		//course_repo.findAll().forEach(courses::add);
		courses = course_repo.findByTopicTopicId(topicId);
		
		return courses;
	}
	
	public Course getCourse(int id){
		//Lambda function
		//return courses.stream().filter(c -> (c.getCourseId() == id)).findFirst().get();
		return course_repo.findOne(id);
	}
	
	public void createCourse(Course c) {
		//courses.add(c);
		course_repo.save(c);
		
	}

	public void updateCourse(Course course) {
		/*
		 * for(Course c : courses) { if (c.getCourseId() == course_Id) {
		 * courses.set(course_Id, course); } }
		 */
		course_repo.save(course);
	}
}
