package com.ase.cts.chain.clase;

public abstract class Cont {
    private final float sold;
    private final String numeClient;
    private Cont succesor;

    public Cont(float sold, String numeClient, Cont succesor) {
        this.sold = sold;
        this.numeClient = numeClient;
        this.succesor = succesor;
    }

    public void setSuccesor(Cont succesor) {
        this.succesor = succesor;
    }

    public float getSold() {
        return sold;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public Cont getSuccesor() {
        return succesor;
    }

    public abstract void plateste(float suma);

}
