package com.ase.cts.command;

public class ComandaDepunere extends Comanda{
    public ComandaDepunere(ContBancar contBancar,float suma) {
        super(contBancar,suma);
    }

    @Override
    public void executa() {
        super.getContBancar().depundere(super.getSuma());
    }
}
