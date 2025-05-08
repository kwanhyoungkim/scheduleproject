package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleSaveRequestDto {
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ScheduleSaveRequestDto(Long id, Long userId, String title, String content, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id=id;
        this.userId=userId;
        this.title=title;
        this.content=content;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

}
