package org.gzw.test;

import org.gzw.entity.Comment;
import org.gzw.service.CommentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class commenttest {




    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentService = (CommentService) applicationContext.getBean("commentService");
        List<Comment> commentfinall = commentService.Commentfinall();
        for (Comment comment:commentfinall){
            System.out.println(comment);
        }
    }

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentService = (CommentService) applicationContext.getBean("commentService");
        Comment comment = commentService.Commentfinbyid(1);
        System.out.println(comment);

    }

    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CommentService commentService = (CommentService) applicationContext.getBean("commentService");
        Comment comment=new Comment();
        comment.setCommentid(4);
        comment.setUid(2);
        comment.setProductid(3);
        comment.setStar(4);
        comment.setContent("cccc");
        commentService.deleComment(4);

    }
}
