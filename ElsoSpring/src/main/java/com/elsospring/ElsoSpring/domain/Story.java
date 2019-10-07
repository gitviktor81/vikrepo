package com.elsospring.ElsoSpring.domain;

import java.util.Date;

public class Story {

    private int id;
    private String title;
    private String content;
    private Date posted;
    private Blogger blogger;

    public Story() {
    }

    public Story(String title, String content, Date posted, Blogger blogger) {
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = blogger;
    }

    public Story(int id, String title, String content, Date posted, int bloggerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.posted = posted;
        this.blogger = new Blogger(1, "Viktor", 37);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Blogger getBlogger() {
        return blogger;
    }

    public void setBlogger(Blogger author) {
        this.blogger = author;
    }
}
