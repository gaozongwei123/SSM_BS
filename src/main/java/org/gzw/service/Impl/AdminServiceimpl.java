package org.gzw.service.Impl;


import org.gzw.dao.AdminDao;
import org.gzw.entity.Admin;
import org.gzw.service.AdminSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminserice")
public class AdminServiceimpl implements AdminSerice {

@Autowired
     private AdminDao adminDao;

    @Override
    public List<Admin> adminfinall() {
        System.out.println("-------------------");
        return adminDao.adminfinall();
    }

    @Override
    public Admin adminfinallbyid(int id) {
        return adminDao.adminfinallbyid(id);
    }

    @Override
    public void insertintoadmin(Admin admin) {
        adminDao.insertintoadmin(admin);

    }

    @Override
    public void updadmin(Admin admin) {
            adminDao.updadmin(admin);
    }

    @Override
    public void deleadmin(int id) {
        adminDao.deleadmin(id);

    }

    @Override
    public Boolean logionAdmin(Admin admin) {
        return adminDao.logionAdmin(admin);
    }
}
