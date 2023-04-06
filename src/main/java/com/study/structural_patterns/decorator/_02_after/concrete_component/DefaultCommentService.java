package com.study.structural_patterns.decorator._02_after.concrete_component;

import com.study.structural_patterns.decorator._02_after.component.CommentService;

public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println("comment = " + comment);
    }
}
