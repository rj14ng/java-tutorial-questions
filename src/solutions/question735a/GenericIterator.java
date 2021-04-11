package solutions.question735a;

public interface GenericIterator<E> {

  /** Returns true iff the iteration has more elements. */
  boolean hasNext();

  /** Returns the next element in the iteration. */
  E next();
}
