package solutions.question98e3;

public class OneFourTwoOne {

  /** Returns the next number in the Collatz sequence. */
  private static int next(int n) {
    return n % 2 == 0 ? n / 2 : 3 * n + 1;
  }

  public static void main(String[] args) {

    // Enforce number of arguments
    assert args.length == 1 : "only 1 argument allowed, but " + args.length + " were given";

    int value = Integer.parseInt(args[0]);

    System.out.print(value);

    while (value != 1) {
      value = next(value);
      System.out.print(" " + value);
    }
  }
}
