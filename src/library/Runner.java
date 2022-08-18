package library;


public class Runner {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Harry Potter", "fantasy");
        Book book2 = new Book("The Autumn of the Patriarch", "novel");
        Book book3 = new Book("Ludzi na baloce", "novel");
        Book book4 = new Book("Dune", "sci-fi");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.deleteBookWithId(1);

        for (int i = library.getLibrarySize() - 1; i >= 0; i--) {
            System.out.println(library.getBookByIndex(i));
        }

        library.changeBook(2, "The Lord of the Rings", "fantasy");

        for (int i = 0; i < library.getLibrarySize(); i++) {
            System.out.println(library.getBookByIndex(i));
        }

        System.out.println(book3.getId());

        library.getSortedBooks("Reversed", "by Title");
        library.printer();
    }
}
