package org.wecancodeit.animals;

public class Robin extends Bird implements Flying {
    public Robin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("takes off on it's wings!");
    }
}
