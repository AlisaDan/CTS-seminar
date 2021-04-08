package ro.ase.cts.decorator.clase;

public class ConcretDecorator extends AbstractDecorator {

    public ConcretDecorator(ICard card) {
        super(card);
    }

    @Override
    public void platesteContactLess() {
        System.out.println(super.getCard().getDetinatorCard() + " a platit contact less");
    }

}
