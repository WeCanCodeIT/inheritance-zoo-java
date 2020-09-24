package org.wecancodeit.animals;

public class Otter extends Animal{
    public Otter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Swims in water.");
    }

    @Override
    public void breathe() {
        System.out.println("Breath air into lungs");
    }

    @Override
    public void eat() {
        System.out.println("Consuming other animals.");
    }

    @Override
    public void reproduce() {
        System.out.println("Has babies.");
    }
}
