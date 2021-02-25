package main.classes;

public class Zookeeper {
    private  String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(Animal a) {
        System.out.println("Animalul "+a.getName()+" a fost hranit!");
    }
}
