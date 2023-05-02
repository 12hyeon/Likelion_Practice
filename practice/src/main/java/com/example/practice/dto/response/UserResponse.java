package com.example.practice.dto.response;

import lombok.Getter;

@Getter
public class UserResponse {
    private Long id;
    private String name;
    private Integer age;

    public UserResponse(Long id, Integer age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
