package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Blogger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloggerRepository extends CrudRepository<Blogger, Long> {
    List<Blogger> findAll();
}
