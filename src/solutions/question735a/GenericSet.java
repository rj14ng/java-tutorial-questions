package solutions.question735a;

public interface GenericSet<E> extends GenericCollection<E> {

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
}
