package org.gzw.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.ibatis.annotations.*;
import org.gzw.entity.Order;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public interface OrderDao {



    List<Order> Orderfinall();


    Order Orderfinbyid(int id);

    @Insert("INSERT INTO `order`(uid,shipment_id,totalprice,orderstateid)VALUES(#{uid},#{shipment_id},#{totalprice},#{orderstateid})")
    void insertOrder(Order Order);

    @Update("UPDATE  `order` SET uid=#{uid},shipment_id=#{shipment_id},totalprice=#{totalprice},orderstateid=#{orderstateid} WHERE orderid=#{orderid}")
    void updateOrder(Order Order);

    @Delete("DELETE FROM `order` WHERE orderid=#{orderid}")
    void deleOrder(int id);



}
