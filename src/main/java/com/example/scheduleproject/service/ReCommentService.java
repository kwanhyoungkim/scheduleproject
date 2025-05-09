package com.example.scheduleproject.service;

import com.example.scheduleproject.dto.ReCommentResponseDto;
import com.example.scheduleproject.dto.ReCommentSaveRequestDto;
import com.example.scheduleproject.entity.ReComment;
import com.example.scheduleproject.repository.ReCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReCommentService {

    //레퍼지토리 접근
    private final ReCommentRepository reCommentRepository;

    @Autowired
    public ReCommentService(ReCommentRepository reCommentRepository) {this.reCommentRepository = reCommentRepository;}

    // 대댓글 조회
    public List<ReComment> getAllReComment(){return reCommentRepository.findAll();}

    // 대댓글 생성
    public ReComment saveReComment(ReComment reComment){return reCommentRepository.save(reComment);}

    // 대댓글 수정
    public ReComment updateReComment(ReComment reComment){return reCommentRepository.update(reComment);}

    // 대댓글 삭제
    public void deletedReComment(Long recommentId){reCommentRepository.deletedByReCommentId(recommentId);}


}


   // public ReCommentResponseDto save(ReCommentSaveRequestDto reCommentRequestDto){
   //     ReComment reComment = new reComment(
   //             reCommentRequestDto.getCommentId(),
   //             reCommentRequestDto.getUserId(),
   //             reCommentRequestDto.getReComment(),
   //             reCommentRequestDto.getCreatedAt(),
   //             reCommentRequestDto.getUpdatedAt()
   //     );

   //     ReComment saveReComment = reCommentRepository.save(reComment);
   //     return new ReCommentResponseDto(
   //             saveReComment.getCommentId(),
   //             saveReComment.getUserId(),
   //             saveReComment.getReCommentId(),
   //             saveReComment.getReComment(),
   //             saveReComment.getCreatedAt(),
   //             saveReComment.getUpdatedAt()
   //     );
   // }
















