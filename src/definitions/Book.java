/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;


import java.util.Objects;

public class Book {
    //fields
    private String bookName;
    private String authorName;
    private String isbnNumberOfTheBook;

    //constructor
    public Book() {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    //getter
    public void setBookName(String bookName) {

        this.bookName = bookName;
    }

    public String getBookName() {

        return bookName;
    }

    //setter
    public void setAuthorName(String authorName) {

        this.authorName = authorName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public void setISBNNumberOfTheBook(String isbnNumberOfTheBook) {

        this.isbnNumberOfTheBook = isbnNumberOfTheBook;
    }

    public String getISBNNumberOfTheBook() {
        return isbnNumberOfTheBook;

    }


//toString()

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ISBNNumberOfTheBook='" + isbnNumberOfTheBook + '\'' +
                '}';
    }

    //hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(isbnNumberOfTheBook, book.isbnNumberOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), isbnNumberOfTheBook);
    }
}
