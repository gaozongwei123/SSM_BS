package org.gzw.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classsomatotype;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasssomatotypeDao {

    @Select("select * from classsomatotypes")
    List<Classsomatotype> Classsomatotypefinall();

    @Select("select * from classsomatotypes where somatotypeid=#{somatotypeid}")
    Classsomatotype Classsomatotypefinbyid(int id);

    @Insert("INSERT into classsomatotypes(somatotypename)VALUES(#{somatotypename})")
    void insertClasssomatotype(Classsomatotype Classsomatotype);

    @Update("UPDATE  classsomatotypes SET somatotypename=#{somatotypename} WHERE `somatotypeid`=#{somatotypeid}")
    void updateClasssomatotype(Classsomatotype Classsomatotype);

    @Delete("DELETE from classsomatotypes WHERE `somatotypeid`=#{somatotypeid}")
    void deleClasssomatotype(int id);


}
