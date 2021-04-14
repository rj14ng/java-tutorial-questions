package solutions.question2862;

public class Demo {

  public static void main(String[] args) {

    A myB = new B();

    try {
      // Exception handling checked based on apparent type
      // We need to downcast myB with apparent type A to B to catch MyExceptionD
      // Alternatively we can catch MyExceptionC instead
      ((B) myB).foo();
    } catch (MyExceptionD e) {
      System.out.println("Exception of type MyExceptionD was thrown.");
    }
  }
}
