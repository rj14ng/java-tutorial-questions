package solutions.question5566;

public interface GenericStack<E> {

  /**
   * If the stack is full, does nothing. Otherwise, pushes the given element on to the top of the
   * stack.
   */
  void push(E s);

  /**
   * If the stack is empty, leaves the stack unchanged and returns null. Otherwise, removes the
   * element that is on the top of the stack and returns it.
   */
  E pop();

  /** Returns true iff the stack is empty. */
  boolean isEmpty();
}
