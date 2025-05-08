package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReCommentSaveRequestDto {

    private Long userId;
    private Long commentId;
    private Long reCommentId;
    private String reComment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ReCommentSaveRequestDto(Long userId, Long commentId, Long reCommentId, String reComment, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.userId=userId;
        this.commentId=commentId;
        this.reCommentId=reCommentId;
        this.reComment=reComment;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

}
