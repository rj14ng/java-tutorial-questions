package solutions.question5566;

public class GenericStackUnsupportedPopException extends UnsupportedOperationException {

  @Override
  public String toString() {
    return "Attempt to pop element from empty stack failed";
  }
}
