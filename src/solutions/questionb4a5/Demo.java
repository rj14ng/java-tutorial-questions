package solutions.questionb4a5;

public class Demo {

  public static void main(String[] args) {

    for (int i = 0; i < 1000000; i++) {
      new A(i);
    }

    System.out.println("Number of instances garbage-collected: " + A.numCollected);

    /*
     * Not all garbage is collected before the program terminates. 1,000,000 garbage objects were
     * produced, but in each run <20,000 were garbage-collected.
     *
     * Different numbers of objects are also collected in different order during different runs.
     *
     * There is therefore no guarantee as to when (if at all) `finalize` will be invoked for an
     * object that becomes garbage.
     */
  }
}
