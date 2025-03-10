package com.example.rest.dto;

import lombok.Data;

@Data
public class CreatorResponseTo {
    private Long id;
    private String login;
    private String firstname;
    private String lastname;
}
