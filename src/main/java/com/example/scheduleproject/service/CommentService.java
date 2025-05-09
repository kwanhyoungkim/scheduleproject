package com.example.scheduleproject.service;

import com.example.scheduleproject.dto.CommentResponseDto;
import com.example.scheduleproject.dto.CommentSaveRequestDto;
import com.example.scheduleproject.entity.Comment;
import com.example.scheduleproject.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    //레퍼지토리 접근
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {this.commentRepository=commentRepository;}

    // 댓글 조회
    public List<Comment> getAllComment(){return commentRepository.findAll();}


    // 댓글 저장
    public Comment saveComment(Comment comment){return  commentRepository.save(comment);}

    // 댓글 수정
    public Comment updateComment(Long commentId){return commentRepository.update(commentId);}


    // 댓글 삭제
    public void deletedComment(Long commentId) {
        commentRepository.deletedByCommentId(commentId);
    }

}






       // public CommentResponseDto save(CommentSaveRequestDto commentRequestDto){
       //     Comment comment = new comment(
       //             commentRequestDto.getCommentId(),
       //             commentRequestDto.getComment(),
       //             commentRequestDto.getCreatedAt(),
       //             commentRequestDto.getUserId(),
       //             commentRequestDto.getUpdatedAt()

       //     );

       //     Comment saveComment = commentRepository.save(comment);
       //     return new CommentResponseDto(
       //             saveComment.getCommentId(),
       //             saveComment.getUserId(),
       //             saveComment.getComment(),
       //             saveComment.getCreatedAt(),
       //             saveComment.getUpdatedAt()
       //     );
       // }






