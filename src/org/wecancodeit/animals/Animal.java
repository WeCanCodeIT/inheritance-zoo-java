package org.wecancodeit.animals;

public abstract class Animal {


    // Things it knows

    private boolean alive = true;
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getName() {
        return name;
    }

    // Things it does

    public abstract void move();

    public void breathe(){
        System.out.println("I take in oxygen generically.");
    }

    // eat
    public void eat(){
        System.out.println("I eat to fuel generically.");
    }

    public void reproduce(){
        System.out.println("I make more copies of myself generically");
    }

    public void passAway(){
        System.out.println("I am no longer alive.");
        alive = false;
    }

}
