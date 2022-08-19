package com.techelevator;

import java.util.Scanner;

public class InputReader {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter you name: ");
        String name = userInput.nextLine();

        System.out.print("Please enter your height in meters: ");
        String heightInput = userInput.nextLine();
        double height = Double.parseDouble(heightInput);


        System.out.println("Your name is " + name + ".");
        System.out.println("Your height is " + height + " meters");
    }
}
