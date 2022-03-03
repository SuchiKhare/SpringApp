package com.suchi.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	public List<Course> getCourses(){
		List<Course> course_lst = new ArrayList<Course>();
		
		course_lst.add(new Course(1, "Java", "Java"));
		course_lst.add(new Course(2, "Cloud", "Cloud"));
		course_lst.add(new Course(3, "ML", "ML"));
		
		return course_lst;
	}
}
