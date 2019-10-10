package org.gzw.entity;

public class Favorlist {
    private int favorlistid;
    private int userid;
    private int productid;
    private String favordescp;
    private String mark;
    private User user;
    private Product product;

    @Override
    public String toString() {
        return "Favorlist{" +
                "favorlistid=" + favorlistid +
                ", userid=" + userid +
                ", productid=" + productid +
                ", favordescp='" + favordescp + '\'' +
                ", mark='" + mark + '\'' +
                ", user=" + user +
                ", product=" + product +
                '}';
    }

    public int getFavorlistid() {
        return favorlistid;
    }

    public void setFavorlistid(int favorlistid) {
        this.favorlistid = favorlistid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getFavordescp() {
        return favordescp;
    }

    public void setFavordescp(String favordescp) {
        this.favordescp = favordescp;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Favorlist(int favorlistid, int userid, int productid, String favordescp, String mark, User user, Product product) {
        this.favorlistid = favorlistid;
        this.userid = userid;
        this.productid = productid;
        this.favordescp = favordescp;
        this.mark = mark;
        this.user = user;
        this.product = product;
    }

    public Favorlist() {
    }
}
