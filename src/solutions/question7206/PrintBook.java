package solutions.question7206;

import java.util.HashSet;
import java.util.Set;

public class PrintBook {

  // Output:
  // New C++ book(ISBN: 1)
  // Haskell(ISBN: 2)
  // This is because Book's equals and hashCode methods have been overridden to use ISBNs.
  // HashSet checks hashes and compares equality through these methods, so a book of the same ISBN
  // is seen as the same book, even if they have differing titles.
  // Furthermore, we see that collections hold references to objects, so we can update the title
  // of the C++ book and see the new title.
  public static void main(String[] args) {

    Set<Book> set = new HashSet<>();

    Book book = new Book(1, "C++");

    set.add(book);

    set.add(new Book(2, "Haskell"));
    set.add(new Book(1, "Java"));
    book.setTitle("New C++ book");

    for (Book b : set) {
      System.out.println(b);
    }
  }
}
