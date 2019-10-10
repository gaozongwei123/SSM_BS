package org.gzw.service.Impl;

import org.gzw.dao.UserDao;
import org.gzw.entity.User;
import org.gzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceimpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User Userbyid(int id) {
        return userDao.Userbyid(id);
    }

    @Override
    public List<User> userfinall() {
        return userDao.userfinall();
    }

    @Override
    public void inserUser(User user) {
        userDao.inserUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleUser(int id) {
        userDao.deleUser(id);
    }

    @Override
    public List<User> userdate(Date date) {
        return userDao.userdate(date);
    }
}
