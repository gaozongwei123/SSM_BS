package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classrunningmemory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassrunningmemoryDao {


    @Select("select * from classrunningmemory")
    List<Classrunningmemory> Classrunningmemoryfinall();

    @Select("select * from classrunningmemory where runningmemoryid=#{runningmemoryid}")
    Classrunningmemory Classrunningmemoryfinbyid(int id);

    @Insert("INSERT into classrunningmemory(runningname)VALUES(#{runningname})")
    void insertClassrunningmemory(Classrunningmemory classrunningmemory);

    @Update("UPDATE  classrunningmemory SET runningname=#{runningname} WHERE `runningmemoryid`=#{runningmemoryid}")
    void updateClassrunningmemory(Classrunningmemory classrunningmemory);

    @Delete("DELETE from classrunningmemory WHERE `runningmemoryid`=#{runningmemoryid}")
    void deleClassrunningmemory(int id);
}
