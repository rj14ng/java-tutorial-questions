package solutions.question2d33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReversedOrderOfInputArray {

  private static final int MAX_INPUT_SIZE = 100;

  /** Implement an array-based solution. */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] lines = new String[MAX_INPUT_SIZE];
    int count = 0;

    String line = br.readLine();
    while (line != null && count < MAX_INPUT_SIZE) {
      lines[count] = line;
      count++;
      line = br.readLine();
    }

    for (int i = count - 1; i >= 0; i--) {
      System.out.println(lines[i]);
    }
  }
}
