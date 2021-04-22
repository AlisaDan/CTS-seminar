package ro.ase.cts.state.clase;

public class StareOcupata implements Stare {

    @Override
    public void modificaStare(Masa masa) {
        if (!(masa.getStare() instanceof StareOcupata)) {
            System.out.println("Masa cu numarul " + masa.getNumarMasa() + " poate fi ocupata");
            masa.setStare(this);

        } else {
            System.out.println("Masa este deja ocupata");
        }
    }
}
