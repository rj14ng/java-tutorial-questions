package solutions.questionf79b;

public class PerfectPalindromicCubes {

  /** Returns true if the string is a palindrome. */
  private static boolean isPalindrome(String numStr) {
    int length = numStr.length();

    int start = 0;
    int end = length - 1;

    if (length == 0 || length == 1) {
      return true;
    }

    return numStr.charAt(start) == numStr.charAt(end)
        && isPalindrome(numStr.substring(start + 1, end));
  }

  public static void main(String[] args) {

    // Use long, as large cubes will overflow.
    // Note that superficially, using int wouldn't change the answer since 1001^3 (which doesn't
    // overflow) is the last solution below 1499^3.
    for (long i = 0; i < 1500; i++) {
      String cubeStr = String.valueOf(i * i * i);
      if (isPalindrome(cubeStr)) {
        System.out.println(i + " cubed is " + cubeStr);
      }
    }
  }
}
