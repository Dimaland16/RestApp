package com.example.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Topic {

    private Long id;
    private Long creatorId;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
    private List<Post> posts;
    private List<Tag> tags;

    public Long getId() {
        return id;
    }


}
