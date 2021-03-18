package solutions.questione6fd;

public class BitSetArray extends BitSet {

  private final int maxValue;
  private final long[] bitSet;

  public BitSetArray(int x) {
    if (x < 0) {
      throw new IllegalArgumentException("negative max value provided for bit set");
    }
    this.maxValue = x;
    this.bitSet = new long[(int) Math.ceil((double) x / Long.SIZE)];
  }

  @Override
  public void add(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("value " + x + " too large for bit set");
    }
    bitSet[index(x)] |= (long) 1 << (long) xPosition(x);
  }

  @Override
  public void remove(int x) {
    if (inRange(x)) {
      bitSet[index(x)] &= ~((long) 1 << (long) xPosition(x));
    }
  }

  @Override
  public boolean contains(int x) {
    if (!inRange(x)) {
      return false;
    }
    return (((long) 1 << (long) (xPosition(x))) & bitSet[index(x)]) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSetArray) {
      for (int i = 0; i < index(Math.min(maxStorableValue(), s.maxStorableValue())); i++) {
        bitSet[i] &= ((BitSetArray) s).bitSet[i];
      }
    } else {
      super.intersectWith(s);
    }
  }

  @Override
  public int maxStorableValue() {
    return maxValue;
  }

  private int index(int x) {
    return x / Long.SIZE;
  }

  private int xPosition(int x) {
    return x % Long.SIZE;
  }

  // Show bits in bit set, for debugging purposes
  private String showSet() {
    final StringBuilder sb = new StringBuilder();
    for (long i : bitSet) {
      sb.append("0".repeat(Long.numberOfLeadingZeros(i)) + Long.toBinaryString(i));
      sb.append("\n");
    }
    return sb.toString();
  }
}
