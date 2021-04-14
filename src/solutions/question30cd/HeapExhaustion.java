package solutions.question30cd;

import java.util.ArrayList;
import java.util.List;

public class HeapExhaustion {

  public static void main(String[] args) {

    // Add Integer objects to list so they are never garbage collected
    final List<Integer> integers = new ArrayList<>();

    try {

      while (true) {
        integers.add(0);
      }

    } catch (OutOfMemoryError e) {

      // Same number returned with every run
      // Suggests that JVM memory allocation behaves deterministically
      System.out.println("Number of objects before heap memory exhausted: " + integers.size());
    }
  }
}
