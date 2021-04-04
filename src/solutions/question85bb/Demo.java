package solutions.question85bb;

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

    System.out.println("Stack 1: " + arrayBasedStack);
    System.out.println("Stack 2: " + listBasedStack);

    transferStacks(listBasedStack, arrayBasedStack);

    assert arrayBasedStack.isEmpty();

    System.out.println("Stack 1 after transfer: " + arrayBasedStack);
    System.out.println("Stack 2 after transfer: " + listBasedStack);
  }
}
