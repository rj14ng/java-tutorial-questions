package solutions.question1aeb;

public interface NumberAdder<T extends Number> {

  /** Returns a number of type T that represents zero. */
  T zero();

  /** Returns the sum of x and y. */
  T add(T x, T y);
}
