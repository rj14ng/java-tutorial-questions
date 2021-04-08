package solutions.question2ffc;

public class Demo {

  /** Transfers the contents of src to dst. */
  public static <E> void transferStacks(GenericStack<E> dst, GenericStack<E> src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    GenericStack<Integer> arrayBasedStack = new GenericStackArray<>();
    GenericStack<Integer> listBasedStack = new GenericStackList<>();

    arrayBasedStack.push(1);
    arrayBasedStack.push(2);
    arrayBasedStack.push(3);
    arrayBasedStack.push(4);
    arrayBasedStack.push(5);

    transferStacks(listBasedStack, arrayBasedStack);

    assert arrayBasedStack.isEmpty();
    while (!listBasedStack.isEmpty()) {
      System.out.println(listBasedStack.pop());
    }
  }
}
