package com.techelevator.library;

import java.util.List;

public class Library {
    private String libraryName;
    private String stateCode;
    private String city;
    private String branch;

    private List<Book> BookInventory;
    private List<Employee>  staff;

    public Library(String libraryName, String stateCode, String city, String branch) {
        this.libraryName = libraryName;
        this.stateCode = stateCode;
        this.city = city;
        this.branch = branch;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public String getCity() {
        return city;
    }

    public String getBranch() {
        return branch;
    }

    public List<Book> getBookInventory() {
        return BookInventory;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setBookInventory(List<Book> bookInventory) {
        BookInventory = bookInventory;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }
}
