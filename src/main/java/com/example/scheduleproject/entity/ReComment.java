package com.example.scheduleproject.entity;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReComment {

    public ReComment(){

    }

    private Long userId;
    private Long commentId;
    private Long reCommentId;
    private String reComment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ReComment(Long userId,Long commentId, Long reCommentId, String reComment, LocalDateTime createdAt, LocalDateTime updatedAt){

    }


}
