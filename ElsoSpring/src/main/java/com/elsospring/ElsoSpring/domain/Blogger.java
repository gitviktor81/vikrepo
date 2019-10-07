package com.elsospring.ElsoSpring.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

public class Blogger {

    private int id;
    private String name;
    private int age;

    @JsonBackReference
    private List<Story> stories;

    public Blogger() {
    }

    public Blogger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Blogger(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
