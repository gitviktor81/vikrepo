package com.elsospring.ElsoSpring.service;

import com.elsospring.ElsoSpring.domain.Blogger;
import com.elsospring.ElsoSpring.domain.Story;
import com.elsospring.ElsoSpring.repository.BloggerRepository;
import com.elsospring.ElsoSpring.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

@Service
public class StoryService {

    private StoryRepository storyRepository;
    private BloggerRepository bloggerRepository;

    @Autowired
    public void setStoryRepository(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @Autowired
    public void setBloggerRepository(BloggerRepository bloggerRepository) {
        this.bloggerRepository = bloggerRepository;
    }

    public List<Story> getStories() {
        return storyRepository.findAll();
    }
//
//    public Story getLastStory() {
//        return storyRepository.findFirstByOrderByPostedDesc();
//    }
//
//    public Story getStoryById(Integer id) {
//        return storyRepository.findById(id);
//    }
//
//    public Story getSpecificStory(String title) throws Exception {
//        Story specificTitle = storyRepository.findByTitle(title);
//        if (specificTitle == null) {
//            throw new Exception("Nincs ilyen cimmel story az adatbazisban!!!");
//        }
//        return specificTitle;
//    }
//
//    public List<Story> getStoriesByBloggerName(String bloggerName) throws Exception {
//        List<Story> specificStories = storyRepository.findAllByBloggerNameIgnoreCaseOrderByPostedDesc(bloggerName);
//        if (specificStories == null) {
//            throw new Exception("Nincs ilyen névvel blogger az adatbazisban!!!");
//        }
//        return specificStories;
//    }
//
//    @PostConstruct
//    private void init() {
//        Blogger blogger = new Blogger("Belso Gyula", 25);
//        bloggerRepository.save(blogger);
//        Story story = new Story("Belsop cim", "Belso tartalom", new Date(), blogger);
//        storyRepository.save(story);
//    }
}
