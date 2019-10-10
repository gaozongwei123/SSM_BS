package org.gzw.service.Impl;

import org.gzw.dao.ClassifybrandDao;
import org.gzw.entity.Classifybrand;
import org.gzw.service.ClassifybranSerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classifybranSerce")
public class ClassifybranSerceimpl implements ClassifybranSerce {

    @Autowired
    private ClassifybrandDao classifybranSerce;

    @Override
    public List<Classifybrand> Classifybrandfinall() {
        return classifybranSerce.Classifybrandfinall();
    }

    @Override
    public Classifybrand Classifybrandfinbyid(int id) {
        return classifybranSerce.Classifybrandfinbyid(id);
    }

    @Override
    public void insertClassifybrand(Classifybrand Classifybrand) {
    classifybranSerce.insertClassifybrand(Classifybrand);
    }

    @Override
    public void updateClassifybrand(Classifybrand Classifybrand) {
    classifybranSerce.updateClassifybrand(Classifybrand);
    }

    @Override
    public void deleClassifybrand(int id) {
    classifybranSerce.deleClassifybrand(id);
    }
}
