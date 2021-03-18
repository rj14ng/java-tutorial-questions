package solutions.questione6fd;

public class BitSet8 extends BitSet {

  private byte bitSet;

  public BitSet8() {
    bitSet = 0;
  }

  @Override
  public void add(int x) {
    if (!inRange(x)) {
      throw new RuntimeException("value " + x + " too large for bit set");
    }
    bitSet |= (byte) 1 << (byte) x;
  }

  @Override
  public void remove(int x) {
    if (inRange(x)) {
      bitSet &= ~((byte) 1 << (byte) x);
    }
  }

  @Override
  public boolean contains(int x) {
    if (!inRange(x)) {
      return false;
    }
    return (((byte) 1 << (byte) x) & bitSet) != 0;
  }

  @Override
  public void intersectWith(BitSet s) {
    if (s instanceof BitSet8) {
      bitSet &= ((BitSet8) s).bitSet;
    } else {
      super.intersectWith(s);
    }
  }

  @Override
  public int maxStorableValue() {
    return Byte.SIZE;
  }
}
