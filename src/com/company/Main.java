package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Abba", "Prevo");
        Book book = new Book("Manon Lesco", author, 45.12);

        System.out.println("Book: " + book.toString());
        System.out.println("Price: " + book.getPrice());
    }
}
