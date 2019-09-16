package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Story;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StoryRepository extends CrudRepository<Story, Long> {
    List<Story> findAll();

    Story findFirstByOrderByPostedDesc();

    Story findById(Integer id);

    Story findByTitle(String title);
}
