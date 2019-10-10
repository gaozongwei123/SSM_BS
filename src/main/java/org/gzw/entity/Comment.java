package org.gzw.entity;

import java.util.Date;

public class Comment {
    private int commentid;
    private int uid;
    private int productid;
    private int star;
    private String content;
    private Date create_time;
    private User user;
    private Product product;

    public Comment() {
    }

    public Comment(int commentid, int uid, int productid, int star, String content, Date create_time, User user, Product product) {
        this.commentid = commentid;
        this.uid = uid;
        this.productid = productid;
        this.star = star;
        this.content = content;
        this.create_time = create_time;
        this.user = user;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", uid=" + uid +
                ", productid=" + productid +
                ", star=" + star +
                ", content='" + content + '\'' +
                ", create_time=" + create_time +
                ", user=" + user +
                ", product=" + product +
                '}';
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
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
}
