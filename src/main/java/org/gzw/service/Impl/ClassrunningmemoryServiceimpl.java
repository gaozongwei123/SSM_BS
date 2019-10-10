package org.gzw.service.Impl;

import org.gzw.dao.ClassrunningmemoryDao;
import org.gzw.entity.Classprocessor;
import org.gzw.entity.Classrunningmemory;
import org.gzw.service.ClassprocessorService;
import org.gzw.service.ClassrunningmemoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(" classrunningmemoryService")
public class ClassrunningmemoryServiceimpl implements ClassrunningmemoryService {

    private ClassrunningmemoryDao classrunningmemoryDao;
    @Override
    public List<Classrunningmemory> Classrunningmemoryfinall() {
        return classrunningmemoryDao.Classrunningmemoryfinall();
    }

    @Override
    public Classrunningmemory Classrunningmemoryfinbyid(int id) {
        return classrunningmemoryDao.Classrunningmemoryfinbyid(id);
    }

    @Override
    public void insertClassrunningmemory(Classrunningmemory classrunningmemory) {
        classrunningmemoryDao.insertClassrunningmemory(classrunningmemory);
    }

    @Override
    public void updateClassrunningmemory(Classrunningmemory classrunningmemory) {
        classrunningmemoryDao.updateClassrunningmemory(classrunningmemory);
    }

    @Override
    public void deleClassrunningmemory(int id) {
    classrunningmemoryDao.deleClassrunningmemory(id);
    }
}
