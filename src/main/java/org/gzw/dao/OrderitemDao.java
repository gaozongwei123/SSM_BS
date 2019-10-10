package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Orderitem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderitemDao {


    List<Orderitem> Orderitemfinall();


    Orderitem Orderitemfinbyid(int id);

    @Insert(" INSERT into Orderitem(Orderitemsname,orderid,productid,quantity,oitotalprice,mark)VALUES(#{Orderitemsname},#{orderid},#{productid},#{quantity},#{oitotalprice},#{mark})")
    void insertOrderitem(Orderitem Orderitem);

    @Update("UPDATE  Orderitem SET Orderitemsname=#{Orderitemsname},orderid=#{orderid},productid=#{productid},quantity=#{quantity},oitotalprice=#{oitotalprice},mark=#{mark} WHERE `Orderitemsid`=#{Orderitemsid}")
    void updateOrderitem(Orderitem Orderitem);

    @Delete("DELETE from Orderitem WHERE `Orderitemsid`=#{Orderitemsid}")
    void deleOrderitem(int id);

}
