package main.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;
    private Zookeeper zookeeper;

    public Zoo(List<Animal> animals, Zookeeper zookeeper) {
        this.animals = animals;
        this.zookeeper = zookeeper;
    }

    public Zoo() {
        animals=new ArrayList<Animal>();
        zookeeper =new Zookeeper("Gigi");
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    public void feedAllAnimals() {
        for (Animal animal : animals) {
            zookeeper.feed(animal);
        }
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
