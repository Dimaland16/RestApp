package com.example.rest.dto;

import lombok.Data;

@Data
public class CreatorRequestTo {
    private String login;
    private String password;
    private String firstname;
    private String lastname;
}

