package solutions.question8a61;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

  public static IntSet readIntegers(int n) throws IOException {

    IntSet set = n > 10 ? new MemoryEfficientIntSet() : new SpeedEfficientIntSet();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < n; i++) {
      System.out.println("Please enter an int:");
      set.add(Integer.parseInt(br.readLine()));
    }

    return set;
  }

  public static void main(String[] args) throws IOException {

    assert args.length == 1;

    IntSet set = readIntegers(Integer.parseInt(args[0]));
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
