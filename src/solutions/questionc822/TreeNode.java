package solutions.questionc822;

public class TreeNode<E> {

  private E key;
  private final TreeNode<E>[] children;
  private int numberOfParents;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
    numberOfParents = 0;
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {

    // PRECONDITIONS
    // Prevent cyclic structures (test 1): this cannot be a descendant of child
    assert child == null || !child.reaches(this) : "cannot clone cyclic structure";
    // Prevent construction of DAGs (test 2): child cannot already have a parent
    assert child == null || child.numberOfParents == 0 : "cannot clone DAG";

    if (children[childIndex] != null) {
      children[childIndex].numberOfParents--;
    }

    children[childIndex] = child;

    if (children[childIndex] != null) {
      children[childIndex].numberOfParents++;
    }
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

  /** Performs a DFS for the parent starting from the child. */
  private boolean reaches(TreeNode<E> n) {
    if (this == n) {
      return true;
    }
    for (int i = 0; i < getNumberOfChildren(); i++) {
      if (getChild(i) != null && getChild(i).reaches(n)) {
        return true;
      }
    }
    return false;
  }
}
