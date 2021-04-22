package ro.ase.cts.state.clase;

public class Masa {
    private final int numarMasa;
    private Stare stare;

    public Masa(int numarMasa) {
        this.numarMasa = numarMasa;
        this.stare=new StareLibera();
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public Stare getStare() {
        return stare;
    }

     void setStare(Stare stare) {
        this.stare = stare;
    }

    public void rezervaMasa(){
      modificaStareMasa(new StareRezervata());
    }

    public void ocupaMasa(){
       modificaStareMasa(new StareOcupata());
    }

    public void elibereazaMasa(){
       modificaStareMasa(new StareLibera());
    }

    public void modificaStareMasa(Stare stare){
        stare.modificaStare(this);
    }
}
