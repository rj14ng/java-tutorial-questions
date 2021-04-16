package solutions.question9a9b;

public interface Tune extends Iterable<TuneElement> {

  /** Adds an element to the tune. */
  void addTuneElement(TuneElement tuneElement);

  /** Returns a tune derived from the original, transposed up by a given interval. */
  Tune transpose(int interval);
}
