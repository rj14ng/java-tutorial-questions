package solutions.question735a;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
      return null;
    }
    return stack.remove(stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  @Override
  public GenericIterator<E> iterator() {

    return new GenericIterator<>() {

      private final ListIterator<E> iterator = stack.listIterator(stack.size());

      @Override
      public boolean hasNext() {
        return iterator.hasPrevious();
      }

      @Override
      public E next() {
        if (hasNext()) {
          return iterator.previous();
        }
        return null;
      }
    };
  }
}
