package solutions.questione93f;

public class D extends C {
  // Does not override accept method in class C, as they have different parameters
  // Instead, accept is overloaded:
  // 1. public void accept(A a) {...}   (inherited from C)
  // 2. public void accept(B b) {...}   (from D)
  public void accept(B b) {
    System.out.println("Accepted object of type B.");
  }
}
