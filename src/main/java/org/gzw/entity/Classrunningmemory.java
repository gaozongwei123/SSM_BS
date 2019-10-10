package org.gzw.entity;

public class Classrunningmemory {
    private int runningmemoryid;
    private String runningname;

    public Classrunningmemory() {
    }

    public Classrunningmemory(int runningmemoryid, String runningname) {
        this.runningmemoryid = runningmemoryid;
        this.runningname = runningname;
    }

    public int getRunningmemoryid() {
        return runningmemoryid;
    }

    public void setRunningmemoryid(int runningmemoryid) {
        this.runningmemoryid = runningmemoryid;
    }

    public String getRunningname() {
        return runningname;
    }

    public void setRunningname(String runningname) {
        this.runningname = runningname;
    }

    @Override
    public String toString() {
        return "Classrunningmemory{" +
                "runningmemoryid=" + runningmemoryid +
                ", runningname='" + runningname + '\'' +
                '}';
    }
}
