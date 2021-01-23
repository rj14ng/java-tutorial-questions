package solutions.question2d33;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReversedOrderOfInputStack {

  /** Implement a stack-based solution using a Deque. */
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Deque<String> lines = new ArrayDeque<>();

    String line = br.readLine();
    while (line != null) {
      lines.push(line);
      line = br.readLine();
    }

    while (!lines.isEmpty()) {
      System.out.println(lines.pop());
    }
  }
}
