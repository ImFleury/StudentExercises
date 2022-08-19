package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter search word:");
        String searchWord = userInput.nextLine();

        System.out.println("Please enter replacement word:");
        String replacementWord = userInput.nextLine();

        System.out.println("What is the source file?");
        String sourceFolder = userInput.nextLine();

        System.out.println("What is the destination file?");
        String destinationFolder = userInput.nextLine();

        File sourceFile = new File(sourceFolder);
        File destinationFile = new File(destinationFolder);

        try {

            Scanner sourceFileScanner = new Scanner(sourceFile);

            PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile());

            while (sourceFileScanner.hasNextLine()){

                String lineOfOutput = sourceFileScanner.nextLine();
                String replacedString = lineOfOutput.replaceAll(searchWord, replacementWord);
                destinationWriter.println(replacedString);

            }

            destinationWriter.close();

        }

        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
