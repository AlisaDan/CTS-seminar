package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.AbstractDecorator;
import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.ConcretDecorator;
import ro.ase.cts.decorator.clase.ICard;

public class Program {
    public static void main(String[] args) {

        ICard card = new Card("Ionel");

        AbstractDecorator abstractDecorator = new ConcretDecorator(card);

        abstractDecorator.platesteFizic();
        abstractDecorator.platesteOnline();
        abstractDecorator.platesteContactLess();
    }
}
