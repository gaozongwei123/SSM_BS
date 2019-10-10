package org.gzw.service;

import org.gzw.entity.User;

import java.util.Date;
import java.util.List;

public interface UserService {
    User Userbyid(int id);
    //查所有
    List<User> userfinall();
    //增加
    void inserUser(User user);
    //修改
    void updateUser(User user);
    //删除
    void deleUser(int id);
    //根据时间查
    List<User> userdate(Date date);
}
