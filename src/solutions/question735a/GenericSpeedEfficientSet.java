package solutions.question735a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericSpeedEfficientSet<E> implements GenericSet<E> {

  private final Set<E> set;

  public GenericSpeedEfficientSet() {
    this.set = new HashSet<>();
  }

  @Override
  public void add(E x) {
    set.add(x);
  }

  @Override
  public boolean remove(E x) {
    return set.remove(x);
  }

  @Override
  public boolean isEmpty() {
    return set.isEmpty();
  }

  @Override
  public boolean contains(E x) {
    return set.contains(x);
  }

  @Override
  public GenericIterator<E> iterator() {

    return new GenericIterator<>() {

      private final Iterator<E> iterator = set.iterator();

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
