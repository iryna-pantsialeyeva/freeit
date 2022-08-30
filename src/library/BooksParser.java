package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class BooksParser {

    public static List<Book> getBooksFromXML(String filePath) {
        XMLStreamReader reader = null; // интерфейс для перемещения и чтения XML файлов
        List<Book> booksFromXml = new ArrayList<>(); // место для сохранения книг
        Book book = null;
        String startElementName = null;

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            xmlInputFactory.setProperty(XMLInputFactory.IS_COALESCING, true); // IS_COALESCING - по умолчанию false, если true - склеивает куски текста characters
            reader = xmlInputFactory.createXMLStreamReader(new FileInputStream(filePath)); // объект XMLStreamReader для чтения XML файла

            while (reader.hasNext()) {
                reader.next();

                if (reader.isStartElement()) {
                    if (reader.getLocalName().equals("Book")) {
                        book = new Book();
                    } else {
                        startElementName = reader.getLocalName();
                    }
                } else if (reader.isCharacters() && reader.getText().trim().length() > 0) {
                    String text = reader.getText();

                    if (!text.isEmpty()) {
                        if (startElementName.equals("Title")) {
                            book.setTitle(text);
                        } else if (startElementName.equals("Author")) {
                            book.setAuthor(text);
                        } else if (startElementName.equals("Text")) {
                            book.setText(text);
                        } else if (startElementName.equals("ISBN")) {
                            book.setIsbn(text);
                        } else if (startElementName.equals("Genre")) {
                            book.setGenre(text);
                        } else if (startElementName.equals("PublishDate")) {
                            book.setPublishDate(Integer.parseInt(text));
                        } else if (startElementName.equals("Cover")) {
                            book.setCover(text);
                        }
                    }
                } else if (reader.isEndElement()) {
                    if (reader.getLocalName().equals("Book")) {
                        booksFromXml.add(book);
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        } finally {
            if (Objects.nonNull(reader)) {
                try {
                    reader.close();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
            }
        }
        return booksFromXml;
    }
}
