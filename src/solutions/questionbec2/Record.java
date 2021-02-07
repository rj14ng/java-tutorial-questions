package solutions.questionbec2;

/** Represent records that have been released by music artists. */
public class Record {

  private final String title;
  private final Genre genre;

  /** Creates a new record with a title and genre. */
  public Record(String title, Genre genre) {
    this.title = title;
    this.genre = genre;
  }

  /** Gets the genre of the record. */
  public Genre getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return title + " (" + genre + ")";
  }
}
