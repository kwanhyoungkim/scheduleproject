package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentSaveRequestDto {

    private Long commentId;
    private Long userId;
    private String comment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CommentSaveRequestDto(Long userId, Long commentId, String comment, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.userId=userId;
        this.commentId=commentId;
        this.comment=comment;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;

    }
}
