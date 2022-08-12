package library;

import java.util.Collections;

public class Runner {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(1, "Harry Potter", "fantasy");
        Book book2 = new Book(2, "The Autumn of the Patriarch", "novel");
        Book book3 = new Book(3, "Ludzi na baloce", "novel");
        Book book4 = new Book(3, "Dune", "sci-fi");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Collections.sort(library.getLibrary());

        library.deleteBookWithId(1);

        library.reversePrinter();

        library.changeBook(2, "The Lord of the Rings", "fantasy");

        library.printer();
    }
}
