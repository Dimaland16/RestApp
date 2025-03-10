package com.example.rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tag {
    private Long id;
    private String name;
    private List<Topic> topics;

    public Long getId() {
        return id;
    }

}
