package com.company;

import java.util.List;

public class Litere {
    private String litera;
    private String limba;

    public Litere(String litera, String limba) {
        this.litera = litera;
        this.limba = limba;
    }

    public Litere() {
        this.litera = "Unitialized";
        this.limba = "Unitialized";
    }

    public  Litere(String litera) {
        this.litera = litera;
        this.limba =  "Unitialized";
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

    protected void consoanaSauVocala() {
        String[] vocale = {"a", "e", "i", "o", "u", "ă", "î"};
        for (String l: vocale) {
            if (litera.equals(l)){
                System.out.println("Este vocala");
            } else {
                System.out.println("Este consoana");
            }
        }
    }

    protected void className() {
        System.out.println("Class - Litere");
    }
}
