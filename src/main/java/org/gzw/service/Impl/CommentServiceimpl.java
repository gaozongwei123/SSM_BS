package org.gzw.service.Impl;

import org.gzw.dao.CommentDao;
import org.gzw.entity.Comment;
import org.gzw.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentService")
public class CommentServiceimpl implements CommentService {

    @Autowired
    private CommentDao commentDao;
    @Override
    public List<Comment> Commentfinall() {
        return commentDao.Commentfinall();
    }

    @Override
    public Comment Commentfinbyid(int id) {
        return commentDao.Commentfinbyid(id);
    }

    @Override
    public void insertComment(Comment Comment) {
     commentDao.insertComment(Comment);
    }

    @Override
    public void updateComment(Comment Comment) {
        commentDao.updateComment(Comment);
    }

    @Override
    public void deleComment(int id) {
        commentDao.deleComment(id);
    }
}
