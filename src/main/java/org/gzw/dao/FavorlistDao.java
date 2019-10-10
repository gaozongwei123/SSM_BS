package org.gzw.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Favorlist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavorlistDao {
    List<Favorlist> Favorlistfinall();

    Favorlist Favorlistfinbyid(int id);

    @Insert("INSERT into favorlist(userid,productid,favordescp,mark)VALUES(#{userid},#{productid},#{favordescp},#{mark})")
    void insertFavorlist(Favorlist Favorlist);

    @Update("UPDATE favorlist set userid=#{userid},productid=#{productid},favordescp=#{favordescp},mark=#{mark} WHERE favorlistid =#{favorlistid}")
    void updateFavorlist(Favorlist Favorlist);

    @Delete("DELETE from favorlist WHERE favorlistid=#{favorlistid}")
    void deleFavorlist(int id);


}
