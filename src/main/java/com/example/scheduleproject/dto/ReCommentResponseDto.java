package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReCommentResponseDto {

    private final Long commentId;
    private final Long reCommentId;
    private final String content;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public ReCommentResponseDto(Long commentId, Long reCommentId, String content, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.commentId=commentId;
        this.reCommentId=reCommentId;
        this.content=content;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }
}
