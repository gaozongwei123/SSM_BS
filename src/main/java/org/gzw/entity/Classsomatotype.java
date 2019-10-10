package org.gzw.entity;

public class Classsomatotype {
    private int somatotypeid;
    private String somatotypename;

    public Classsomatotype() {
    }

    public Classsomatotype(int somatotypeid, String somatotypename) {
        this.somatotypeid = somatotypeid;
        this.somatotypename = somatotypename;
    }

    public int getSomatotypeid() {
        return somatotypeid;
    }

    public void setSomatotypeid(int somatotypeid) {
        this.somatotypeid = somatotypeid;
    }

    public String getSomatotypename() {
        return somatotypename;
    }

    public void setSomatotypename(String somatotypename) {
        this.somatotypename = somatotypename;
    }

    @Override
    public String toString() {
        return "Classsomatotype{" +
                "somatotypeid=" + somatotypeid +
                ", somatotypename='" + somatotypename + '\'' +
                '}';
    }
}
