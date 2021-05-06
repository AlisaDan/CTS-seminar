package com.ase.cts.command.main;

import com.ase.cts.command.*;

public class Program {

    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        managerComenzi.invoca(new ComandaConstituire(new ContBancar("Alisa"),500));
        managerComenzi.invoca(new ComandaRetragere(new ContBancar("Oana"),200));
        managerComenzi.executaComanda();

        managerComenzi.invoca(new ComandaDepunere(new ContBancar("Cosmina"),100));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
    }
}
