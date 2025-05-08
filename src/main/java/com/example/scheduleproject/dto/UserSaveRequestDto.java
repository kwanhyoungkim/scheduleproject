package com.example.scheduleproject.dto;

import lombok.Getter;

@Getter
public class UserSaveRequestDto {

    private Long userId;
    private String name;
    private String email;

    public UserSaveRequestDto(Long userId, String name, String email){
        this.userId=userId;
        this.name=name;
        this.email=email;
    }

}

