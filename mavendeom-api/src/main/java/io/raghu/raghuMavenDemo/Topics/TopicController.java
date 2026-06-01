package io.raghu.raghuMavenDemo.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return Arrays.asList(new Topic("Architect", "TedMosby", "passionate builder")
				,new Topic("Anchor", "Robin Schwabarsky", "passionate news reporter"),
				new Topic("Lawyer", "marshall Ericson", "Passionate legal emlpoyee"));
		
	}
}
