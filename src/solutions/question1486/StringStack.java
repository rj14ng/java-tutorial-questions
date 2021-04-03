package solutions.question1486;

public interface StringStack {

  /**
   * If the stack is full, does nothing. Otherwise, pushes the given String on to the top of the
   * stack.
   */
  void push(String s);

  /**
   * If the stack is empty, leaves the stack unchanged and returns null. Otherwise, removes the
   * string that is on the top of the stack and returns it.
   */
  String pop();

  /** Returns true iff the stack is empty. */
  boolean isEmpty();
}
