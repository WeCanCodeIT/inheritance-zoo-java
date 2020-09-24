package org.wecancodeit.animals;

public class Trout extends Animal{
    public Trout(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Swims in water.");
    }

    @Override
    public void breathe() {
        System.out.println("Breath through their gills.");
    }

    @Override
    public void eat() {
        System.out.println("Consuming other animals.");
    }

    @Override
    public void reproduce() {
        System.out.println("Lay eggs to reproduce.");
    }
}
