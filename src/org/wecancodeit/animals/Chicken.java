package org.wecancodeit.animals;

public class Chicken extends Animal{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("I run on two legs.");
    }


    @Override
    public void breathe() {
        System.out.println("Breath air into lungs");
    }

    @Override
    public void eat() {
        System.out.println("Eat plants and animals to get energy");
    }

    @Override
    public void reproduce() {
        System.out.println("Lay eggs to reproduce.");
    }
}
