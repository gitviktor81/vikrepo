package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Story;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoryRepository extends CrudRepository<Story, Long> {
    List<Story> findAll();

    Story findFirstByOrderByPostedDesc();

    Story findById(Integer id);

//    @Query(value = "SELECT * from stories where title = ?1 LIMIT 1", nativeQuery = true)
    @Query(value = "SELECT * from stories where cim = :title LIMIT 1", nativeQuery = true)
    Story findByTitle(@Param("title") String title);

    List<Story> findAllByBloggerNameIgnoreCaseOrderByPostedDesc(String name);
}
