package com.ase.cts.command;

public class ComandaRetragere extends Comanda{
    public ComandaRetragere(ContBancar contBancar,float suma) {
        super(contBancar,suma);
    }

    @Override
    public void executa() {
        super.getContBancar().retragere(super.getSuma());
    }
}
