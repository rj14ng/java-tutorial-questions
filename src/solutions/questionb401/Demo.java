package solutions.questionb401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Demo {

  public static GenericSet<Integer> readIntegers(int n) throws IOException {

    GenericSet<Integer> set =
        n > 10 ? new GenericMemoryEfficientSet<>() : new GenericSpeedEfficientSet<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < n; i++) {
      System.out.println("Please enter an int:");
      set.add(Integer.parseInt(br.readLine()));
    }

    return set;
  }

  public static void main(String[] args) throws IOException {

    // Test generic set on different types

    GenericSet<String> stringSet = new GenericMemoryEfficientSet<>();

    stringSet.add("Hello");

    stringSet.add("There");

    assert stringSet.contains("Hello");

    stringSet.remove("Hello");

    assert !stringSet.contains("Hello");

    assert !stringSet.contains("Cat");

    GenericSet<PrintStream> printStreamSet = new GenericSpeedEfficientSet<>();

    printStreamSet.add(System.out);

    assert printStreamSet.contains(System.out);

    assert !printStreamSet.contains(System.err);

    printStreamSet.remove(System.out);

    assert printStreamSet.isEmpty();

    // Test readIntegers

    assert args.length == 1;

    GenericSet<Integer> set = readIntegers(Integer.parseInt(args[0]));
    // Doesn't show <Integer> generic parameter due to type erasure at compile time
    System.out.println("Set is: " + set.getClass());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("Enter an int, to be tested for membership:");
      String input = br.readLine();
      if (input == null) {
        System.out.println("Goodbye!");
        break;
      }
      System.out.println(
          "Set contains " + Integer.parseInt(input) + ": " + set.contains(Integer.parseInt(input)));
    }
  }
}
