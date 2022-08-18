package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<Book> books;
    private IdComparator idComparator;
    private TitleComparator titleComparator;
    private GenreComparator genreComparator;

    public Library() {
        books = new ArrayList<>();
        idComparator = new IdComparator();
        titleComparator = new TitleComparator();
        genreComparator = new GenreComparator();
    }

    public void addBook(Book book) {

        books.add(book);
        // поскольку условие задачи изменилось согласно запросу Романа, эта проверка теперь не нужна.
        // Закомментированный метод исправлен согласно запросу Димы
//
//        for (Book bookFromLibrary : books) {
//
//            if (bookFromLibrary.getId() == book.getId()) {
//                System.out.println("The books already contains the book with id " + book.getId() + ".");
//                return;
//            }
//        }
//       books.add(book);
    }

    private Book getBookById(int id) {

        Book book = null;

        for (int i = 0; i < books.size(); i++) {

            if (id == books.get(i).getId()) {
                book = books.get(i);
                break;
            }
        }
        return book;
    }

    public void deleteBookWithId(int id) {

        Book book = getBookById(id);

        if (book == null) {
            System.out.println("The book with id " + id + " is not found.");
        } else {
            books.remove(book);
        }
    }

    public void changeBook(int id, String title, String genre) {

        Book book = getBookById(id);

        if (book != null) {
            book.setTitle(title);
            book.setGenre(genre);
        } else {
            System.out.println("The book with id " + id + " is not found.");
        }
    }

    public int getLibrarySize() {
        return books.size();
    }

    public Book getBookByIndex(int i) {
        return books.get(i);
    }

    public List<Book> getSortedBooks(String sortingOrder, String sortingType) {

        if (sortingOrder == "Natural") {
            switch (sortingType) {
                case "by ID":
                    Collections.sort(books, idComparator);
                    break;
                case "by Title":
                    Collections.sort(books, titleComparator);
                    break;
                case "by Genre":
                    Collections.sort(books, genreComparator);
                    break;
            }
        } else if (sortingOrder == "Reversed") {
            switch (sortingType) {
                case "by ID":
                    Collections.sort(books, idComparator.reversed());
                    break;
                case "by Title":
                    Collections.sort(books, titleComparator.reversed());
                    break;
                case "by Genre":
                    Collections.sort(books, genreComparator.reversed());
                    break;
            }
        }
        return books;
    }

    public void printer() {

        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}
