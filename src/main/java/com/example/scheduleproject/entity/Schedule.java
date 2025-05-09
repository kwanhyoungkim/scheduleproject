package com.example.scheduleproject.entity;

import com.example.scheduleproject.dto.ScheduleSaveRequestDto;
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
    private Long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Schedule(String title, String content, Long userId,Long id, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.title=title;
        this.content=content;
        this.userId=userId;
        this.id=id;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

    public Schedule(ScheduleSaveRequestDto scheduleSaveRequestDto){
        this.id=scheduleSaveRequestDto.getId();
        this.title=scheduleSaveRequestDto.getTitle();
        this.content=scheduleSaveRequestDto.getContent();
        this.userId=scheduleSaveRequestDto.getUserId();
        this.createdAt=scheduleSaveRequestDto.getCreatedAt();
        this.updatedAt=scheduleSaveRequestDto.getUpdatedAt();
    }

}
