package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
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

    public List<Book> getBooks() {
        return books;
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
}
