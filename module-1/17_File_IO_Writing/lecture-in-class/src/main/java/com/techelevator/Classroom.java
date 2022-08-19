package com.techelevator;

import java.io.*;

public class Classroom {

    public static void main(String[] args) {

        //System.out.println("Appreciate\tElevate\nParticipate");

//        File ourNewDirectory =  createDirectory("myDirectory");
//        createFile("myDataFile.txt");
//        File ourNewFile = createFileInDirectory("myDirectory", "myDataFile.txt");
//
//
//        File ourChildDirectory =  createDirectory("myDirectory/childDirectory");
//        printFileType(ourChildDirectory);
//        File ourGrandChildDirectory =  createDirectory("myDirectory/childDirectory/grandChildDirectory");
//        File ourGrandChildFile = createFileInDirectory(ourGrandChildDirectory.getPath(), "myDataFile2.txt");
//        printFileType(ourGrandChildDirectory);
//        printFileType(ourGrandChildFile);
//
//        System.out.println("------------");
//        printFileType(ourNewFile);
//        printFileType(ourNewDirectory);
//
//
//        System.out.println("------------");
//        System.out.println(ourNewFile.getName());
//        System.out.println(ourNewFile.getAbsoluteFile());
//        System.out.println(ourNewFile.getAbsolutePath());
//
//        System.out.println(ourNewFile.getPath() );
//


        //-- print to file --
        printToFile();
        File newFile = new File("myPrintToDataFile.txt");
        printToFileTryWithResources(newFile,  "Java Blue overwrites the world!");

        File newFile2 = new File("myPrintToDataFile2.txt");
        appendToFile(newFile2, "\nAppreciate\nElevate\nParticipate\n");
        appendToFile(newFile2, "\nAppreciate\nElevate\nParticipate\n");
        appendToFile(newFile2, "\nAppreciate\nElevate\nParticipate\n");
        appendToFile(newFile2, "\nAppreciate\nElevate\nParticipate\n");
    }

    public static void appendToFile(File newFile, String message){
        boolean append = newFile.exists() ? true : false;
        try (PrintWriter writer =
                     new PrintWriter(new FileOutputStream(newFile, append))) {
            writer.append(message);
        } catch(IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
    public static void printToFileTryWithResources(File newFile, String message){
        try (PrintWriter writer = new PrintWriter(newFile.getAbsoluteFile())) {
            writer.print(message);
        } catch(FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }


    public static void printToFile(){
        File newFile = new File("myPrintToDataFile.txt");
        String message = "Appreciate\nElevate\nParticipate";

        try {
            PrintWriter writer = new PrintWriter(newFile);
            writer.print(message);
            writer.flush();
            writer.close();
        } catch(FileNotFoundException e) {
            System.out.println("File does not exist.");
        }

    }
    public static void printFileType(File someFileOrDirectory){
        if (someFileOrDirectory.isDirectory()){
            System.out.println(someFileOrDirectory + " is a directory");
        } else if (someFileOrDirectory.isFile()){
            System.out.println(someFileOrDirectory + " is a file.");
        } else {
            System.out.println("something's wrong. Ending program");
            return;
        }
    }

    public static File createFileInDirectory(String directoryName, String fileName) {
        File newFile = null;
        try {
            newFile = new File(directoryName, fileName);
            if (!newFile.exists()) {
                newFile.createNewFile();
            }

            return newFile;
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return newFile;
    }

    public static void createFile(String fileName){
        try {
            File newFile = new File(fileName);
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
        } catch(IOException e) {
            System.out.println("Exception occurred: "
                    + e.getMessage());
        }
    }

    public static File createDirectory(String directoryName){
        File newDirectory = new File(directoryName);

        if (newDirectory.exists()) {
            System.out.println("Sorry, "
                    + newDirectory + " already exists.");
        }
        else {
            newDirectory.mkdir();
            System.out.println("Directory created.");
        }

        return newDirectory;
    }
}
