package org.gzw.service.Impl;

import org.gzw.dao.ClasssomatotypeDao;
import org.gzw.entity.Classsomatotype;
import org.gzw.service.ClasssomatotypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classsomatotypeService")
public class ClasssomatotypeServiceimpl implements ClasssomatotypeService {

    @Autowired
    private ClasssomatotypeDao classsomatotypeDao;

    @Override
    public List<Classsomatotype> Classsomatotypefinall() {
        return classsomatotypeDao.Classsomatotypefinall();
    }

    @Override
    public Classsomatotype Classsomatotypefinbyid(int id) {
        return classsomatotypeDao.Classsomatotypefinbyid(id);
    }

    @Override
    public void insertClasssomatotype(Classsomatotype Classsomatotype) {
            classsomatotypeDao.insertClasssomatotype(Classsomatotype);
    }

    @Override
    public void updateClasssomatotype(Classsomatotype Classsomatotype) {
        classsomatotypeDao.updateClasssomatotype(Classsomatotype);
    }

    @Override
    public void deleClasssomatotype(int id) {
    classsomatotypeDao.deleClasssomatotype(id);
    }
}
