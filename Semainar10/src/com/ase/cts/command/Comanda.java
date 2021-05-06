package com.ase.cts.command;

public abstract class Comanda {
    private final ContBancar contBancar;
    private final float suma;

    public Comanda(ContBancar contBancar,float suma) {
        this.contBancar = contBancar;
        this.suma=suma;
    }

    public ContBancar getContBancar() {
        return contBancar;
    }

    public float getSuma() {
        return suma;
    }

    public abstract void executa();
}
