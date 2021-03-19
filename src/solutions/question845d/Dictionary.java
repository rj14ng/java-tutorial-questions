package solutions.question845d;

public class Dictionary extends Book {

  private final String sourceLanguage;
  private final String targetLanguage;
  private final int numDefinitions;

  public Dictionary(
      String isbn,
      String title,
      int pages,
      String sourceLanguage,
      String targetLanguage,
      int numDefinitions) {
    super(isbn, title, pages);
    this.sourceLanguage = sourceLanguage;
    this.targetLanguage = targetLanguage;
    this.numDefinitions = numDefinitions;
  }

  @Override
  public String toString() {
    return super.toString()
        + "("
        + sourceLanguage
        + "-"
        + targetLanguage
        + " dictionary, "
        + numDefinitions
        + " definitions";
  }
}
