package solutions.question96df;

public class LeafTreeNode<E> extends AbstractTreeNode<E> {

  @Override
  public int getNumberOfChildren() {
    return 0;
  }

  @Override
  public TreeNode<E> getChild(int childIndex) {
    throw new UnsupportedOperationException("leaf node has no children");
  }

  @Override
  public void setChild(int childIndex, TreeNode<E> child) {
    throw new UnsupportedOperationException("leaf node has no children");
  }
}
