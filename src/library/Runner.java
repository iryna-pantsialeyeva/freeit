package library;

import java.util.List;

public class Runner {

    private static final String XML_PATH = "src/library/books.xml";
    private static final String XSD_PATH = "src/library/books.xsd";
    private static final String LIBRARY_RESERVE_COPY_PATH = "src/library/library.xml";

    public static void main(String[] args) throws ValidationException {

        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling", "Harry Potter is a series of seven " +
                "fantasy novels written by British author J. K. Rowling. The novels chronicle the lives of a young " +
                "wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley, all of whom are students at " +
                "Hogwarts School of Witchcraft and Wizardry. The main story arc concerns Harry's struggle against Lord " +
                "Voldemort, a dark wizard who intends to become immortal, overthrow the wizard governing body known as" +
                " the Ministry of Magic and subjugate all wizards and Muggles (non-magical people).",
                "1-86392-416-0", "fantasy novel", 1997, "hard");

        library.addBook(book1);

        try  {
            XMLValidator.isXmlValid(XSD_PATH, XML_PATH);
            List<Book> xmlBookList = BooksParser.getBooksFromXML(XML_PATH);
            library.addBooksFromList(xmlBookList);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            System.out.println("Library was not updated.");
        }

        library.printer();

        CreatorXMLFromLibrary.createXML(library,LIBRARY_RESERVE_COPY_PATH);
    }
}
