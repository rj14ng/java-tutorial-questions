package solutions.question5566;

public class Demo {

  public static <E> void transferStacks(GenericStack<E> src, GenericStack<E> dst) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    GenericStack<String> first = new GenericStackArray<>();

    GenericStack<String> second = new GenericStackList<>();

    first.push("The");
    first.pop();

    try {
      first.pop();
    } catch (GenericStackUnsupportedPopException e) {
      System.out.println(e);
    }

    for (int i = 0; i < 110; i++) {
      try {
        first.push("ArrayStackElement" + i);
        second.push("ListStackElement" + i);
      } catch (GenericStackFailedPushError e) {
        System.out.println(e);
      }
    }
  }
}
