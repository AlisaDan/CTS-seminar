package ro.ase.cts.state.clase;

public class StareLibera implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareLibera)) {
            System.out.println("Masa cu numarul " + masa.getNumarMasa() + " a fost eliberata");
            masa.setStare(this);
        } else {
            System.out.println("Masa este deja libera");
        }
    }
}
