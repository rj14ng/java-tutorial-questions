package solutions.question845d;

public class Demo {

  private static void moveDictionariesToRight(Bookshelf bookshelf) {
    final int size = bookshelf.size();

    int i = 0;
    for (int j = 0; j < size; j++) {
      Book book = bookshelf.remove(i);
      if (book instanceof Dictionary) {
        bookshelf.addBookOnRightSide(book);
      } else {
        bookshelf.addBook(i, book);
        i++;
      }
    }
  }

  public static void main(String[] args) {

    Bookshelf bookshelf = new Bookshelf();

    bookshelf.addBookOnLeftSide(new Book("978-0340960196", "Dune", 592));
    bookshelf.addBookOnLeftSide(new Book("978-1906427023", "The Mysterious Benedict Society", 480));
    bookshelf.addBookOnRightSide(new Book("978-1509866670", "Recursion", 432));
    bookshelf.addBookOnLeftSide(
        new Book("978-0345391803", "The Hitchhiker's Guide to the Galaxy", 216));
    bookshelf.addBookOnLeftSide(
        new Dictionary(
            "978-0007484355",
            "Collins French Dictionary & Grammar",
            1152,
            "French",
            "English",
            120000));
    bookshelf.addBookOnRightSide(
        new Dictionary(
            "978-0198607489", "Kenkyusha Japanese Dictionary", 1040, "Japanese", "English", 45000));

    System.out.println("Bookshelf (left-to-right):");
    bookshelf.printLeftToRight();
    System.out.println();
    System.out.println("Bookshelf (right-to-left):");
    bookshelf.printRightToLeft();
    System.out.println();

    moveDictionariesToRight(bookshelf);

    System.out.println("Bookshelf after moving dictionaries (left-to-right):");
    bookshelf.printLeftToRight();
    System.out.println();
    System.out.println("Bookshelf after moving dictionaries (right-to-left):");
    bookshelf.printRightToLeft();
  }
}
