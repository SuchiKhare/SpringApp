package com.suchi.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topic_repo;
	
	public List<Topic> getTopics(){
		List<Topic> topics = new ArrayList<Topic>();
		topic_repo.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public Topic getTopic(int id){
		return topic_repo.findOne(id);
	}
	
	public void createTopic(Topic t) {
		topic_repo.save(t);
		
	}

	public void updateTopic(int topic_Id, Topic topic) {
		topic_repo.save(topic);
	}
}
