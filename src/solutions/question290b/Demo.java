package solutions.question290b;

public class Demo {

  public static void main(String[] args) {

    // Would cause memory leak (out of memory error), if we didn't use WeakReference and WeakHashMap
    for (int i = 0; i < 1000000; i++) {
      EfficientPoint.makePoint(i, 0, 0);
    }

    System.out.println("Size of pool: " + EfficientPoint.getPoolSize());
  }
}
