package library;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class CreatorXMLFromLibrary {

    public static void createXML(Library library, String outputPath) {

        XMLStreamWriter writer = null;
        List<Book> booksForRecord = library.getBooks();

        try {
            XMLOutputFactory output = XMLOutputFactory.newInstance();
            writer = output.createXMLStreamWriter(new FileWriter(outputPath));

            // Открываем XML-документ и пишем корневой элемент books
            writer.writeStartDocument("1.0");
            writer.writeStartElement("books");

            // Делаем цикл для книг
            for (Book book : booksForRecord) {
                writer.writeStartElement("Book");
                // Title
                writer.writeStartElement("Title");
                writer.writeCharacters(book.getTitle());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                // Author
                writer.writeStartElement("Author");
                writer.writeCharacters(book.getAuthor());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                // Text
                writer.writeStartElement("Text");
                writer.writeCharacters(book.getText());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                // ISBN
                writer.writeStartElement("ISBN");
                writer.writeCharacters(book.getIsbn());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                // Genre
                writer.writeStartElement("Genre");
                writer.writeCharacters(book.getGenre());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                //PublishDate
                writer.writeStartElement("PublishDate");
                writer.writeCharacters(String.valueOf(book.getPublishDate()));
                writer.writeEndElement();
                writer.writeCharacters("\n");
                // Cover
                writer.writeStartElement("Cover");
                writer.writeCharacters(book.getCover());
                writer.writeEndElement();
                writer.writeCharacters("\n");
                writer.writeCharacters("\n");

                writer.writeEndElement();
            }

            writer.writeEndElement();

            writer.writeEndDocument();
            writer.flush(); // данные сливаются в xml
        } catch (XMLStreamException | IOException ex) {
            ex.printStackTrace();
        } finally {
            if (Objects.nonNull(writer)) {
                try {
                    writer.close();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

