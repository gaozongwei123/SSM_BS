package org.gzw.service;

import org.gzw.entity.Affiche;

import java.util.List;

public interface AfficheService {




    List<Affiche> Affichefinall();


    Affiche  Affichefinbyid(int id);

    void insertAffiche(Affiche  affiche);

    void updateAffiche(Affiche  affiche);

    void deleAffiche(int id);


}
