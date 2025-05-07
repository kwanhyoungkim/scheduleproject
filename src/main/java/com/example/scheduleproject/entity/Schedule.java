package com.example.scheduleproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Schedule {

    @Setter
    private Long id;
    private String title;
    private String content;
    private User userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Schedule(String title, String content, User user){
        this.title=title;
        this.content=content;
        this.userId=userId;
        this.id=id;
    }


}
