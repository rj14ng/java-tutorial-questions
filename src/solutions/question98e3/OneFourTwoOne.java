package solutions.question98e3;

public class OneFourTwoOne {

  private static int next(int x) {
    return x % 2 == 0 ? x / 2 : 3 * x + 1;
  }

  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);

    System.out.print(value);

    while (value != 1) {
      value = next(value);
      System.out.print(" " + value);
    }
  }
}
