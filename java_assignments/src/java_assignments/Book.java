package java_assignments;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String isbn;

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user to enter the title, author, and ISBN
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Create a Book object using the parameterized constructor
        Book book = new Book(title, author, isbn);

        // Print the book's details
        System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
    }
}

