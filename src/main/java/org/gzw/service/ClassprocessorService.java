package org.gzw.service;

import org.gzw.entity.Classprocessor;

import java.util.List;

public interface ClassprocessorService {

    List<Classprocessor> Classprocessorfinall();

    Classprocessor Classprocessorfinbyid(int id);

    void insertClassprocessor(Classprocessor Classprocessor);

    void updateClassprocessor(Classprocessor Classprocessor);

    void deleClassprocessor(int id);
}
