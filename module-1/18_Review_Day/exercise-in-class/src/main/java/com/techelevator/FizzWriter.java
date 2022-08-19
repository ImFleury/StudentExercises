package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

    public static void main(String[] args) throws FileNotFoundException {

        File destinationFile;

        //TODO prompt user for destination file

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("What is the destination file (path from project root):");
            String path = userInput.nextLine();
            destinationFile = new File(path);

            if (path == null || path.isEmpty()) {
                System.out.println("Destination file is empty");
                System.exit(0);
            }
            if (!destinationFile.getName().endsWith(".txt")) {
                System.out.println("Destination file must end with .txt");
                System.exit(0);
            }
//
//            if (!destinationFile.exists()) {
//                System.out.println("Destination file does not exists.");
//                System.exit(0);
//            }
        }

        try (PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile())) {

            for (int i = 1; i <= 300; i++) {

                if ((i % 3 == 0) && (i % 5 == 0)) {
                    destinationWriter.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    destinationWriter.println("Buzz");
                } else if (i % 3 == 0) {
                    destinationWriter.println("Fizz");
                } else {
                    destinationWriter.println(i);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());


        }


    }

}
