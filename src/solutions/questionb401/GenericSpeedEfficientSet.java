package solutions.questionb401;

import java.util.HashSet;
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
}
