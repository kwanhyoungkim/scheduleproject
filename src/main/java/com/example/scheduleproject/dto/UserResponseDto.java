package com.example.scheduleproject.dto;

import lombok.Getter;

@Getter
public class UserResponseDto {

    private final Long userId;
    private final String name;
    private final String email;

    public UserResponseDto(Long userId, String name, String email){
        this.userId=userId;
        this.name=name;
        this.email=email;
    }

}
