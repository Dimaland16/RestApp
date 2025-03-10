package com.example.rest.dto;

import lombok.Data;

@Data
public class PostResponseTo {
    private Long id;
    private String content;
    private TopicResponseTo topic;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TopicResponseTo getTopic() {
        return topic;
    }

    public void setTopic(TopicResponseTo topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
