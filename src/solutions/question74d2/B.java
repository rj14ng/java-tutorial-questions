package solutions.question74d2;

public class B extends A {

  // Compiles since an overridden method can throw a narrower type of exception, or no exception
  @Override
  public void foo() {

    try {
      super.foo();
    } catch (Exception ignored) {
      // Ignore
    }
  }
}
