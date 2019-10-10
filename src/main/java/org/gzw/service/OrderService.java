package org.gzw.service;

import org.gzw.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> Orderfinall();

    Order Orderfinbyid(int id);

    void insertOrder(Order Order);

    void updateOrder(Order Order);

    void deleOrder(int id);


}
