package com.company;

import java.util.List;

public class Litere {
    private int nr;
    private String litera;
    private String limba;

    public Litere(int nr, String litera, String limba) {
        this.nr = nr;
        this.litera = litera;
        this.limba = limba;
    }

    public Litere(int nr) {
        this.nr = nr;
        this.litera = "Unitialized";
        this.limba = "Unitialized";
    }

    public  Litere(String litera) {
        this.nr = 0;
        this.litera = litera;
        this.limba =  "Unitialized";
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getLitera() {
        return litera;
    }

    public void setLitera(String litera) {
        this.litera = litera;
    }

    public String getLimba() {
        return limba;
    }

    public void setLimba(String limba) {
        this.limba = limba;
    }

    protected void read() {
        System.out.println("Reading litera" + getLitera());
    }

    protected StringBuilder concatenate(Litere l1, Litere l2) {
        StringBuilder temp = new StringBuilder();
        temp.append(l1.getLitera());
        temp.append(l2.getLitera());
        return temp;
    }

    protected void className() {
        System.out.println("Class - Litere");
    }


}
