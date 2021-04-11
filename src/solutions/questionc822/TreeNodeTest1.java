package solutions.questionc822;

public class TreeNodeTest1 {

  public static void main(String[] args) {

    TreeNode<String> n1 = new TreeNode<>(1);
    n1.setKey("A");
    TreeNode<String> n2 = new TreeNode<>(1);
    n2.setKey("B");
    n1.setChild(0, n2);
    n2.setChild(0, n1);

    // Would cause an infinite loop, since nodes form a cyclic graph
    // This is now prevented by the precondition assertions in TreeNode.setChild
    TreeNode<String> clone = n1.clone();
  }
}
