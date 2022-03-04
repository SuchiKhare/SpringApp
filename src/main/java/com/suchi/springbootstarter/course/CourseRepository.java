package com.suchi.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	//pass topic id and return courses
	//custom find method then use find
	//which property i need to search
	//after by , the portion should match the property name
	public List<Course> findByTopicTopicId(int topicId);
}
