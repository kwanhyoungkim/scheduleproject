package com.example.scheduleproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class User {

    @Setter
    private Long userId;
    private String name;
    private String email;

    public User(Long userId, String name, String email){
        this.userId=userId;
        this.name=name;
        this.email=email;

    }

}
