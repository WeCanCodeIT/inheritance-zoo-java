package org.wecancodeit.animals;

public class Squirrel extends Mammal {

    public Squirrel(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I run around on my legs!");
    }


    @Override
    public void eat() {
        System.out.println("Eat plants to get energy");
    }


}
