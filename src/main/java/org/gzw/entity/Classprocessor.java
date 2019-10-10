package org.gzw.entity;

public class Classprocessor {
    private int processorid;
    private String processorname;

    public Classprocessor() {
    }

    public Classprocessor(int processorid, String processorname) {
        this.processorid = processorid;
        this.processorname = processorname;
    }

    public int getProcessorid() {
        return processorid;
    }

    public void setProcessorid(int processorid) {
        this.processorid = processorid;
    }

    public String getProcessorname() {
        return processorname;
    }

    public void setProcessorname(String processorname) {
        this.processorname = processorname;
    }

    @Override
    public String toString() {
        return "Classprocessor{" +
                "processorid=" + processorid +
                ", processorname='" + processorname + '\'' +
                '}';
    }
}
