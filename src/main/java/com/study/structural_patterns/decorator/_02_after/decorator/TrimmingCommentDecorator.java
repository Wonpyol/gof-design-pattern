package com.study.structural_patterns.decorator._02_after.decorator;

import com.study.structural_patterns.decorator._02_after.base_decorator.CommentDecorator;
import com.study.structural_patterns.decorator._02_after.component.CommentService;

public class TrimmingCommentDecorator extends CommentDecorator {
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("?", "");
    }

}
