package org.wecancodeit.animals;

public class Zebra extends Animal {


    public Zebra(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Gallops into the sun.");
    }

    @Override
    public void breathe() {
        System.out.println("Breath air into lungs");
    }

    @Override
    public void eat() {
        System.out.println("Eat plants to get energy");
    }

    @Override
    public void reproduce() {
        System.out.println("Has babies.");
    }
}
