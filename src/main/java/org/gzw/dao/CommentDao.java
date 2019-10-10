package org.gzw.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CommentDao {

    List<Comment> Commentfinall();

    Comment Commentfinbyid(int commentid);

    @Insert("INSERT INTO comments(uid,productid,star,content)VALUES(#{uid},#{productid},#{star},#{content})")
    void insertComment(Comment Comment);

    @Update("UPDATE comments SET uid=#{uid},productid=#{productid},star=#{star},content=#{content} WHERE commentid=#{commentid}")
    void updateComment(Comment Comment);

    @Delete("DELETE from comments WHERE commentid=#{commentid}")
    void deleComment(int id);



}
