package solutions.question336b;

public interface GenericSet<E> {

  /** Adds the element x to the set. */
  void add(E x);

  /**
   * If the element x belongs to the set, it is removed and returns true. Otherwise, returns false.
   */
  boolean remove(E x);

  /** Returns true iff the set is empty. */
  boolean isEmpty();

  /** Returns true iff the set contains the element x. */
  boolean contains(E x);

  /** Adds all elements within an array to the set. */
  default void addAll(E[] items) {
    for (E item : items) {
      add(item);
    }
  }

  /** Returns a generic set which cannot be modified. */
  default GenericSet<E> asUnmodifiableSet() {
    // Anonymous inner class
    return new GenericSet<E>() {

      @Override
      public void add(E x) {
        throw new UnsupportedOperationException("cannot add to an unmodifiable set");
      }

      @Override
      public boolean remove(E x) {
        throw new UnsupportedOperationException("cannot remove from an unmodifiable set");
      }

      @Override
      public boolean isEmpty() {
        return GenericSet.this.isEmpty();
      }

      @Override
      public boolean contains(E x) {
        return GenericSet.this.contains(x);
      }
    };
  }
}
