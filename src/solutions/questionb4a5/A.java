package solutions.questionb4a5;

public class A {

  private final int id;

  static int numCollected = 0;

  public A(int id) {
    this.id = id;
  }

  @Override
  public void finalize() {
    System.out.println("Instance " + id + " collected");
    numCollected++;
  }
}
