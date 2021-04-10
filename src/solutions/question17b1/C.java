package solutions.question17b1;

import java.io.IOException;

public class C implements K {

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

  @Override
  public void baz() {}

  // Rename since I.foobar does not specify that it may throw an exception
  public int foobarOriginal() throws IOException {
    throw new IOException();
  }

  // Rename since K.foobar (implicitly) provides public visibility
  protected int foobarOriginal(int x) {
    return x;
  }
}
