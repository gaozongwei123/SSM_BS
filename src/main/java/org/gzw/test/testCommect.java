package org.gzw.test;

import org.gzw.entity.Comment;
import org.gzw.service.AdminSerice;
import org.gzw.service.CommentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testCommect {

    @Test
    public void test01(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
  CommentService commentService = (CommentService)applicationContext.getBean("commentService");
        List<Comment> commentfinall = commentService.Commentfinall();
            for (Comment comment: commentfinall){
                System.out.println(comment);
            }

    }

}
