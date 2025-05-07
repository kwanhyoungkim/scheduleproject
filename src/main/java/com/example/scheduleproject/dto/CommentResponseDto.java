package com.example.scheduleproject.dto;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentResponseDto {
    private Long commentId;
    private String comment;
    private Long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CommentResponseDto(Long commentId, Long userId, String comment, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.commentId=commentId;
        this.userId=userId;
        this.comment=comment;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

}
