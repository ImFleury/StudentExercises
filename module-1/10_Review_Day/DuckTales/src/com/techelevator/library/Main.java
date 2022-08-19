package com.techelevator.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Library localLibrary = new Library( "Smallville Library", "OH", "Cincinnati","Walnut Hills");

        List<Book> inventory = new ArrayList<>();
        inventory.add(new Book("123","My First Book", "Me", 10.00, 1));

        List<Employee> workers = new ArrayList<>();
        workers.add(new Employee("123","Bob"));



        localLibrary.setBookInventory(inventory);
        localLibrary.setStaff(workers);

        inventory.add(new Book("456","My Second Book", "Me", 20.00, 2));

        System.out.println("Number of books" + localLibrary.getBookInventory().size());
        System.out.println("");
    }
}
