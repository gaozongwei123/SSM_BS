package org.gzw.service.Impl;

import org.gzw.dao.OrderDao;
import org.gzw.entity.Order;
import org.gzw.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceimpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> Orderfinall()
    {

        return orderDao.Orderfinall();
    }

    @Override
    public Order Orderfinbyid(int id) {
        return orderDao.Orderfinbyid(id);
    }

    @Override
    public void insertOrder(Order Order) {
        orderDao.insertOrder(Order);
    }

    @Override
    public void updateOrder(Order Order) {
    orderDao.updateOrder(Order);
    }

    @Override
    public void deleOrder(int id) {
    orderDao.deleOrder(id);
    }
}
