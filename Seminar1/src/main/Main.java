package main;

import main.classes.Giraffe;
import main.classes.Zebra;
import main.classes.Zoo;
import main.classes.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper("Gigel");
        Zoo zoo= new Zoo();
        zoo.setZookeeper(zookeeper);
        Giraffe giraffe=new Giraffe("Girafa",20);
        Giraffe giraffe1=new Giraffe("Girafa",20,200);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(giraffe1);
        zoo.feedAllAnimals();
        Zebra zebra= new Zebra("Zebra", 10);
        Zebra zebra1=new Zebra("Zebra",15,30);
        zoo.addAnimal(zebra);
        zoo.addAnimal(zebra1);
        zoo.feedAllAnimals();
    }
}
