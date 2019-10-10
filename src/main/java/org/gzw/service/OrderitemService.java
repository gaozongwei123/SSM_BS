package org.gzw.service;

import org.gzw.entity.Orderitem;

import java.util.List;

public interface OrderitemService {
    List<Orderitem> Orderitemfinall();

    Orderitem Orderitemfinbyid(int id);

    void insertOrderitem(Orderitem Orderitem);

    void updateOrderitem(Orderitem Orderitem);

    void deleOrderitem(int id);
}
