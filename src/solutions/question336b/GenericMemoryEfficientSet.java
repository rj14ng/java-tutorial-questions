package solutions.question336b;

import java.util.ArrayList;
import java.util.HashSet;
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
  public boolean contains(E item) {
    return elements.contains(item);
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  @Override
  public boolean remove(E item) {
    return elements.remove(item);
  }

  @Override
  public void addAll(E[] items) {
    final HashSet<E> knownElements = new HashSet<>(elements);
    for (E item : items) {
      if (!knownElements.contains(item)) {
        elements.add(item);
        knownElements.add(item);
      }
    }
  }
}
