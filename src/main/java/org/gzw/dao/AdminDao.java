package org.gzw.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Admin;
import org.gzw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {


    List<Admin> adminfinall();

    Admin adminfinallbyid(int id);


    void insertintoadmin(Admin admin);


    void updadmin(Admin admin);


    void deleadmin(int id);

    Boolean logionAdmin(Admin admin);
}
