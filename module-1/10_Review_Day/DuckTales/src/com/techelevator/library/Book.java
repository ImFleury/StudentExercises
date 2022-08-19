package com.techelevator.library;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;
    private int quantityOnHand;

    public Book(String isbn, String title, String author, double price, int quantityOnHand) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }
}
