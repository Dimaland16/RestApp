package com.example.rest.entity;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Creator {
    private Long id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private List<Topic> topics;

    public Long getId() {
        return id;
    }
}
