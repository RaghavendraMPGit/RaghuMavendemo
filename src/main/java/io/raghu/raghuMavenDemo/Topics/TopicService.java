package io.raghu.raghuMavenDemo.Topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Architect", "Ted Mosby", "passionate builder")
			,new Topic("Anchor", "Robin Schwabarsky", "passionate news reporter"),
			new Topic("Lawyer", "marshall Ericson", "Passionate legal emlpoyee"),
			new Topic("Teacher", "Lilly Ericson", "Passionate KinderGarten Teacher")));
	
	public List<Topic> getAllTopics (){
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
		
		
	}

	public void addTopics(Topic topic) {
		 topics.add(topic);
		 
	}

	public void UpdateTopic(Topic topic, String id) {
	for(int i=0;i<topics.size();i++) {
		Topic t= topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
		}
		return;
		
	}
		
	}

	public void DeleteTopic(String id) {
		topics.removeIf(y-> y.getId().equals(id));
		
	}
}
