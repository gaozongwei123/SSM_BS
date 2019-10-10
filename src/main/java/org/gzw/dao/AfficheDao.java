package org.gzw.dao;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Affiche;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AfficheDao {

    List<Affiche> Affichefinall();


    Affiche Affichefinbyid(int id);

    @Insert("INSERT INTO affiche(affichetitle,affichecontents,adminid,mark,mark2)VALUES(#{affichetitle},#{affichecontents},#{adminid},#{mark},#{mark2})")
    void insertAffiche(Affiche affiche);

    @Update("UPDATE affiche SET affichetitle=#{affichetitle},affichecontents=#{affichecontents},adminid=#{adminid},mark=#{mark},mark2=#{mark2} WHERE afficheid =#{afficheid}")
    void updateAffiche(Affiche affiche);

    @Delete("DELETE FROM affiche WHERE afficheid=#{afficheid}")
    void deleAffiche(int id);
}
