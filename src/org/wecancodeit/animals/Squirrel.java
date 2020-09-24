package org.wecancodeit.animals;

public class Squirrel extends Animal {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I run around on my legs!");
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
