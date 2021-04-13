package solutions.question5566;

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
    } else {
      throw new GenericStackFailedPushError(STACK_LIMIT);
    }
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      throw new GenericStackUnsupportedPopException();
    }
    stackPointer--;
    return stack[stackPointer];
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }
}
