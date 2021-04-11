package solutions.question1aeb;

public interface NumberParser<T extends Number> {

  /** Converts String s into a Number of type T. */
  T parseNumber(String s);

  /** Returns the name of the type to which T corresponds. */
  String typeParsed();
}
