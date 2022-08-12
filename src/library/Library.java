package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void addBook(Book book) {

        boolean isBookInLibrary = false;

        for (Book bookFromLibrary : library) {

            if (bookFromLibrary.getId() == book.getId()) {
                isBookInLibrary = true;
                break;
            }
        }

        if (isBookInLibrary) {
            System.out.println("The library already contains the book with id " + book.getId() + ".");
        } else {
            library.add(book); // add - метод ArrayList
        }
    }

    public List<Book> getLibrary() { // получить список всех книг
        return library;
    }

    private Book getBookById(int id) {

        Book book = null;

        for (int i = 0; i < library.size(); i++) {

            if (id == library.get(i).getId()) {
                book = library.get(i);
                break;
            }
        }
        return book;
    }

    public void deleteBookWithId(int id) {

        if (getBookById(id) == null) {
            System.out.println("The book with id " + id + " is not found.");
        } else {
            int index = library.indexOf(getBookById(id));
            library.remove(index);
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

    public void reversePrinter() {

        for (int i = library.size() - 1; i >= 0; i--) {
            System.out.println(library.get(i));
        }
    }

    public void printer() {
        for (Book book : library) {
            System.out.println(book);
        }
    }
}
