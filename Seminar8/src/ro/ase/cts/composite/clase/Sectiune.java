package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements OptiuniMeniu {

    private final List<OptiuniMeniu> optiuni;
    private final String numeSectiune;

    public Sectiune(String numeSectiune) {
        this.optiuni = new ArrayList<>();
        this.numeSectiune = numeSectiune;
    }

    @Override
    public void adaugaNod(OptiuniMeniu optiuniMeniu) {
        optiuni.add(optiuniMeniu);
    }

    @Override
    public void stergeNod(OptiuniMeniu optiuniMeniu) {
        optiuni.remove(optiuniMeniu);
    }

    @Override
    public OptiuniMeniu getNod(int index) {
        return optiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune " + numeSectiune);
        for(OptiuniMeniu optiuniMeniu:optiuni){
            optiuniMeniu.descriere();
        }
    }
}
