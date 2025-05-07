package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final Long userId;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public ScheduleResponseDto(Long id, String title, String content, Long userId, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.id=id;
        this.title=title;
        this.content=content;
        this.userId=userId;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

}
