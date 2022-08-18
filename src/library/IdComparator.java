package library;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {

    public int compare(Book b1, Book b2) {
        return b1.getId() - b2.getId();
    }

    @Override
    public Comparator<Book> reversed() {
        return Comparator.super.reversed();
    }
}
