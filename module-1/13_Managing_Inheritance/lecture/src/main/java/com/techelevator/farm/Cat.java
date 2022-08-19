package com.techelevator.farm;

public final class Cat extends FarmAnimal{

    public Cat(String name, String sound) {

        super(name, sound);
    }

    @Override
    public String eat() {
        return "Eating cat food...";
    }

    /*    @Override
    public String getSound() {
        return "Meow!";
    }*/
}


