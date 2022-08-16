package library;


import java.util.Objects;

public class Book implements Comparable<Book> {

    private static int counter = 0;
    private int id;
    private String title;
    private String genre;


    public Book(String title, String genre) {
        counter++;
        this.id = counter;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().toLowerCase().compareTo(o.getTitle().toLowerCase());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Objects.equals(title, book.title) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre);
    }
}
