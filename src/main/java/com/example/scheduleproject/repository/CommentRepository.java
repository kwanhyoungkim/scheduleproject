package com.example.scheduleproject.repository;

import com.example.scheduleproject.entity.Comment;

import java.util.List;

public interface CommentRepository {
     Comment save(Comment comment);
     List<Comment> findAll(Long commentId);
     Comment update(Long comment);
     void deletedByCommentId(Long CommnetId);
}
