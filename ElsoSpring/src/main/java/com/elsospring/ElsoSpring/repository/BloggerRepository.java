package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Blogger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BloggerRepository extends CrudRepository<Blogger, Long> {
    List<Blogger> findAll();
}
