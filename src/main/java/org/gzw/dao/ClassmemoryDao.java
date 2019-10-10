package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classmemory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassmemoryDao {

    /**
     * 查询所有机身内存
     * @return
     */

    @Select("select * from classmemory")
    List<Classmemory> classmemoryfinall();

    @Select(" select * from classmemory where fuselagememoryid=#{fuselagememoryid}")
    Classmemory classmemoryfinbyid(int id);
    @Insert("INSERT into classmemory(memoryidname)VALUES(#{memoryidname})")
    void insertClassmemory(Classmemory classmemory);

    @Update(" UPDATE  classmemory SET memoryidname=#{memoryidname} WHERE `fuselagememoryid`=#{fuselagememoryid}")
    void updateClassmemory(Classmemory classmemory);

    @Delete("DELETE from classmemory WHERE `fuselagememoryid`=#{fuselagememoryid}")
    void deleClassmemory(int id);

}
