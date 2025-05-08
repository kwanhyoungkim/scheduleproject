package com.example.scheduleproject.repository;

import com.example.scheduleproject.entity.Comment;
import com.example.scheduleproject.entity.ReComment;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReCommentRepository {

    ReComment save(ReComment reComment);
    List<ReComment> findAll(Long reCommentId);
    ReComment update(ReComment reComment);
    void deletedByReCommentId(Long reCommentId);



}
