package com.example.scheduleproject.service;

import com.example.scheduleproject.repository.ReCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReCommentService {
    //레퍼지토리 접근
    private final ReCommentRepository recommentRepository;

    @Autowired
    public ReCommentService(ReCommentRepository recommentRepository) {
        this.recommentRepository = recommentRepository;
    }

    // 대댓글 조회


    // 대댓글 생성


    // 대댓글 삭제
    @Transactional
    public void deletedReComment(Long recommentId){
        recommentRepository.deleteedbyId(recommentId);
    }





}