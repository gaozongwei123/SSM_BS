package org.gzw.service;

import org.gzw.entity.Classmemory;

import java.util.List;

public interface ClassmemoryService {
    /**
     * 查询所有机身内存
     * @return
     */
    List<Classmemory> classmemoryfinall();

    Classmemory classmemoryfinbyid(int id);

    void insertClassmemory(Classmemory classmemory);

    void updateClassmemory(Classmemory classmemory);

    void deleClassmemory(int id);
}
