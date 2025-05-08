package com.example.scheduleproject.entity;


import com.example.scheduleproject.dto.ReCommentSaveRequestDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class ReComment {

    @Setter private Long userId;
    @Setter private Long commentId;
    @Setter private Long reCommentId;
    @Setter private String reComment;
    @Setter private LocalDateTime createdAt;
    @Setter private LocalDateTime updatedAt;

    public ReComment(){

    }

    public ReComment(Long userId,Long commentId, Long reCommentId, String reComment, LocalDateTime createdAt, LocalDateTime updatedAt){
        this.userId=userId;
        this.commentId=commentId;
        this.reCommentId=reCommentId;
        this.reComment=reComment;
        this.createdAt=createdAt;
        this.updatedAt=updatedAt;
    }

    public ReComment(ReCommentSaveRequestDto reCommentRequestDto){
        this.userId=reCommentRequestDto.getUserId();
        this.commentId=reCommentRequestDto.getCommentId();
        this.reCommentId=reCommentRequestDto.getReCommentId();
        this.reComment=reCommentRequestDto.getReComment();
        this.createdAt=reCommentRequestDto.getCreatedAt();
        this.updatedAt=reCommentRequestDto.getUpdatedAt();
    }


}
