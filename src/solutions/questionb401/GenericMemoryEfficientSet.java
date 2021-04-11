package solutions.questionb401;

import java.util.ArrayList;
import java.util.List;

public class GenericMemoryEfficientSet<E> implements GenericSet<E> {

  private final List<E> elements;

  public GenericMemoryEfficientSet() {
    elements = new ArrayList<>();
  }

  @Override
  public void add(E item) {
    if (elements.contains(item)) {
      return;
    }
    elements.add(item);
  }

  @Override
  public boolean remove(E item) {
    return elements.remove(item);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean contains(E item) {
    return elements.contains(item);
  }
}
