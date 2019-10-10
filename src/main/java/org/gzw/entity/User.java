package org.gzw.entity;

import java.util.Date;


public class User{
    private int uid;
    private String uimgs;//图片地址
    private String username;//用户名
    private String password;//密码
    private String uname;//真是姓名
    private String sex;
    private String numberid;//身份证号
    private String tel;//电话
    private String addr;//地址
    private Date createdate;//创建日期
    private String remark;//备注
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uimgs='" + uimgs + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uname='" + uname + '\'' +
                ", sex='" + sex + '\'' +
                ", numberid='" + numberid + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                ", createdate=" + createdate +
                ", remark='" + remark + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int uid, String uimgs, String username, String password, String uname, String sex, String numberid, String tel, String addr, Date createdate, String remark, String email) {
        this.uid = uid;
        this.uimgs = uimgs;
        this.username = username;
        this.password = password;
        this.uname = uname;
        this.sex = sex;
        this.numberid = numberid;
        this.tel = tel;
        this.addr = addr;
        this.createdate = createdate;
        this.remark = remark;
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public User(int uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public User(int uid, String uimgs, String username, String password, String uname, String numberid, String tel, String addr, Date createdate, String remark) {
        this.uid = uid;
        this.uimgs = uimgs;
        this.username = username;
        this.password = password;
        this.uname = uname;
        this.numberid = numberid;
        this.tel = tel;
        this.addr = addr;
        this.createdate = createdate;
        this.remark = remark;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUimgs() {
        return uimgs;
    }

    public void setUimgs(String uimgs) {
        this.uimgs = uimgs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getNumberid() {
        return numberid;
    }

    public void setNumberid(String numberid) {
        this.numberid = numberid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
