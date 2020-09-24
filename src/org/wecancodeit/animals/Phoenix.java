package org.wecancodeit.animals;

public class Phoenix extends Bird implements Flying{
    public Phoenix(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flies with wings.");
    }

    @Override
    public void passAway(){
        System.out.println("Burst into flames and is reborn.");
    }
}
