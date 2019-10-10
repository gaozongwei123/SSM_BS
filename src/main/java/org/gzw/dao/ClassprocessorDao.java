package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classprocessor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassprocessorDao {
    @Select("select * from classprocessor")
    List<Classprocessor> Classprocessorfinall();

    @Select("select * from classprocessor where processorid=#{processorid}")
    Classprocessor Classprocessorfinbyid(int id);

    @Insert("INSERT into classprocessor(processorname)VALUES(#{processorname})")
    void insertClassprocessor(Classprocessor Classprocessor);

    @Update(" UPDATE  classprocessor SET processorname=#{processorname} WHERE `processorid`=#{processorid}")
    void updateClassprocessor(Classprocessor Classprocessor);

    @Delete("DELETE from classprocessor WHERE `processorid`=#{processorid}")
    void deleClassprocessor(int id);



}
