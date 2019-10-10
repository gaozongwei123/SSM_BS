package org.gzw.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UserDao {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from user where uid=#{id}")
    User Userbyid(int id);
    //查所有
    @Select("select * from user")
    List<User> userfinall();
    //增加
    @Insert(" INSERT into `user`(email,sex,uimgs,username,`password`,uname,numberId,tel,addr,remark,createdate)VALUES(#{email},#{sex},#{uimgs},#{username},#{password},#{uname},#{numberid},#{tel},#{addr},#{remark},now())")
    void inserUser(User user);
    //修改
    @Update(" UPDATE `user` SET email=#{email},sex=#{sex},uimgs=#{uimgs},username=#{username},`password`=#{password},uname=#{uname},numberId=#{numberid},tel=#{tel},addr=#{addr},remark=#{remark} WHERE uid=#{uid}")
    void updateUser(User user);
    //删除
    @Delete("delete from user where uid=#{uid}")
    void deleUser(int id);
    //根据时间查
    @Select("select * from user where date between #{date} and sysdate")
    List<User> userdate(Date date);


}
