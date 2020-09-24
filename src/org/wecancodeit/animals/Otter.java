package org.wecancodeit.animals;

public class Otter extends Mammal{
    public Otter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Swims in water.");
    }


    @Override
    public void eat() {
        System.out.println("Consuming other animals.");
    }


}
