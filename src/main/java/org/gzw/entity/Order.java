package org.gzw.entity;

import java.util.Date;
import java.util.List;

public class Order {
    private int orderid;
    private int uid;
    private int shipmentId;
    private double totalprice;
    private Date orderdate;
    private int orderstateid;
    private User user;
    private Shipment shipment;

    public Order() {
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", uid=" + uid +
                ", shipmentId=" + shipmentId +
                ", totalprice=" + totalprice +
                ", orderdate=" + orderdate +
                ", orderstateid=" + orderstateid +
                ", user=" + user +
                ", shipment=" + shipment +
                '}';
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public int getOrderstateid() {
        return orderstateid;
    }

    public void setOrderstateid(int orderstateid) {
        this.orderstateid = orderstateid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Order(int orderid, int uid, int shipmentId, double totalprice, Date orderdate, int orderstateid, User user, Shipment shipment) {
        this.orderid = orderid;
        this.uid = uid;
        this.shipmentId = shipmentId;
        this.totalprice = totalprice;
        this.orderdate = orderdate;
        this.orderstateid = orderstateid;
        this.user = user;
        this.shipment = shipment;
    }
}
