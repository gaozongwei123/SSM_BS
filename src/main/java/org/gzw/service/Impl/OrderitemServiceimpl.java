package org.gzw.service.Impl;

import org.gzw.dao.OrderitemDao;
import org.gzw.entity.Orderitem;
import org.gzw.service.OrderitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderitemService")
public class OrderitemServiceimpl implements OrderitemService {

    @Autowired
    private OrderitemDao orderitemDao;
    @Override
    public List<Orderitem> Orderitemfinall() {
        return orderitemDao.Orderitemfinall();
    }

    @Override
    public Orderitem Orderitemfinbyid(int id) {
        return null;
    }

    @Override
    public void insertOrderitem(Orderitem Orderitem) {

    }

    @Override
    public void updateOrderitem(Orderitem Orderitem) {

    }

    @Override
    public void deleOrderitem(int id) {

    }
}
