package solutions.questiond3f5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

  private static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers
        .filter(n -> n instanceof Integer)
        .map(n -> (Integer) n)
        .filter(n -> n > 0);
  }

  // Use of bounded wildcard to be compatible with any type that is Number or its subclasses
  private static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(
      Stream<? extends Number> numbers) {
    return numbers
        .filter(n -> n instanceof Integer)
        .map(n -> (Integer) n)
        .filter(n -> n > 0);
  }

  public static void main(String[] args) {

    final List<Number> numbers = List.of(5, 2, 3.14f, -2.72, (short) -1, -12, -200, 200, 0);
    final List<Double> floats = List.of(10.0, -20.0, 31.0, 412.34);
    final List<Integer> integers = List.of(1, -1, 2, -2, 3, -3, 4, -4, 0);

    System.out.println(
        "Positive integers from "
            + numbers
            + " are: "
            + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

    // Compatible since Float extends Number
    System.out.println(
        "Positive integers from "
            + floats
            + " are: "
            + restrictToPositiveIntegersBoundedWildcard(floats.stream())
                .collect(Collectors.toList()));

    // Compatible since Integer extends Number
    System.out.println(
        "Positive integers from "
            + integers
            + " are: "
            + restrictToPositiveIntegersBoundedWildcard(integers.stream())
                .collect(Collectors.toList()));
  }
}
