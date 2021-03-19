package solutions.question845d;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Bookshelf {

  private final List<Book> books;

  public Bookshelf() {
    books = new LinkedList<>();
  }

  /** Returns the number of books on the bookshelf. */
  public int size() {
    return books.size();
  }

  /**
   * Adds a book on the left side of the shelf. Shifts all other books one position to the right.
   */
  public void addBookOnLeftSide(Book b) {
    addBook(0, b);
  }

  /** Adds a book on the right side of the shelf. */
  public void addBookOnRightSide(Book b) {
    addBook(size(), b);
  }

  /**
   * Adds a book in position i counting from the left (starting from 0), and shifts all other books
   * one position to the right.
   */
  public void addBook(int i, Book b) {
    books.add(i, b);
  }

  /**
   * Removes a book from position i, shifting all books with position greater than i to the left.
   */
  public Book remove(int i) {
    return books.remove(i);
  }

  /** Prints all details of books from left to right. */
  public void printLeftToRight() {
    for (Book b : books) {
      System.out.println(b);
    }
  }

  /** Prints all details of books from right to left. */
  public void printRightToLeft() {
    ListIterator<Book> li = books.listIterator(size());
    while (li.hasPrevious()) {
      System.out.println(li.previous());
    }
  }
}
