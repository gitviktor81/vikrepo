package com.elsospring.ElsoSpring.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Blogger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "blogger")
    private List<Story> stories;

    public Blogger() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "Blogger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", stories=" + stories +
                '}';
    }
}
