package com.ase.cts.observer.main;

import com.ase.cts.observer.clase.ClientAbonat;
import com.ase.cts.observer.clase.Observer;
import com.ase.cts.observer.clase.Sala;


public class Main {
    public static void main(String[] args) {
        Observer clientPopescu=new ClientAbonat("Popescu");
        Observer clientIonescu=new ClientAbonat("Ionescu");
        Observer clientGeorgescu=new ClientAbonat("Georgescu");

        Sala sala = new Sala("Sala sportiva");
        sala.aboneazaClient(clientIonescu);
        sala.aboneazaClient(clientGeorgescu);
        sala.aboneazaClient(clientPopescu);
        sala.anuntaMeciFotbal();
        sala.anuntaMeciVolei();

    }
}
