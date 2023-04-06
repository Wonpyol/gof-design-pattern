package com.study.structural_patterns.decorator._02_after.decorator;

import com.study.structural_patterns.decorator._02_after.base_decorator.CommentDecorator;
import com.study.structural_patterns.decorator._02_after.component.CommentService;

public class SpamFilteringCommentDecorator extends CommentDecorator {
    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("wonpyol");
    }
}
