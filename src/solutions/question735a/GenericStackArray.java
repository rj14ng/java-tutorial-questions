package solutions.question735a;

public class GenericStackArray<E> implements GenericStack<E> {

  private static final int STACK_LIMIT = 100;

  private final E[] stack;
  private int stackPointer;

  /** Creates an empty stack. */
  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    this.stack = (E[]) new Object[STACK_LIMIT];
    this.stackPointer = 0;
  }

  @Override
  public void push(E s) {
    if (stackPointer < STACK_LIMIT) {
      stack[stackPointer] = s;
      stackPointer++;
    }
  }

  @Override
  public E pop() {
    if (stackPointer > 0) {
      stackPointer--;
      return stack[stackPointer];
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }

  @Override
  public GenericIterator<E> iterator() {

    return new GenericIterator<>() {

      private int current = stackPointer - 1;

      @Override
      public boolean hasNext() {
        return current >= 0;
      }

      @Override
      public E next() {
        if (hasNext()) {
          E next = stack[current];
          current--;
          return next;
        }
        return null;
      }
    };
  }
}
