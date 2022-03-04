package com.suchi.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topic_service;
	
	@RequestMapping("/topic")
	public List<Topic> getTopics(){
		return topic_service.getTopics();
	}
	@RequestMapping("/topic/{Id}")
	public Topic getTopic(@PathVariable("Id")  int topic_Id){
		return topic_service.getTopic(topic_Id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topic_service.createTopic(topic);
		
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/topic/{Id}")
	public void updateTopic(@PathVariable("Id")  int topic_Id, @RequestBody Topic topic) {
		topic_service.updateTopic(topic_Id, topic);
		
	}
}
