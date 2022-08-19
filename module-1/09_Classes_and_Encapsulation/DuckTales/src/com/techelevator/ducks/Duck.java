package com.techelevator.ducks;

<<<<<<< HEAD
=======
import java.util.Objects;

>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
public class Duck {

    private final int FEET = 2;

    private String name;
    private String color;
    private double weight;

    public int age;

    private int feet = FEET;

    public String getName(){
        return this.name;
    }
<<<<<<< HEAD
    public String getColor(){
        return this.color;
    }
    public double getWeight() {
        return this.weight;
    }
=======

    public String getColor(){
        return this.color;
    }

    public double getWeight(){
        return this.weight;
    }

      public int getFeet(){
            return this.feet;
      }
>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
    public void setName(String newName){
        this.name = newName;
    }

<<<<<<< HEAD
    public int getFEET = FEET;

    public void setWeight(double weight) {
        this.weight = weight;
    }

=======
    public void setWeight(double weight){
        this.weight = weight;
    }
>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
    public Duck(){
        this.name = "Donald";
        this.color = "White";
        this.weight = 6.5;
<<<<<<< HEAD
=======

>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
    }
    public Duck(String name, String color, double weight, int age){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void eat(){
        this.weight += 0.5;
    }

    public void swim(){
        this.weight -= 0.25;
    }

    public String makeRacket(){
        return "Quack Quack";
    }

    public String speak(){
        return "My name is " + this.name;
    }

<<<<<<< HEAD
    public String speak(String overloadedSentence){
        String oldSpeak = this.speak();
        return (oldSpeak + "" + this.name + " says " + overloadedSentence + "");
    }

=======
    public String speak(String overloadedSentece){
        String oldSpeak = this.speak();
        return (oldSpeak +  " " + this.name + " says '" + overloadedSentece + "'");
    }
>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
}
