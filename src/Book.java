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

}
