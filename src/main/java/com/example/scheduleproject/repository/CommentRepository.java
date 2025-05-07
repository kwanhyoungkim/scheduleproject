package com.example.scheduleproject.repository;

import com.example.scheduleproject.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String>{
    Comment save(Comment comment);
    Comment update(Comment comment);
    void deletedByCommentId(Long commentId);

    List<Comment> findAll();
}
