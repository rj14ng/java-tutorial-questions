package solutions.question2ffc;

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
      return (E) stack[stackPointer];
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }
}
