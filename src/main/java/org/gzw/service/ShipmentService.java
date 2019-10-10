package org.gzw.service;

import org.gzw.entity.Shipment;

import java.util.List;

public interface ShipmentService {
    List<Shipment> Shipmentfinall();

    Shipment Shipmentfinbyid(int id);

    void insertShipment(Shipment Shipment);

    void updateShipment(Shipment Shipment);

    void deleShipment(int id);
}
