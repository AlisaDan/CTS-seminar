package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari implements FlyweightAbstract{
    private final Map<String,FlyweightAbstract> clienti;

    public FabricaRezervari() {
        this.clienti = new HashMap<>();
    }

    public FlyweightAbstract getClient(String email){
        FlyweightAbstract client =clienti.get(email);
        if(client==null){
            client=new Client("Alisa","0733143221", email);
            clienti.put(email,client);
        }
        return client;
    }
    @Override
    public void afisareInformatii(Rezervare rezervare) {

    }
}
