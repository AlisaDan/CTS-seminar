package com.ase.cts.template.main;

import com.ase.cts.template.clase.Spectator;
import com.ase.cts.template.clase.SpectatorAbstract;
import com.ase.cts.template.clase.SpectatorPeluza;

public class Main {
    public static void main(String[] args) {
        SpectatorAbstract spectator=new Spectator();
        spectator.intrareaSpectatoruluiPeStadion();

        SpectatorAbstract spectatorPeluza=new SpectatorPeluza();
        spectatorPeluza.intrareaSpectatoruluiPeStadion();
    }
}
