package solutions.question7041;

public class TreeNode<E> {

  private E key;
  private final TreeNode<E>[] children;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {
    children[childIndex] = child;
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  /** Creates a "semi-deep" clone, as aspects apart from the key are cloned. */
  @Override
  public TreeNode<E> clone() {

    TreeNode<E> duplicate = new TreeNode<>(getNumberOfChildren());
    duplicate.setKey(key);
    for (int i = 0; i < getNumberOfChildren(); i++) {
      duplicate.setChild(i, getChild(i).clone());
    }

    return duplicate;
  }
}
