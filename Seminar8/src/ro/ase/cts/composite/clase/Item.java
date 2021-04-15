package ro.ase.cts.composite.clase;

public class Item implements OptiuniMeniu {

    private final String numeIntem;

    public Item(String numeIntem) {
        this.numeIntem = numeIntem;
    }

    @Override
    public void adaugaNod(OptiuniMeniu optiuniMeniu) throws Exception {
    throw new Exception("Exceptie");
    }

    @Override
    public void stergeNod(OptiuniMeniu optiuniMeniu) {
throw new IllegalArgumentException("Exceptie");
    }

    @Override
    public OptiuniMeniu getNod(int index) {
       throw new IllegalArgumentException("Exceptie");
    }

    @Override
    public void descriere() {
        System.out.println("Item "+ numeIntem);
    }
}
