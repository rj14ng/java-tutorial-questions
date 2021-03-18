package solutions.questione6fd;

public abstract class BitSet {

  /**
   * Adds x to the bit set.
   *
   * @throws RuntimeException if x is not in range.
   */
  public abstract void add(int x);

  /** Removes x if it belongs to the bit set. */
  public abstract void remove(int x);

  /** Returns true iff x belongs to the bit set. */
  public abstract boolean contains(int x);

  /** Updates the bit set to contain only those values also present in s. */
  public void intersectWith(BitSet s) {
    for (int x = 0; inRange(x); x++) {
      if (!s.contains(x)) {
        remove(x);
      }
    }
  }

  /** Returns the maximum value that the bit set can represent. */
  public abstract int maxStorableValue();

  /** Returns if x can be represented in the bit set. */
  boolean inRange(int x) {
    return x >= 0 && x < maxStorableValue();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("{");
    boolean first = true;
    for (int x = 0; inRange(x); x++) {
      if (contains(x)) {
        if (first) {
          first = false;
        } else {
          sb.append(", ");
        }
        sb.append(x);
      }
    }
    return sb.toString() + "}";
  }
}
