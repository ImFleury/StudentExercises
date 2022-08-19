package com.techelevator.ducks;

import java.util.Objects;

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

    public String getColor(){
        return this.color;
    }

    public double getWeight(){
        return this.weight;
    }

      public int getFeet(){
            return this.feet;
      }
    public void setName(String newName){
        this.name = newName;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public Duck(){
        this.name = "Donald";
        this.color = "White";
        this.weight = 6.5;

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

    public String speak(String overloadedSentece){
        String oldSpeak = this.speak();
        return (oldSpeak +  " " + this.name + " says '" + overloadedSentece + "'");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Double.compare(duck.weight, weight) == 0 && age == duck.age && feet == duck.feet && name.equals(duck.name) && color.equals(duck.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight, age, feet);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", feet=" + feet +
                '}';
    }


    public String toString(boolean printPretty) {
        return name + "{" +
                ", color:'" + color + '\'' +
                ", weight:" + weight +
                ", age:" + age +
                '}';
    }
}
