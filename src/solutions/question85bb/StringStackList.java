package solutions.question85bb;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringStackList extends AbstractStringStack {

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

  @Override
  public StringStackIterator iterator() {

    return new StringStackIterator() {

      private final ListIterator<String> iterator = stack.listIterator(stack.size());

      @Override
      public boolean hasNext() {
        return iterator.hasPrevious();
      }

      @Override
      public String next() {
        if (hasNext()) {
          return iterator.previous();
        }
        return null;
      }
    };
  }
}
