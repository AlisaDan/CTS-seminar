package com.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect {
    private List<Observer> observers;
    private String numeSala;

    public Sala(String numeSala) {
        this.observers = new ArrayList<>();
        this.numeSala = numeSala;
    }

    @Override
    public void aboneazaClient(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Observer obs : observers) {
            obs.receptionareMesaj(numeSala + ": " + mesaj);
        }
    }

    @Override
    public void dezaboneazaClient(Observer observer) {
        observers.remove(observer);
    }

    public void anuntaMeciFotbal() {
        trimiteMesaj("Urmeaza un meci de fotbal");
    }

    public void anuntaMeciVolei() {
        trimiteMesaj("Urmeaza un meci de volei");
    }
}
