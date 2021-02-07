package solutions.question67dd;

import static java.lang.Character.isLetterOrDigit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class WordCount {

  /** Counts the number of alphanumeric characters in a line. */
  private static int countChars(String line) {

    int count = 0;

    for (char c : line.toCharArray()) {
      if (isLetterOrDigit(c)) {
        count++;
      }
    }

    return count;
  }

  /** Counts the number of words in a line. */
  private static int countWords(String line) {

    int count = 0;
    boolean parsingWord = false;

    for (char c : line.toCharArray()) {
      if (isLetterOrDigit(c)) {
        if (!parsingWord) {
          count++;
        }
        parsingWord = true;
      } else {
        parsingWord = false;
      }
    }

    return count;
  }

  public static void main(String[] args) throws IOException {

    int numLines = 0;
    int numWords = 0;
    int numChars = 0;

    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String line;
    while ((line = br.readLine()) != null) {
      numLines++;
      numWords += countWords(line);
      numChars += countChars(line);
    }

    System.out.println("Lines: " + numLines);
    System.out.println("Words: " + numWords);
    System.out.println("Characters: " + numChars);
  }
}
