import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ivan", "Ivanov");
        Book book = new Book("BookX", author, 1990);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());
        book.setYearOfPublication(1992);
        System.out.println("book.getYearOfPublication() = " + book.getYearOfPublication());

        System.out.println("==========================");

        Author author2 = new Author("Petr", "Petrov");
        Book book2 = new Book("BookY", author2, 1991);
        System.out.println("book2.getNameBook() = " + book2.getNameBook());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getYearOfPublication() = " + book2.getYearOfPublication());
    }
}
























