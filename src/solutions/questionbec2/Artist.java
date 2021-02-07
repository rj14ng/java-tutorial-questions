package solutions.questionbec2;

import java.util.ArrayList;
import java.util.List;

/** Represents a music artist. */
public class Artist {

  private final String name;
  private final Genre mainGenre;
  private final List<Record> catalogue;

  /** Creates a new artist with a name and main genre. */
  public Artist(String name, Genre mainGenre) {
    this.name = name;
    this.mainGenre = mainGenre;
    this.catalogue = new ArrayList<>();
  }

  /**
   * Adds a record of the given name to the artist's catalogue. Uses the artist's main genre as the
   * record's genre.
   */
  public void addRecord(String name) {
    catalogue.add(new Record(name, mainGenre));
  }

  /** Adds a record of the given name and genre to the artist's catalogue. */
  public void addRecord(String name, Genre genre) {
    catalogue.add(new Record(name, genre));
  }

  /** Displays the artist's catalogue. */
  public void showCatalogue() {
    for (Record record : catalogue) {
      System.out.println(record);
    }
  }

  /** Displays the subset of the artist's catalogue that falls into the given genre. */
  public void showGenre(Genre genre) {
    for (Record record : catalogue) {
      if (record.getGenre() == genre) {
        System.out.println(record);
      }
    }
  }
}
