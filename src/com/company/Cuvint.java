package com.company;

public class Cuvint extends Litere {

    String cuvintul;

    public Cuvint(String litera, String limba, String cuvintul) {
        super(litera, limba);
        this.cuvintul = cuvintul;
    }

    public Cuvint(String cuvintul) {
        this.cuvintul = cuvintul;
    }

    public Cuvint(String litera, String cuvintul) {
        super(litera);
        this.cuvintul = cuvintul;
    }

    public String getCuvintul() {
        return cuvintul;
    }

    public void setCuvintul(String cuvintul) {
        this.cuvintul = cuvintul;
    }


    @Override
    protected void read() {
        super.read();
    }


    @Override
    protected void consoanaSauVocala() {
        char[] vocale = {'a', 'e', 'i', 'o', 'u', 'ă', 'î'};
        char[] cuv = cuvintul.toLowerCase().toCharArray();
        int vocCount = 0;
        int consCount = 0;
        for (int i = 0; i < cuv.length; i++) {
            for (int j = 0; j < vocale.length; j++) {
                if (cuv[i] == vocale[j]) {
                    vocCount++;
                }
            }
        }
        consCount = cuv.length - vocCount;

        System.out.println("Vocale = " + vocCount + "\nConsoane = " + consCount);
    }

    @Override
    protected void className() {
        super.className();
    }
}
