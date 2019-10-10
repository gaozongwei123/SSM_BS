package org.gzw.service;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Classifybrand;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClassifybranSerce {

    List<Classifybrand> Classifybrandfinall();


    Classifybrand Classifybrandfinbyid(int id);


    void insertClassifybrand(Classifybrand Classifybrand);


    void updateClassifybrand(Classifybrand Classifybrand);

    void deleClassifybrand(int id);

}
