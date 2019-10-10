package org.gzw.entity;

import java.util.Date;

public class Product {
    private int product_id;
    private double product_price;
    private String picdescp;
    private String pic;
    private double market_price;
    private Date product_add_date;
    private double discount;
    private String product_descp;
    private int brand_id;
    private int somatotypeid;
    private int processorid;
    private int fuselagememoryid;
    private int runningmemoryid;
    private int stock;
    private int userid;
    private String product_remark;
    private Classmemory classmemory;
    private Classrunningmemory classrunningmemory;
    private Classifybrand classifybrand;
    private Classsomatotype classsomatotype;
    private Classprocessor classprocessor;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_price=" + product_price +
                ", picdescp='" + picdescp + '\'' +
                ", pic='" + pic + '\'' +
                ", market_price=" + market_price +
                ", product_add_date=" + product_add_date +
                ", discount=" + discount +
                ", product_descp='" + product_descp + '\'' +
                ", brand_id=" + brand_id +
                ", somatotypeid=" + somatotypeid +
                ", processorid=" + processorid +
                ", fuselagememoryid=" + fuselagememoryid +
                ", runningmemoryid=" + runningmemoryid +
                ", stock=" + stock +
                ", userid=" + userid +
                ", product_remark='" + product_remark + '\'' +
                ", classmemory=" + classmemory +
                ", classrunningmemory=" + classrunningmemory +
                ", classifybrand=" + classifybrand +
                ", classsomatotype=" + classsomatotype +
                ", classprocessor=" + classprocessor +
                '}';
    }

    public Classrunningmemory getClassrunningmemory() {
        return classrunningmemory;
    }

    public void setClassrunningmemory(Classrunningmemory classrunningmemory) {
        this.classrunningmemory = classrunningmemory;
    }

    public Classifybrand getClassifybrand() {
        return classifybrand;
    }

    public void setClassifybrand(Classifybrand classifybrand) {
        this.classifybrand = classifybrand;
    }

    public Classsomatotype getClasssomatotype() {
        return classsomatotype;
    }

    public void setClasssomatotype(Classsomatotype classsomatotype) {
        this.classsomatotype = classsomatotype;
    }

    public Classprocessor getClassprocessor() {
        return classprocessor;
    }

    public void setClassprocessor(Classprocessor classprocessor) {
        this.classprocessor = classprocessor;
    }

    public Product(int product_id, double product_price, String picdescp, String pic, double market_price, Date product_add_date, double discount, String product_descp, int brand_id, int somatotypeid, int processorid, int fuselagememoryid, int runningmemoryid, int stock, int userid, String product_remark, Classmemory classmemory, Classrunningmemory classrunningmemory, Classifybrand classifybrand, Classsomatotype classsomatotype, Classprocessor classprocessor) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.picdescp = picdescp;
        this.pic = pic;
        this.market_price = market_price;
        this.product_add_date = product_add_date;
        this.discount = discount;
        this.product_descp = product_descp;
        this.brand_id = brand_id;
        this.somatotypeid = somatotypeid;
        this.processorid = processorid;
        this.fuselagememoryid = fuselagememoryid;
        this.runningmemoryid = runningmemoryid;
        this.stock = stock;
        this.userid = userid;
        this.product_remark = product_remark;
        this.classmemory = classmemory;
        this.classrunningmemory = classrunningmemory;
        this.classifybrand = classifybrand;
        this.classsomatotype = classsomatotype;
        this.classprocessor = classprocessor;
    }

    public Classmemory getClassmemory() {
        return classmemory;
    }

    public void setClassmemory(Classmemory classmemory) {
        this.classmemory = classmemory;
    }

    public Product() {
    }

    public Product(int product_id, double product_price, String picdescp, String pic, double market_price, Date product_add_date, double discount, String product_descp, int brand_id, int somatotypeid, int processorid, int fuselagememoryid, int runningmemoryid, int stock, int userid, String product_remark) {
        this.product_id = product_id;
        this.product_price = product_price;
        this.picdescp = picdescp;
        this.pic = pic;
        this.market_price = market_price;
        this.product_add_date = product_add_date;
        this.discount = discount;
        this.product_descp = product_descp;
        this.brand_id = brand_id;
        this.somatotypeid = somatotypeid;
        this.processorid = processorid;
        this.fuselagememoryid = fuselagememoryid;
        this.runningmemoryid = runningmemoryid;
        this.stock = stock;
        this.userid = userid;
        this.product_remark = product_remark;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getPicdescp() {
        return picdescp;
    }

    public void setPicdescp(String picdescp) {
        this.picdescp = picdescp;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public double getMarket_price() {
        return market_price;
    }

    public void setMarket_price(double market_price) {
        this.market_price = market_price;
    }

    public Date getProduct_add_date() {
        return product_add_date;
    }

    public void setProduct_add_date(Date product_add_date) {
        this.product_add_date = product_add_date;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getProduct_descp() {
        return product_descp;
    }

    public void setProduct_descp(String product_descp) {
        this.product_descp = product_descp;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getSomatotypeid() {
        return somatotypeid;
    }

    public void setSomatotypeid(int somatotypeid) {
        this.somatotypeid = somatotypeid;
    }

    public int getProcessorid() {
        return processorid;
    }

    public void setProcessorid(int processorid) {
        this.processorid = processorid;
    }

    public int getFuselagememoryid() {
        return fuselagememoryid;
    }

    public void setFuselagememoryid(int fuselagememoryid) {
        this.fuselagememoryid = fuselagememoryid;
    }

    public int getRunningmemoryid() {
        return runningmemoryid;
    }

    public void setRunningmemoryid(int runningmemoryid) {
        this.runningmemoryid = runningmemoryid;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getProduct_remark() {
        return product_remark;
    }

    public void setProduct_remark(String product_remark) {
        this.product_remark = product_remark;
    }
}
