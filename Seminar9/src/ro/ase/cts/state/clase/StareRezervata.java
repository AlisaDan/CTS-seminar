package ro.ase.cts.state.clase;

public class StareRezervata implements Stare {

    @Override
    public void modificaStare(Masa masa) {
        if (masa.getStare() instanceof StareLibera) {
            System.out.println("Ati rezervat masa cu numarul " + masa.getNumarMasa());
            masa.setStare(this);

        } else {
            System.out.println("Masa nu este disponibila");
        }
    }
}
