package org.gzw.service;

import org.gzw.entity.Roles;

import java.util.List;

public interface RolesService {
    /**
     * 增加
     * @param roles
     */
    void insertroles(Roles roles);

    /**
     * 修改
     * @param roles
     */
    void updateroles(Roles roles);

    /**
     * 查询所有
     * @return
     */
    List<Roles> rolesfinall();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Roles rolesbyid(int id);

    /**
     * 根据id删除
     * @param id
     */
    void delectbyid(int id);
}
