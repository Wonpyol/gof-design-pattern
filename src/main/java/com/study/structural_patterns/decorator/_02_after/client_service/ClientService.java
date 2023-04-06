package com.study.structural_patterns.decorator._02_after.client_service;

import com.study.structural_patterns.decorator._02_after.component.CommentService;

public class ClientService {
    private CommentService commentService;

    public ClientService(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        this.commentService.addComment(comment);
    }
}
