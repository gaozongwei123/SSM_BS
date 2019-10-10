package org.gzw.service.Impl;

import org.gzw.dao.FavorlistDao;
import org.gzw.entity.Favorlist;
import org.gzw.service.FavorlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("favorlistService")
public class FavorlistServiceimpl implements FavorlistService {



    @Autowired
    private FavorlistDao favorlistDao;
    @Override
    public List<Favorlist> Favorlistfinall() {
        return favorlistDao.Favorlistfinall();
    }

    @Override
    public Favorlist Favorlistfinbyid(int id) {
        return favorlistDao.Favorlistfinbyid(id);
    }

    @Override
    public void insertFavorlist(Favorlist Favorlist) {
        favorlistDao.insertFavorlist(Favorlist);
    }

    @Override
    public void updateFavorlist(Favorlist Favorlist) {
        favorlistDao.updateFavorlist(Favorlist);
    }

    @Override
    public void deleFavorlist(int id) {
            favorlistDao.deleFavorlist(id);
    }
}
