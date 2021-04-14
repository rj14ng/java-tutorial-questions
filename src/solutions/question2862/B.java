package solutions.question2862;

public class B extends A {

  // This fails to compile
  // We are still overriding A.foo, and IOException does not match the type of MyExceptionC
  /*
  void foo() throws IOException {
    throw new IOException();
  } */

  // This compiles
  // MyExceptionD extends MyExceptionC so A.foo can be overridden
  @Override
  void foo() throws MyExceptionD {
    throw new MyExceptionD();
  }
}
