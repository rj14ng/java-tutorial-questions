package solutions.questiona6e7;

public interface IntSet {

  /** Adds the integer x to the set. */
  void add(int x);

  /** Adds to the set each element in the other set. */
  void addAll(IntSet other);

  /**
   * If the integer x belongs to the set, it is removed and returns true. Otherwise, returns false.
   */
  boolean remove(int x);

  /** Removes from the set each element in the other set. */
  void removeAll(IntSet other);

  /** Returns true iff the set is empty. */
  boolean isEmpty();

  /** Returns true iff the set contains the integer x. */
  boolean contains(int x);

  /** Returns true iff the set contains every element of the other set. */
  boolean contains(IntSet other);

  /** Retrieves an iterator for the set. */
  IntSetIterator iterator();
}
