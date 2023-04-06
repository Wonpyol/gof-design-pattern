package com.study.structural_patterns.decorator._02_after;
import com.study.structural_patterns.decorator._02_after.client_service.ClientService;
import com.study.structural_patterns.decorator._02_after.component.CommentService;
import com.study.structural_patterns.decorator._02_after.concrete_component.DefaultCommentService;
import com.study.structural_patterns.decorator._02_after.decorator.SpamFilteringCommentDecorator;
import com.study.structural_patterns.decorator._02_after.decorator.TrimmingCommentDecorator;

public class Client {
    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();
        commentService = new SpamFilteringCommentDecorator(commentService);
        commentService = new TrimmingCommentDecorator(commentService);
        ClientService clientService = new ClientService(commentService);
        clientService.writeComment("카지노");
        clientService.writeComment("잼있지? 잼있지? 잼있지?");
        clientService.writeComment("http://wonpyol.com");

    }

}
