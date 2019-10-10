package org.gzw.service.Impl;

import org.apache.ibatis.annotations.Select;
import org.gzw.dao.ShipmentDao;
import org.gzw.entity.Shipment;
import org.gzw.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("shipmentService")
public class ShipmentServiceimpl implements ShipmentService {

    @Autowired
    private ShipmentDao shipmentDao;
    @Override
    public List<Shipment> Shipmentfinall() {
        return shipmentDao.Shipmentfinall();
    }

    @Override
    public Shipment Shipmentfinbyid(int id) {
        return shipmentDao.Shipmentfinbyid(id);
    }

    @Override
    public void insertShipment(Shipment Shipment) {
        shipmentDao.insertShipment(Shipment);
    }

    @Override
    public void updateShipment(Shipment Shipment) {
        shipmentDao.updateShipment(Shipment);
    }

    @Override
    public void deleShipment(int id) {
        shipmentDao.deleShipment(id);
    }
}
