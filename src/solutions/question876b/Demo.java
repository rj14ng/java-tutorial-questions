package solutions.question876b;

import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {

    Set<B> setOfB = new HashSet<>();

    // Set<B> is not a subclass of Set<A>, since we cannot add objects of type A to Set<B>
    // Set<A> setOfA = setOfB; // Compilation error!

    // Use a bounded wildcard (more specific than unbounded wildcard)
    Set<? extends A> setOfA = setOfB; // Compiles!
  }
}
