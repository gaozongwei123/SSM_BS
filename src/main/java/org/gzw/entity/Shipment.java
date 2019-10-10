package org.gzw.entity;

public class Shipment {
    private int shipment_id;
    private int uid;
    private String province;
    private String city;
    private String area;
    private String addr;
    private String zipcode;
    private String receivername;
    private String receivertel;
    private String mark;

    public Shipment() {
    }

    public Shipment(int shipment_id, int uid) {
        this.shipment_id = shipment_id;
        this.uid = uid;
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getReceivertel() {
        return receivertel;
    }

    public void setReceivertel(String receivertel) {
        this.receivertel = receivertel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipment_id=" + shipment_id +
                ", uid=" + uid +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", addr='" + addr + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", receivername='" + receivername + '\'' +
                ", receivertel='" + receivertel + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
