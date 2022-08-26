package library;

import java.util.Comparator;

public class GenreComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2) {
        return b1.getGenre().compareToIgnoreCase(b2.getGenre());
    }

    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }
}
