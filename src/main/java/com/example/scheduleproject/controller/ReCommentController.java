package com.example.scheduleproject.controller;

import com.example.scheduleproject.entity.ReComment;
import com.example.scheduleproject.service.ReCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

public class ReCommentController {

    private final ReCommentService reCommentService;


    @Autowired
    public ReCommentController(ReCommentService reCommentService){this.reCommentService=reCommentService;}

    // 대댓글 생성
    @GetMapping("/api/comments/{commentId}/reComment")
    public ResponseEntity<ReComment> createReComment(@RequestBody ReComment reComment){
        ReComment saveReComment = reCommentService.saveReComment(reComment);
        ResponseEntity<ReComment> reCommentResponseEntity= new ResponseEntity<>(saveReComment, commentId, userId, HttpStatus.CREATED);
        return reCommentResponseEntity;
    }


    // 대댓글 조회
    @GetMapping("/api/comments/{commentId}/reComment/{reCommentId}")
    public ResponseEntity<List<ReComment>> getAllReComment(){
        List<ReComment> reComment=reCommentService.getAllReComment();
        return new ResponseEntity<>(reComment, OK);
    }

    // 대댓글 수정
    @PutMapping("/api/comments/{commentId}/reComment/{reCommentId}")
    public ResponseEntity<String> updateReComment(@PathVariable ReComment reCommentId){
        reCommentService.updateReComment(reCommentId);
        return new ResponseEntity<>("대댓글이 수정되었습니다.",HttpStatusCode.valueOf(200));
    }

    // 대댓글 삭제
    @DeleteMapping("/api/comments/{commentId}/reComment/{reCommentId}")
    public ResponseEntity<String> deleteReComment(@PathVariable Long reCommentId){
        reCommentService.deletedReComment(reCommentId);
        return new ResponseEntity<>("대댓글이 삭제되었습니다.",HttpStatusCode.valueOf(201));
    }

}
