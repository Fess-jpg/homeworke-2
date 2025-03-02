import java.util.Objects;

public class Book {
    private Author author;
    private String nameBook;
    private int yearOfPublication;

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return " Название книги " + nameBook + ", автор " + author + ",  год публикации " + yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook, yearOfPublication);
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return nameBook.equals(otherBook.nameBook) && author.equals(otherBook.author) &&
                yearOfPublication == otherBook.yearOfPublication;
    }
}
