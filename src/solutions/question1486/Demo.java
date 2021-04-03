package solutions.question1486;

public class Demo {

  /** Transfers the contents of src to dst. */
  public static void transferStacks(StringStack dst, StringStack src) {
    while (!src.isEmpty()) {
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {

    StringStack arrayBasedStack = new StringStackArray();
    StringStack listBasedStack = new StringStackList();

    arrayBasedStack.push("Lorem");
    arrayBasedStack.push("ipsum");
    arrayBasedStack.push("dolor");
    arrayBasedStack.push("sit");
    arrayBasedStack.push("amet");

    transferStacks(listBasedStack, arrayBasedStack);

    assert arrayBasedStack.isEmpty();
    while (!listBasedStack.isEmpty()) {
      System.out.println(listBasedStack.pop());
    }
  }
}
