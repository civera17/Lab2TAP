package com.company;

public class Cuvint extends Litere{

    String cuvintul;


    public Cuvint(int nr, String litera, String limba, String cuvintul) {
        super(nr, litera, limba);
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
    protected StringBuilder concatenate(Litere l1, Litere l2) {
        return super.concatenate(l1, l2);
    }

    @Override
    protected void className() {
        super.className();
    }
}
