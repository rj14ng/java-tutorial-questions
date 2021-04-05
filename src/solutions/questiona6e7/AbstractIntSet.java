package solutions.questiona6e7;

public abstract class AbstractIntSet implements IntSet {

  @Override
  public void addAll(IntSet other) {
    for (IntSetIterator iterator = other.iterator(); iterator.hasNext(); ) {
      add(iterator.next());
    }
  }

  @Override
  public void removeAll(IntSet other) {
    for (IntSetIterator iterator = other.iterator(); iterator.hasNext(); ) {
      remove(iterator.next());
    }
  }

  @Override
  public boolean contains(IntSet other) {
    for (IntSetIterator iterator = other.iterator(); iterator.hasNext(); ) {
      if (!contains(iterator.next())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {

    final StringBuilder sb = new StringBuilder("[");

    IntSetIterator iterator = iterator();
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
