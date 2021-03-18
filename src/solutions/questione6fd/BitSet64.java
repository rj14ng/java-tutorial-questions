package solutions.questione6fd;

public class BitSet64 extends BitSet {

  private long bitSet;

  public BitSet64() {
    bitSet = 0;
  }

  @Override
  public void add(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("value " + x + " too large for bit set");
    }
    bitSet |= (long) 1 << (long) x;
  }

  @Override
  public void remove(int x) {
    if (inRange(x)) {
      bitSet &= ~((long) 1 << (long) x);
    }
  }

  @Override
  public boolean contains(int x) {
    if (!inRange(x)) {
      return false;
    }
    return (((long) 1 << (long) x) & bitSet) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSet64) {
      bitSet &= ((BitSet64) s).bitSet;
    } else {
      super.intersectWith(s);
    }
  }

  @Override
  public int maxStorableValue() {
    return Long.SIZE;
  }
}
