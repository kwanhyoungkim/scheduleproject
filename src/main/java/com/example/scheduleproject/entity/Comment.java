package com.example.scheduleproject.entity;
import com.example.scheduleproject.dto.CommentSaveRequestDto;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
public class Comment {

    @Setter
    private Long userId;
    private Long commentId;
    private String comment;
    @Setter private LocalDateTime createdAt;
    @Setter private LocalDateTime updatedAt;

    public Comment(){

    }

    public Comment(Long userId, Long commentId, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.commentId = commentId;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt= updatedAt;
    }

    public Comment(CommentSaveRequestDto commentRequestDto) {
        this.userId = commentRequestDto.getUserId();
        this.commentId = commentRequestDto.getCommentId();
        this.comment = commentRequestDto.getComment();
        this.createdAt = commentRequestDto.getCreatedAt();
        this.updatedAt=commentRequestDto.getUpdatedAt();
    }



}


































//@Getter
//@AllArgsConstructor
//public class Comment {

//  @Setter
//  private Long userId;
//  private Long commentId;
//  private String comment;
//  private LocalDateTime createdAt;
//  private LocalDateTime updatedAt;

//  public Comment(Long userId, Long commentId){
//      this.userId=userId;
//      this.commentId=commentId;
//      this.comment=comment;
//  }

//public void update(String comment) {this.comment=comment;}

//}{

