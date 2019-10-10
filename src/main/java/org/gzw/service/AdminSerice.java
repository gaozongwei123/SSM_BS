package org.gzw.service;


import org.gzw.entity.Admin;

import java.util.List;

public interface AdminSerice {

    List<Admin> adminfinall();

    Admin adminfinallbyid(int id);

    void insertintoadmin(Admin admin);

    void updadmin(Admin admin);

    void deleadmin(int id);
    Boolean logionAdmin(Admin admin);
}
