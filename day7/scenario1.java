package day7;
/*
Scenario:
You are tasked with developing a simple Library Management System in Java. The system should allow users to add books, search for books by title, and display all books in the library. Each book has a title, author, and ISBN number.
Requirements:
Create a Book class with the following attributes:
title (String)
author (String)
isbn (String)
Create a Library class that manages a collection of books. The Library class should have the following methods:
addBook(Book book): Adds a book to the library.
searchByTitle(String title): Searches for a book by its title and returns the book if found.
displayAllBooks(): Displays all books in the library.
Create a Main class to test the functionality of the Library class.

Question:
Write the Java code to implement the above scenario. Your code should include the Book class, the Library class, and the Main class. Ensure that the Main class demonstrates adding books, searching for a book by title, and displaying all books.

*/
import java.util.ArrayList;

class lib {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<String> author = new ArrayList<>();
    static ArrayList<Integer> isbn_no = new ArrayList<>();

    void add(String n, String a, int i) {
        System.out.println("Adding the Book " + n + " with author " + a + " and ISBN number " + i);
        name.add(n);
        author.add(a);
        isbn_no.add(i);
    }

    void display() {
        for (int i = 0; i < name.size(); i++) {
            System.out.println((i + 1) + ". " + name.get(i) + "  " + author.get(i) + "  " + isbn_no.get(i));
        }
    }

    void search(String n) {
        int ind = name.indexOf(n);

        if (ind != -1) {
            System.out.println(name.get(ind) + "  " + author.get(ind) + "  " + isbn_no.get(ind));
        } else {
            System.out.println("The Book Doesn't exist");
        }
    }
}

public class scenario1 {
    public static void main(String[] args) {
        lib obj1 = new lib();

        obj1.add("Wings of Fire", "A.P.J Abdul Kalam", 101);
        obj1.add("Clean Code", "Robert C. Martin", 102);

        obj1.display();

        obj1.search("Clean Code");
        obj1.search("Unknown Book");
    }
}

