package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {
    List<Story> findAll();

    Story findFirstByOrderByPostedDesc();

    Story findById(Integer id);

    Story findByTitle(String title);

    List<Story> findAllByBloggerNameIgnoreCaseOrderByPostedDesc(String name);
}
