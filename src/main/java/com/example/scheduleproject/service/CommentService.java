package com.example.scheduleproject.service;

import com.example.scheduleproject.entity.Comment;
import com.example.scheduleproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    //레퍼지토리 접근
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {this.commentRepository=commentRepository;}

    // 댓글 조회
    public List<Comment> getAllComments(){return commentRepository.findAll();}



    // 댓글 저장
    public Comment saveComment(Comment comment){return  CommentRepository.save(comment);}




    // 댓글 삭제
    @Transactional
    public void deletedComment(Long commentId){
        commentRepository.deletedByCommentId(commentId);
    }




}
