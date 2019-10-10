package org.gzw.service;

import org.gzw.entity.Classsomatotype;

import java.util.List;

public interface ClasssomatotypeService {
    List<Classsomatotype> Classsomatotypefinall();

    Classsomatotype Classsomatotypefinbyid(int id);

    void insertClasssomatotype(Classsomatotype Classsomatotype);

    void updateClasssomatotype(Classsomatotype Classsomatotype);

    void deleClasssomatotype(int id);
}
