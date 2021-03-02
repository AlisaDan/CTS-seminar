package main.classes;

public class Zebra  extends Animal{
    private int numbersOfStripes;

    public Zebra(String name, float greutate, int numbersOfStripes) {
        super(name, greutate);
        this.numbersOfStripes = numbersOfStripes;
    }

    public Zebra(String name, float greutate) {
        super(name, greutate);
    }

    public int getNumbersOfStripes() {
        return numbersOfStripes;
    }

    public void setNumbersOfStripes(int numbersOfStripes) {
        this.numbersOfStripes = numbersOfStripes;
    }
}
