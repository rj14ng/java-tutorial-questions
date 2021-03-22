package solutions.question96df;

public abstract class AbstractTreeNode<E> implements TreeNode<E> {

  private E key;

  @Override
  public final E getKey() {
    return key;
  }

  @Override
  public final void setKey(E key) {
    this.key = key;
  }

  @Override
  public String toString() {

    final StringBuilder sb = new StringBuilder(key.toString());

    if (getNumberOfChildren() > 0) {
      sb.append("(");
      for (int i = 0; i < getNumberOfChildren(); i++) {
        sb.append(getChild(i));
        if (i < getNumberOfChildren() - 1) {
          sb.append(", ");
        }
      }
      sb.append(")");
    }

    return sb.toString();
  }
}
