package solutions.question5566;

import java.util.LinkedList;
import java.util.List;

public class GenericStackList<E> implements GenericStack<E> {

  private final List<E> stack;

  /** Creates an empty stack. */
  public GenericStackList() {
    this.stack = new LinkedList<>();
  }

  @Override
  public void push(E s) {
    stack.add(s);
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new GenericStackUnsupportedPopException();
    }
    return stack.remove(stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
