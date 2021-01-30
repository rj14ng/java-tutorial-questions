package solutions.questionf7c3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PigLatin {

  public static final String WITH_DELIMITER = "((?<=%1$s)|(?=%1$s))";

  /** Splits a line into separate words and punctuation. */
  private static String[] splitLine(String line) {
    return line.split(String.format(WITH_DELIMITER, "[^\\w]"));
  }

  /** Returns true iff the character is a vowel. */
  private static boolean isVowel(char c) {
    return switch (Character.toLowerCase(c)) {
      case 'a', 'e', 'i', 'o', 'u' -> true;
      default -> false;
    };
  }

  /** Translates a word into Pig Latin. */
  private static String translateWord(String word) {

    if (word.length() == 0) {
      return word;
    }

    final char firstChar = word.charAt(0);

    if (isVowel(firstChar)) {
      word += "way";
    } else if (Character.isLetter((firstChar))) {
      word = word.substring(1) + Character.toLowerCase(firstChar) + "ay";
    }

    if (Character.isUpperCase(firstChar)) {
      word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    return word;
  }

  /** Translates a line into Pig Latin. */
  private static String translateLine(String line) {
    final StringBuilder sb = new StringBuilder();

    for (String word : splitLine(line)) {
      sb.append(translateWord(word));
    }

    return sb.toString();
  }

  public static void main(String[] args) throws IOException {

    final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final StringBuilder sb = new StringBuilder();

    String line = br.readLine();
    while (line != null) {
      sb.append(translateLine(line) + "\n");
      line = br.readLine();
    }

    System.out.println(sb);

  }
}
