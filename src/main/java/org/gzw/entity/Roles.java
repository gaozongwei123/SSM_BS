package org.gzw.entity;


public class Roles {
    private  int roleid;
    private String  rolename;

    public Roles() {
    }

    public Roles(String rolename) {
        this.roleid = roleid;

    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "roleid=" + roleid +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
