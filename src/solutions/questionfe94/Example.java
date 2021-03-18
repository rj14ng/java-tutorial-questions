package solutions.questionfe94;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

  static List<String> reverseEachString(List<String> input) {
    return input.stream()
        .map(StringBuilder::new)
        .map(StringBuilder::reverse)
        .map(StringBuilder::toString)
        .collect(Collectors.toList());
  }

  static List<String> reverseEachStringMonolithic(List<String> input) {
    return input.stream()
        .map(s -> new StringBuilder(s).reverse().toString())
        .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input.stream()
        .filter(s -> Character.isDigit(s.charAt(0)))
        .map(s -> Integer.parseInt(s.substring(0, 1)))
        .map(Math::sqrt)
        .collect(Collectors.toList());
  }

  static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input.stream()
        .filter(s -> Character.isDigit(s.charAt(0)))
        .map(s -> Math.sqrt(Integer.parseInt(s.substring(0, 1))))
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {

    List<String> wordList = List.of("hello", "world", "welcome", "to", "streams", "in", "java");
    System.out.println("List of strings: " + wordList);
    List<String> reversedStringList = reverseEachString(wordList);
    System.out.println("Reversed: " + reversedStringList);
    assert reversedStringList.equals(reverseEachStringMonolithic(wordList));

    List<String> anotherList = List.of("hello", "2you", "happy", "19th", "birthday!");
    System.out.println("Another list: " + anotherList);
    List<Double> sqrtsOfFirstDigitsList = sqrtsOfFirstDigits(anotherList);
    System.out.println("Sqrt of first digits: " + sqrtsOfFirstDigitsList);
    assert sqrtsOfFirstDigitsList.equals(sqrtsOfFirstDigitsMonolithic(anotherList));
  }
}
