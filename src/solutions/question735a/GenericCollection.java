package solutions.question735a;

public interface GenericCollection<E> {

  /** Retrieves an iterator for the collection. */
  GenericIterator<E> iterator();
}
