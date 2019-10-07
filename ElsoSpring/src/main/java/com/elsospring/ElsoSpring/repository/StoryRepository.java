package com.elsospring.ElsoSpring.repository;

import com.elsospring.ElsoSpring.domain.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoryRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public StoryRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Story> findAll() {
        String sql = "select * from story order by posted desc";

        return jdbc.query(sql, ((resultSet, i) -> new Story(
                resultSet.getInt("id"),
                resultSet.getString("cim"),
                resultSet.getString("content"),
                resultSet.getDate("posted"),
                resultSet.getInt("blogger_id")
        )));
    }
}
