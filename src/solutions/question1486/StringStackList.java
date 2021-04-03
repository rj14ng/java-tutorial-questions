package solutions.question1486;

import java.util.LinkedList;
import java.util.List;

public class StringStackList implements StringStack {

  private final List<String> stack;

  /** Creates an empty string stack. */
  public StringStackList() {
    this.stack = new LinkedList<>();
  }

  @Override
  public void push(String s) {
    stack.add(s);
  }

  @Override
  public String pop() {
    if (isEmpty()) {
      return null;
    }
    return stack.remove(stack.size() - 1);
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }
}
