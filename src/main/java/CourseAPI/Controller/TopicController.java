package CourseAPI.Controller;

import CourseAPI.Domain.Topic;
import CourseAPI.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping( "/topics")

    public void addTopics(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

   // @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    @PutMapping("/topics/{id}")
    public void updateTopics(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopics(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
