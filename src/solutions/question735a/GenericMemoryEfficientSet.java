package solutions.question735a;

import java.util.ArrayList;
import java.util.Iterator;
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

  @Override
  public GenericIterator<E> iterator() {

    return new GenericIterator<>() {

      private final Iterator<E> iterator = elements.iterator();

      @Override
      public boolean hasNext() {
        return iterator.hasNext();
      }

      @Override
      public E next() {
        return iterator.next();
      }
    };
  }
}
