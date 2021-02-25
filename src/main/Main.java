package main;

import main.classes.Zoo;
import main.classes.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Zookeeper zookeeper=new Zookeeper("Gigel");
        Zoo zoo= new Zoo();
        zoo.setZookeeper(zookeeper);
    }
}
