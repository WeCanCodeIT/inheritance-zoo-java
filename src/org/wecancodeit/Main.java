package org.wecancodeit;


import org.wecancodeit.animals.*;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        Animal zebra = new Zebra("Stripey");

        Animal trout = new Trout("Trouty");

        Animal otter = new Otter("Otto");
        Animal robin = new Robin("Robin");
        Animal squirrel = new Squirrel("Rocky");
        Animal chicken = new Chicken("Little");


        Collection<Animal> animals = new ArrayList<>();

        animals.add(zebra);
        animals.add(trout);
        animals.add(otter);
        animals.add(robin);
        animals.add(squirrel);
        animals.add(chicken);

        for (Animal animal : animals) {
            runAllAnimalMethods(animal);
        }

    }

    private static void runAllAnimalMethods(Animal animal) {
        System.out.println("Hello " + animal.getName());
        System.out.println("This animal is alive? " + animal.isAlive());

        animal.move();
        animal.breathe();
        animal.eat();
        animal.reproduce();
        animal.passAway();

        System.out.println("This animal is alive? " + animal.isAlive());
        System.out.println();
    }
}

