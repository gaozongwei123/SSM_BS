package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classifybrand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassifybrandDao {

    @Select("select * from classifybrand")
    List<Classifybrand> Classifybrandfinall();

    @Select("select * from classifybrand where brand_id=#{brand_id}")
    Classifybrand Classifybrandfinbyid(int id);

    @Insert(" INSERT into classifybrand(brandname)VALUES(#{brandname})")
    void insertClassifybrand(Classifybrand Classifybrand);

    @Update(" UPDATE  classifybrand SET brandname=#{brandname} WHERE `brand_id`=#{brand_id}")
    void updateClassifybrand(Classifybrand Classifybrand);
    @Delete(" DELETE from classifybrand WHERE `brand_id`=#{brand_id}")
    void deleClassifybrand(int id);


}
