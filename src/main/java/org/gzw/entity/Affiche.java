package org.gzw.entity;

import java.util.Date;

public class Affiche {

    private int afficheid;
    private String affichetitle;
    private String affichecontents;
    private int adminid;
    private Date affichedate;
    private String mark;
    private String mark2;
    private Admin admin;

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Affiche{" +
                "afficheid=" + afficheid +
                ", affichetitle='" + affichetitle + '\'' +
                ", affichecontents='" + affichecontents + '\'' +
                ", adminid=" + adminid +
                ", affichedate=" + affichedate +
                ", mark='" + mark + '\'' +
                ", mark2='" + mark2 + '\'' +
                ", admin=" + admin +
                '}';
    }

    public Affiche(int afficheid, String affichetitle, String affichecontents, int adminid, Date affichedate, String mark, String mark2, Admin admin) {
        this.afficheid = afficheid;
        this.affichetitle = affichetitle;
        this.affichecontents = affichecontents;
        this.adminid = adminid;
        this.affichedate = affichedate;
        this.mark = mark;
        this.mark2 = mark2;
        this.admin = admin;
    }

    public Affiche(int afficheid, String affichetitle, String affichecontents, int adminid, Date affichedate, String mark, String mark2) {
        this.afficheid = afficheid;
        this.affichetitle = affichetitle;
        this.affichecontents = affichecontents;
        this.adminid = adminid;
        this.affichedate = affichedate;
        this.mark = mark;
        this.mark2 = mark2;
    }

    public int getAfficheid() {
        return afficheid;
    }

    public void setAfficheid(int afficheid) {
        this.afficheid = afficheid;
    }

    public String getAffichetitle() {
        return affichetitle;
    }

    public void setAffichetitle(String affichetitle) {
        this.affichetitle = affichetitle;
    }

    public String getAffichecontents() {
        return affichecontents;
    }

    public void setAffichecontents(String affichecontents) {
        this.affichecontents = affichecontents;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public Date getAffichedate() {
        return affichedate;
    }

    public void setAffichedate(Date affichedate) {
        this.affichedate = affichedate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark2() {
        return mark2;
    }

    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }

    public Affiche() {
    }
}
