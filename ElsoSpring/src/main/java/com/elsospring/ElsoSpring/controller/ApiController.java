package com.elsospring.ElsoSpring.controller;

import com.elsospring.ElsoSpring.domain.Story;
import com.elsospring.ElsoSpring.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private StoryService storyService;

    @Autowired
    public void setStoryService(StoryService storyService) {
        this.storyService = storyService;
    }

    @RequestMapping("/story")
    public Story searchForStory() {
        return storyService.getLastStory();
    }

    @RequestMapping("/title/{title}")
    public Story searchForStory(@PathVariable(value="title") String title) throws Exception {
        return storyService.getSpecificStory(title);
    }

    @RequestMapping("/stories/{name}")
    public List<Story> searchForUser(@PathVariable(value="name") String name) throws Exception {
        return storyService.getStoriesByBloggerName(name);
    }
}
