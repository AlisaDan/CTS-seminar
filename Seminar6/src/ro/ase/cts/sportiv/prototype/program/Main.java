package ro.ase.cts.sportiv.prototype.program;

import ro.ase.cts.sportiv.prototype.clase.Bilet;
import ro.ase.cts.sportiv.prototype.clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client=new Client(1,"Alisa",22);
        Client clientCopy= (Client) client.copiaza();
        System.out.println(client);
        System.out.println(clientCopy);


        Bilet bilet=new Bilet(1,"Echipa1","Echipa2","22/10/2010");
        Bilet bilet1=(Bilet) bilet.copiaza();
        bilet1.setCod(2);
        Bilet bilet2=(Bilet)bilet.copiaza();
        bilet2.setCod(3);
        System.out.println(bilet1);
        System.out.println(bilet2);
    }
}
