package controller;

import com.example.scheduleproject.entity.Comment;
import com.example.scheduleproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

public class CommentController {

    private final CommentService commentService;


    @Autowired
    public CommentController(CommentService commentService){this.commentService=commentService;}

    // 댓글 생성
    @PostMapping("/api/comments")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment, MultiValueMap<String, String> userId){
        Comment saveCommnet = commentService.saveComment(comment);
        ResponseEntity<Comment> commentResponseEntity = new ResponseEntity<>(saveCommnet,userId, HttpStatus.CREATED);
        return commentResponseEntity;
    }

    // 댓글 조회
    @GetMapping
    public ResponseEntity<List<Comment>> getAllComment(){
        List<Comment> comment=commentService.getAllComment();
        return new ResponseEntity<>(comment, OK);
    }

    // 댓글 수정
    @PutMapping("/api/comment/{commentId}")
    public ResponseEntity<String> updateComment(@PathVariable Long commentId){
        commentService.updateComment(commentId);
        return  new ResponseEntity<>("댓글이 수정되었습니다",HttpStatusCode.valueOf(200));
    }

    // 댓글 삭제
    @DeleteMapping("/api/comment/{commentId}")
    public ResponseEntity<String> deleteComment(@PathVariable Long commentId){
        commentService.deletedComment(commentId);
        return new ResponseEntity<>("댓글이 삭제되었습니다", HttpStatusCode.valueOf(201));
    }

}
