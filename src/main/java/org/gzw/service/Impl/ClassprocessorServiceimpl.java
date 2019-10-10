package org.gzw.service.Impl;

import org.gzw.dao.ClassprocessorDao;
import org.gzw.entity.Classmemory;
import org.gzw.entity.Classprocessor;
import org.gzw.service.ClassmemoryService;
import org.gzw.service.ClassprocessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("classprocessorService")
public class ClassprocessorServiceimpl implements ClassprocessorService {

    @Autowired
    private ClassprocessorDao classprocessorDao;

    @Override
    public List<Classprocessor> Classprocessorfinall() {
        return classprocessorDao.Classprocessorfinall();
    }

    @Override
    public Classprocessor Classprocessorfinbyid(int id) {
        return classprocessorDao.Classprocessorfinbyid(id);
    }

    @Override
    public void insertClassprocessor(Classprocessor Classprocessor) {
    classprocessorDao.insertClassprocessor(Classprocessor);
    }

    @Override
    public void updateClassprocessor(Classprocessor Classprocessor) {
        classprocessorDao.updateClassprocessor(Classprocessor);
    }

    @Override
    public void deleClassprocessor(int id) {
        classprocessorDao.deleClassprocessor(id);
    }
}
