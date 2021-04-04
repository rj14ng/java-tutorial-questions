package solutions.question85bb;

public abstract class AbstractStringStack implements StringStack {

  @Override
  public String toString() {

    final StringBuilder sb = new StringBuilder("[");

    StringStackIterator iterator = iterator();
    while (iterator.hasNext()) {
      sb.append(iterator.next());
      if (iterator.hasNext()) {
        sb.append(", ");
      }
    }

    sb.append("]");
    return sb.toString();
  }
}
