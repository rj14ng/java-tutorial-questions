package solutions.questione093;

import java.io.IOException;

public class Average {

  public static void main(String[] args) throws IOException {

    final int n = new IntegerReader().readPositiveInteger("Please enter a positive integer");

    int total = 0;

    for (int i = 0; i < n; i++) {
      total += new IntegerReader().readInteger("Please enter integer number " + (i + 1));
    }

    final double average = (double) total / n;

    System.out.println("Average = " + average);
  }
}
