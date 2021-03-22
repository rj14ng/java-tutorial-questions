package solutions.question96df;

public class BinaryTreeNode<E> extends AbstractTreeNode<E> {

  private TreeNode<E> left;
  private TreeNode<E> right;

  @Override
  public int getNumberOfChildren() {
    return 2;
  }

  @Override
  public TreeNode<E> getChild(int childIndex) {
    if (childIndex == 0) {
      return left;
    } else if (childIndex == 1) {
      return right;
    } else {
      throw new IllegalArgumentException("child index out of range for binary node");
    }
  }

  @Override
  public void setChild(int childIndex, TreeNode<E> child) {
    if (childIndex == 0) {
      left = child;
    } else if (childIndex == 1) {
      right = child;
    } else {
      throw new IllegalArgumentException("child index out of range for binary node");
    }
  }
}
