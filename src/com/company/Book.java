package com.company;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 && price <= 1000) {
            this.price = price;
        } else {
            System.out.println("Prise is invalid:");
        }
    }

    @Override
    public String toString() {
        String aBook = "'" + this.title + "'" + " " + this.author;
        return aBook;
    }
}
