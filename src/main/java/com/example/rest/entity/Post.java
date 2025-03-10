package com.example.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Post {
    
    private Long id;
    private Long topicId;
    private String content;

    public Long getId() {
        return id;
    }
}
