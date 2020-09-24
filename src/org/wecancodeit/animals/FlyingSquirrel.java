package org.wecancodeit.animals;

public class FlyingSquirrel extends Squirrel implements Flying{
    public FlyingSquirrel(String name) {
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("Glides with flaps of skin and fur.");
    }
}

