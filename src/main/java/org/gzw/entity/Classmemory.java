package org.gzw.entity;

public class Classmemory {

    private int fuselagememoryid;//机身内存id
    private String memoryidname;//机身内存

    public Classmemory(String memoryidname) {
        this.memoryidname = memoryidname;
    }

    public Classmemory() {
    }

    public int getFuselagememoryid() {
        return fuselagememoryid;
    }

    public void setFuselagememoryid(int fuselagememoryid) {
        this.fuselagememoryid = fuselagememoryid;
    }

    @Override
    public String toString() {
        return "Classmemory{" +
                "fuselagememoryid=" + fuselagememoryid +
                ", memoryidname='" + memoryidname + '\'' +
                '}';
    }

    public String getMemoryidname() {
        return memoryidname;
    }

    public void setMemoryidname(String memoryidname) {
        this.memoryidname = memoryidname;
    }
}
