package com.suchi.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository course_repo;
	
	private List<Course> courses = new ArrayList<Course>(Arrays.asList(new Course(1, "Java", "Java"),
			new Course(2, "Cloud", "Cloud"),
			new Course(3, "ML", "ML")));
	
	public List<Course> getCourses(){
		List<Course> courses = new ArrayList<Course>();
		course_repo.findAll().forEach(courses::add);
		
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

	public void updateCourse(int course_Id, Course course) {
		/*
		 * for(Course c : courses) { if (c.getCourseId() == course_Id) {
		 * courses.set(course_Id, course); } }
		 */
		course_repo.save(course);
	}
}
