package solutions.question17b1;

public class A implements I {

  @Override
  public int foo() {
    return 0;
  }

  @Override
  public int foo(int x) {
    return 0;
  }

  @Override
  public int bar(int x) {
    return 0;
  }

  public int foobar() {
    return 42;
  }

  // Rename to avoid clash with I.foobar (same name & parameter types, but different return type)
  public void foobarOriginal(int x) {
    System.out.println(x);
  }
}
