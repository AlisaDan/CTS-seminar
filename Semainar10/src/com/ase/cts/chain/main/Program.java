package com.ase.cts.chain.main;

import com.ase.cts.chain.clase.*;

public class Program {
    public static void main(String[] args) {
        Cont contCredit=new ContCredit(3500,"Alisa",null);
        Cont contCurent=new ContCurent(1500,"Alisa",null);
        Cont contEconomii=new ContEconomii(2500,"Alisa",null);
        Cont contIndisponibil=new ContIndisponibil("Alisa");

        contCurent.setSuccesor(contEconomii);
        contCurent.plateste(200);
        contEconomii.setSuccesor(contCredit);
        contEconomii.plateste(200);
        contCredit.setSuccesor(contIndisponibil);
        contCredit.plateste(3600);
    }
}
