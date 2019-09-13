package com.elsospring.ElsoSpring.service;

import com.elsospring.ElsoSpring.domain.Story;
import com.elsospring.ElsoSpring.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {

    StoryRepository storyRepository;

    @Autowired
    public void setStoryRepository(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> getStories() {
        return storyRepository.findAll();
    }
}
