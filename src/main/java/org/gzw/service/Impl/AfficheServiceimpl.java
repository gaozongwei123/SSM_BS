package org.gzw.service.Impl;

import org.gzw.dao.AfficheDao;
import org.gzw.entity.Affiche;
import org.gzw.service.AfficheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("afficheService")
public class AfficheServiceimpl implements AfficheService {


    @Autowired
    private AfficheDao afficheDao;
    @Override
    public List<Affiche> Affichefinall() {
        return afficheDao.Affichefinall();
    }

    @Override
    public Affiche Affichefinbyid(int id) {
        return afficheDao.Affichefinbyid(id);
    }

    @Override
    public void insertAffiche(Affiche affiche) {
        afficheDao.insertAffiche(affiche);
    }

    @Override
    public void updateAffiche(Affiche affiche) {
afficheDao.updateAffiche(affiche);
    }

    @Override
    public void deleAffiche(int id) {
    afficheDao.deleAffiche(id);
    }
}
