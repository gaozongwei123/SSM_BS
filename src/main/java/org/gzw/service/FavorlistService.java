package org.gzw.service;

import org.gzw.entity.Favorlist;

import java.util.List;

public interface FavorlistService {

    List<Favorlist> Favorlistfinall();

    Favorlist Favorlistfinbyid(int id);

    void insertFavorlist(Favorlist Favorlist);

    void updateFavorlist(Favorlist Favorlist);

    void deleFavorlist(int id);
}
