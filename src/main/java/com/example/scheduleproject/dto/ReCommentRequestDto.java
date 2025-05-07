package com.example.scheduleproject.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReCommentRequestDto {

    private final Long commentId;
    private final Long reCommentId;
    private final String content;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;
}
