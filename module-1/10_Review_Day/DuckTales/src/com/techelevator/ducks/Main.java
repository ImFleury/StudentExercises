package com.techelevator.ducks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck DonaldDuck = new Duck();
        Duck firstDuck = new Duck("Scrooge McDuck", "Gold", 7.5, 89);
        Duck secondDuck = new Duck( "Huey", "Blue", 4.5, 11);
        Duck testDuck = new Duck("Scrooge McDuck", "Gold", 7.5, 89);
        String firstDuckName = firstDuck.getName();
        String secondDuckName = secondDuck.getName();

if (firstDuck.equals(testDuck)) {
    System.out.println("Ducks are equal");
} else {
    System.out.println("Ducks are not equal");
}

        System.out.println(firstDuck.toString());
        System.out.println(firstDuck.toString(true));

//        double firstDuckWeight = firstDuck.getWeight();
//        double secondDuckWeight = secondDuck.getWeight();

        DonaldDuck.age = 30;
//        int ScroogesAge = firstDuck.age;
//
//
//        secondDuck.eat();
//        secondDuck.swim();
//        System.out.println(  firstDuck.getName() + " says " + firstDuck.makeRacket());
//        System.out.println( firstDuck.getName() + " has " + firstDuck.getFeet());
//        System.out.println("");

        List<Duck> flock = new ArrayList<>();

        flock.add(new Duck());
        flock.add(new Duck("Scrooge McDuck", "Gold", 7.5, 89));
        flock.add(new Duck( "Huey", "Blue", 4.5, 11));
        flock.add(new Duck( "Dewey", "Blue", 4.5, 11));
        flock.add(new Duck( "Louie", "Blue", 4.5, 11));


        for(Duck currentDuck : flock){
           // System.out.println(currentDuck.speak());
            System.out.println(currentDuck.speak("Howdy Howdy Howdy! I'm Woody!"));
            currentDuck.eat();
            System.out.println(currentDuck.getName() + " weights " + currentDuck.getWeight());
        }


    }
}
