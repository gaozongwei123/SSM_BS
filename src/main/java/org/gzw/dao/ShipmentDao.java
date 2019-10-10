package org.gzw.dao;



import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gzw.entity.Shipment;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentDao {

    @Select("select * from Shipment")
    List<Shipment> Shipmentfinall();

    @Select("select * from Shipment where shipment_id=#{shipment_id}")
    Shipment Shipmentfinbyid(int id);

    @Insert("INSERT into Shipment(shipment_id,uid,province,city,area,addr,zipcode,receivername,receivertel,mark)VALUES(#{shipment_id},#{uid},#{province},#{city},#{area},#{addr},#{zipcode},#{receivername},#{receivertel},#{mark})")
    void insertShipment(Shipment Shipment);

    @Update("UPDATE  Shipment SET shipment_id=#{shipment_id},province=#{province},city=#{city},area=#{area},zipcode=#{zipcode},receivername=#{receivername},receivertel=#{receivername},mark=#{mark} WHERE `shipment_id`=#{shipment_id}")
    void updateShipment(Shipment Shipment);

    @Delete("DELETE from Shipment WHERE `shipment_id`=#{shipment_id}")
    void deleShipment(int id);


}
