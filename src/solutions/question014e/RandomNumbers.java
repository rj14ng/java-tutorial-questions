package solutions.question014e;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

  /** Join a list of Integers with the specified separator. */
  public static String join(String separator, List<Integer> numbers) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < numbers.size(); i++) {

      sb.append(numbers.get(i));

      if (i != numbers.size() - 1) {
        sb.append(separator);
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {

    assert args.length == 1 : "only 1 argument allowed, but " + args.length + " were given";

    int x = Integer.parseInt(args[0]);

    Random generator = new Random();

    Set<Integer> numbersSet = new HashSet<>();
    List<Integer> numbersList = new ArrayList<>();

    while (numbersSet.size() != x) {
      int n = generator.nextInt(x);

      numbersList.add(n);
      numbersSet.add(n);
    }

    System.out.println("Generating random numbers:");
    System.out.println(join(", ", numbersList));
    System.out.println(
        "I had to generate "
            + numbersList.size()
            + " random numbers between 0 and "
            + (x - 1)
            + " to have produced all such numbers at least once.");
  }
}
