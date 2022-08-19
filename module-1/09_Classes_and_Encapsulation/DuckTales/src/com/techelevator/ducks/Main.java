package com.techelevator.ducks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
<<<<<<< HEAD
    // write your code here
        Duck donaldDuck = new Duck();
        Duck firstDuck = new Duck("Scrooge McDuck", "Gold", 7.5, 89);
        Duck secondDuck = new Duck("Huey", "Blue", 4.5, 11);
        String firstDuckName = firstDuck.getName();
        String secondDuckName = secondDuck.getName();



 /*      if (firstDuck.getName().equals(secondDuck.getName()) && firstDuck.getColor().equals(secondDuck.getColor(){
            System.out.println();
        }*/
 /*       double firstDuckWeight = firstDuck.getWeight();
        double secondDuckWeight = secondDuck.getWeight();*/

        donaldDuck.age = 30;
 /*       int scroogesAge = firstDuck.age;

        secondDuck.eat();
        secondDuck.swim();
        System.out.println( firstDuck.getName() + " says " + firstDuck.makeRacket());
        System.out.println( firstDuck.getName() + " has " + firstDuck.getFEET());
        System.out.println("");*/
=======
	// write your code here
        Duck DonaldDuck = new Duck();
        Duck firstDuck = new Duck("Scrooge McDuck", "Gold", 7.5, 89);
        Duck secondDuck = new Duck( "Huey", "Blue", 4.5, 11);
//        String firstDuckName = firstDuck.getName();
//        String secondDuckName = secondDuck.getName();
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
>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9

        List<Duck> flock = new ArrayList<>();

        flock.add(new Duck());
        flock.add(new Duck("Scrooge McDuck", "Gold", 7.5, 89));
<<<<<<< HEAD
        flock.add(new Duck("Huey", "Blue", 4.5, 11));
        flock.add(new Duck("Dewey", "Blue", 4.5, 11));
        flock.add(new Duck("Louie", "Blue", 4.5, 11));

        for(Duck currentDuck : flock){
            System.out.println(currentDuck.speak());
            System.out.println( currentDuck.speak (" Howdy Howdy Howdy! I'm Woody!"));
            currentDuck.eat();
            System.out.println(currentDuck.getName() + " weighs " + currentDuck.getWeight());
        }



=======
        flock.add(new Duck( "Huey", "Blue", 4.5, 11));
        flock.add(new Duck( "Dewey", "Blue", 4.5, 11));
        flock.add(new Duck( "Louie", "Blue", 4.5, 11));


        for(Duck currentDuck : flock){
           // System.out.println(currentDuck.speak());
            System.out.println(currentDuck.speak("Howdy Howdy Howdy! I'm Woody!"));
            currentDuck.eat();
            System.out.println(currentDuck.getName() + " weights " + currentDuck.getWeight());
        }
>>>>>>> 5849b09d92c24d27d4cb23d363b48efa440247b9
    }
}
