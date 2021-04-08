package ro.ase.cts.decorator.clase;

public abstract class AbstractDecorator implements ICard {
    private final ICard card;

    public AbstractDecorator(ICard card) {
        this.card = card;
    }

    public ICard getCard() {
        return card;
    }
    @Override
    public String getDetinatorCard() {
        return card.getDetinatorCard();
    }
    @Override
    public void platesteOnline() {
        card.platesteOnline();
    }

    @Override
    public void platesteFizic() {
        card.platesteFizic();
    }

    public abstract void platesteContactLess();
}
