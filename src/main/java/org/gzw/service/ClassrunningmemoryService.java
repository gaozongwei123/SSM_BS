package org.gzw.service;

import org.gzw.entity.Classrunningmemory;

import java.util.List;

public interface ClassrunningmemoryService {
    List<Classrunningmemory> Classrunningmemoryfinall();

    Classrunningmemory Classrunningmemoryfinbyid(int id);

    void insertClassrunningmemory(Classrunningmemory classrunningmemory);

    void updateClassrunningmemory(Classrunningmemory classrunningmemory);

    void deleClassrunningmemory(int id);
}
