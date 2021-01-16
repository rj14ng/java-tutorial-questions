package solutions.question4c70;

import java.util.Arrays;
import java.util.Random;

public class LotteryNumbers {

  public static final int NUM_NUMBERS = 7;
  public static final int MAX_NUMBER = 49;

  public static void main(String[] args) {

    Random generator = new Random();

    int[] numbers = new int[NUM_NUMBERS];

    int currentNumber = 0;

    while (currentNumber < NUM_NUMBERS) {

      int n = generator.nextInt(MAX_NUMBER) + 1;

      if (!Arrays.asList(numbers).contains(n)) {
        numbers[currentNumber] = n;
        currentNumber++;
      }
    }

    for (int i = 0; i < 6; i++) {
      System.out.println("Number " + (i + 1) + ": " + numbers[i]);
    }
    System.out.println("Bonus Number: " + numbers[6]);
  }
}
