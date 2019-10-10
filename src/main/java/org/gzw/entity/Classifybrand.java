package org.gzw.entity;

public class Classifybrand {
    private int brand_id;
    private String brandname;
    private String brandremark;

    public Classifybrand() {
    }

    public Classifybrand(int brand_id, String brandname, String brandremark) {
        this.brand_id = brand_id;
        this.brandname = brandname;
        this.brandremark = brandremark;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandremark() {
        return brandremark;
    }

    public void setBrandremark(String brandremark) {
        this.brandremark = brandremark;
    }

    @Override
    public String  toString() {
        return "Classifybrand{" +
                "brand_id=" + brand_id +
                ", brandname='" + brandname + '\'' +
                ", brandremark='" + brandremark + '\'' +
                '}';
    }
}
