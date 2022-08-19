package com.techelevator;

import java.io.*;
import java.util.Scanner;

public class Lecture {

    public static void main(String[] args) throws IOException {

        // Scanner userInput = new Scanner(System.in);

        /*
         * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
         * modify file system objects.
         *
         * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
         *
         * A new instance of File can be created from a String that contains a file system path
         */


        File inputFile = new File("src/main/resources/alices_adventures_in_wonderland.txt");
        File destinationFile = new File("src/main/resources/destinationFile.txt");
        if (destinationFile.exists()){
            //delete existing file
            destinationFile.delete();
        }
        try {
            readWriteToFile(inputFile, destinationFile);
        } catch (FileNotFoundException ex){
            System.out.println("file not found");
        }


    }


    public static void readWriteToFile(File inputFile, File destinationFile) throws FileNotFoundException {
         try (Scanner fileScanner = new Scanner(inputFile)) {
             String previousLine = null;
             while (fileScanner.hasNextLine()) {

                 String currentLine = fileScanner.nextLine();
                 if (
                         !(  currentLine.trim().equals("")
                                 && currentLine.trim().equals(previousLine) )
                 ) {
                     //currentLine = currentLine.replace("e", "oooo");
                     appendToFile(destinationFile, currentLine + "\n");
                 }

                 previousLine = currentLine.trim();
             }
         }
     }

    private static void appendToFile(File newFile, String message) {
        boolean append = newFile.exists() ? true : false;
        try (PrintWriter writer =
                     new PrintWriter(new FileOutputStream(newFile, append))) {
            writer.append(message);
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
