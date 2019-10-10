package org.gzw.entity;

public class Orderitem {
    private int orderitemid;
    private int orderid;
    private int productid;
    private int quantity;
    private double oitotalprice;
    private String mark;
    private Product product;
    private Order order;

    @Override
    public String toString() {
        return "Orderitem{" +
                "orderitemid=" + orderitemid +
                ", orderid=" + orderid +
                ", productid=" + productid +
                ", quantity=" + quantity +
                ", oitotalprice=" + oitotalprice +
                ", mark='" + mark + '\'' +
                ", product=" + product +
                ", order=" + order +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Orderitem() {
    }

    public int getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(int orderitemid) {
        this.orderitemid = orderitemid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getOitotalprice() {
        return oitotalprice;
    }

    public void setOitotalprice(double oitotalprice) {
        this.oitotalprice = oitotalprice;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Orderitem(int orderitemid, int orderid, int productid, int quantity, double oitotalprice, String mark) {
        this.orderitemid = orderitemid;
        this.orderid = orderid;
        this.productid = productid;
        this.quantity = quantity;
        this.oitotalprice = oitotalprice;
        this.mark = mark;
    }
}
