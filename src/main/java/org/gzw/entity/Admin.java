package org.gzw.entity;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Admin {
    private int id;
    private  String name;
    private String password;
    private int roleid;
    private Date creadate;
    private String remark;
    private String remark1;
private Roles roles;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roleid=" + roleid +
                ", creadate=" + creadate +
                ", remark='" + remark + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", roles=" + roles +
                '}';
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Admin() {
    }

    public Admin(int id, String name, String password, int roleid, Date creadate, String remark, String remark1) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleid = roleid;
        this.creadate = creadate;
        this.remark = remark;
        this.remark1 = remark1;
    }
    public Admin(int id, String name, String password, int roleid) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleid = roleid;
        this.creadate = creadate;
        this.remark = remark;
        this.remark1 = remark1;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Date getCreadate() {
        return creadate;
    }

    public void setCreadate(Date creadate) {
        this.creadate = creadate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

}
