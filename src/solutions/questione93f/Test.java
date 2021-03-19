package solutions.questione93f;

public class Test {

  public static void main(String[] args) {
    // Remember that overloading is resolved using *apparent* types
    // https://github.com/afd/ProgrammingIITutorialQuestions/blob/master/solutions/e93f.md

    B b = new B();

    C c = new D();
    c.accept(b); // Accepted object of type A.

    D d = new D();
    d.accept(b); // Accepted object of type B.
  }
}
