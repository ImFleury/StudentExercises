package com.techelevator.farm;

public class Hamburglar  implements Singable{

    private String name;
    private String sound;

    public Hamburglar(){
        this.name = "Hamburglar";
        this.sound = "Rabble rabble!";
    }

    public String getName() {
        return this.name;
    }


    public String getSound() {
        return this.sound;
    }
}
