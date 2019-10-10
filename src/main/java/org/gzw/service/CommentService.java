package org.gzw.service;

import org.gzw.entity.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> Commentfinall();

    Comment Commentfinbyid(int id);

    void insertComment(Comment Comment);

    void updateComment(Comment Comment);

    void deleComment(int id);
}
