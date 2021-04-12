package solutions.question290b;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class EfficientPoint {

  private static final Map<EfficientPoint, WeakReference<EfficientPoint>> pool =
      new WeakHashMap<>();

  private final int coordX;
  private final int coordY;
  private final int coordZ;

  private EfficientPoint(int coordX, int coordY, int coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  /**
   * Factory method for efficient memory usage. Keeps a pool of points that have already been
   * created, and when asked for a new point returns a matching point in the pool, if it exists.
   */
  public static EfficientPoint makePoint(int x, int y, int z) {

    EfficientPoint p = new EfficientPoint(x, y, z);

    if (pool.get(p) != null) {
      return pool.get(p).get(); // p will now be garbage collected
    } else {
      pool.put(p, new WeakReference<>(p));
      return p;
    }
  }

  /** Returns the size of the pool. */
  public static int getPoolSize() {
    return pool.size();
  }

  @Override
  public String toString() {
    return "(" + coordX + ", " + coordY + ", " + coordZ + ")";
  }

  @Override
  public boolean equals(Object that) {
    return that instanceof EfficientPoint
        && coordX == ((EfficientPoint) that).coordX
        && coordY == ((EfficientPoint) that).coordY
        && coordZ == ((EfficientPoint) that).coordZ;
  }

  @Override
  public int hashCode() {
    return Integer.valueOf(coordX).hashCode()
        ^ Integer.valueOf(coordY).hashCode()
        ^ Integer.valueOf(coordZ).hashCode();
  }
}
