package springbootjer.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@ Service 
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","sp and its description"),
			new Topic("java","java framework","java and its description"),
			new Topic("python","python framework","python and its description")
			));
	public List<Topic> getAllTopics(){
		return topics;
	}
	
		
	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
			
			return topics.stream().filter(st->st.getId().equals(id)).findFirst().get();
			
			
		
	
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}


	public void updateTopic(String id, Topic topic) {
		for(int i=0;i>topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
				
			}
			
		}
		
	}


	public void deleteTopic(String id) {
		topics.removeIf(stm->stm.getId().equals(id));
		
	}
	

}
