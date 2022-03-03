package com.suchi.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	//for time being hardcoded
	private List<Course> courses = new ArrayList<Course>(Arrays.asList(new Course(1, "Java", "Java"),
			new Course(2, "Cloud", "Cloud"),
			new Course(3, "ML", "ML")));
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public Course getCourse(int id){
		//Lambda function
		return courses.stream().filter(c -> (c.getCourseId() == id)).findFirst().get();
		
	}
	
	public void createCourse(Course c) {
		courses.add(c);
	}
}
