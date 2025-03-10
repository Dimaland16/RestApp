package com.example.rest.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class TopicResponseTo {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
    private CreatorResponseTo creator;
    private List<TagResponseTo> tags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public CreatorResponseTo getCreator() {
        return creator;
    }

    public void setCreator(CreatorResponseTo creator) {
        this.creator = creator;
    }

    public List<TagResponseTo> getTags() {
        return tags;
    }

    public void setTags(List<TagResponseTo> tags) {
        this.tags = tags;
    }
}
