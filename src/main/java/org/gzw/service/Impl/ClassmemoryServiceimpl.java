package org.gzw.service.Impl;

import org.gzw.dao.ClassmemoryDao;
import org.gzw.entity.Classmemory;
import org.gzw.service.ClassmemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassmemoryServiceimpl implements ClassmemoryService {

    @Autowired
    private ClassmemoryDao classmemoryDao;
    @Override
    public List<Classmemory> classmemoryfinall() {
        return classmemoryDao.classmemoryfinall();
    }

    @Override
    public Classmemory classmemoryfinbyid(int id) {
        return classmemoryDao.classmemoryfinbyid(id);
    }

    @Override
    public void insertClassmemory(Classmemory classmemory) {
   classmemoryDao.insertClassmemory(classmemory);
    }

    @Override
    public void updateClassmemory(Classmemory classmemory) {
    classmemoryDao.updateClassmemory(classmemory);
    }

    @Override
    public void deleClassmemory(int id) {
    classmemoryDao.deleClassmemory(id);
    }
}
