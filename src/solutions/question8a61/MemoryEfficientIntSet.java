package solutions.question8a61;

import java.util.HashSet;
import java.util.Set;

public class MemoryEfficientIntSet implements IntSet {

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
}
