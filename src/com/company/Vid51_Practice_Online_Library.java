package com.company;

import java.util.concurrent.atomic.AtomicBoolean;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        no_of_books++;
        this.books[no_of_books] = book;
        System.out.println(book + " has been added!");

    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String element: this.books){
            if(element == null){
                continue;
            }
            System.out.println("--> " + element);
        }
    }
    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(books[i] == book){
                System.out.println(book + " has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Vid51_Practice_Online_Library {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("The Alchemist");
        centralLibrary.addBook("can't hurt me");
        centralLibrary.addBook("Atomic Habits");
        centralLibrary.addBook("Attitude is Everything");

        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("can't hurt me");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("can't hurt me");
        centralLibrary.showAvailableBooks();
    }
}
