package com.suchi.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.suchi.springbootstarter.topic.Topic;

@Entity
public class Course {
	@Id
	private int courseId;
	private String courseName;
	private String description;
	
	//Mapping?? many courses to 1 Course
	
	@ManyToOne
	private Topic topic;
	
	public Course(int courseId, String courseName, String description, int topic_Id) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.description = description;
		this.topic = new Topic(topic_Id, "", "");
	}
	public Course( ) {
		
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
