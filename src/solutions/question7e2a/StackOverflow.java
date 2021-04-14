package solutions.question7e2a;

public class StackOverflow {

  public static int overflow(int call) {

    try {
      return overflow(call + 1);

    } catch (StackOverflowError e) {
      return call;
    }
  }

  public static void main(String[] args) {

    final int numOfCalls = overflow(0);

    // The result is different between runs
    // Shows that the maximum stack size varies between runs
    System.out.println("Number of calls before stack overflow: " + numOfCalls);
  }
}
