package solutions.questiona6e7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemoryEfficientIntSet extends AbstractIntSet {

  private final Set<Integer> set;

  public MemoryEfficientIntSet() {
    this.set = new HashSet<>();
  }

  @Override
  public void add(int x) {
    set.add(x);
  }

  @Override
  public boolean remove(int x) {
    return set.remove(x);
  }

  @Override
  public boolean isEmpty() {
    return set.isEmpty();
  }

  @Override
  public boolean contains(int x) {
    return set.contains(x);
  }

  @Override
  public IntSetIterator iterator() {

    return new IntSetIterator() {

      private final Iterator<Integer> iterator = set.iterator();

      @Override
      public boolean hasNext() {
        return iterator.hasNext();
      }

      @Override
      public int next() {
        return iterator.next();
      }
    };
  }
}
