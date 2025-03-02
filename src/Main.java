import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ivan", "Ivanov");
        Book book = new Book("BookX", author, 1990);
        System.out.println(book);

        System.out.println("==========================");

        Author author2 = new Author("Petr", "Petrov");
        Book book2 = new Book("BookY", author2, 1991);

        System.out.println(book2);
        System.out.println("==========================");
        System.out.println(book.equals(book2));
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
    }
}
























