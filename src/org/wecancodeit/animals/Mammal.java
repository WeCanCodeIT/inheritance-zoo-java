package org.wecancodeit.animals;

public abstract class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public abstract void move();

    @Override
    public void breathe() {
        System.out.println("Breath oxygen through their lungs");
    }

    @Override
    public void reproduce() {
        System.out.println("Has babies.");
    }

}
