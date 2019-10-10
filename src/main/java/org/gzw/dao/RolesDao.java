package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Roles;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolesDao {
    /**
     * 增加
     * @param roles
     */

    @Insert("insert into roles(rolename) values (#{rolename})")
    void insertroles(Roles roles);

    /**
     * 修改
     * @param roles
     */
    @Update("update roles set rolename= #{rolename} where roleid= #{roleid}")
    void updateroles(Roles roles);

    /**
     * 查询所有
     * @return
     */

    @Select("select * from roles")
    List<Roles> rolesfinall();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from roles where roleid=#{roleid}")
    Roles rolesbyid(int id);

    /**
     * 根据id删除
     * @param id
     */
    @Delete("delete from roles where roleid= #{roleid}")
    void delectbyid(int id);

}
