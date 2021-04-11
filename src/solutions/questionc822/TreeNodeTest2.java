package solutions.questionc822;

public class TreeNodeTest2 {

  public static void main(String[] args) {

    TreeNode<String> n3 = new TreeNode<>(2);
    n3.setKey("C");
    TreeNode<String> n4 = new TreeNode<>(1);
    n4.setKey("D");
    TreeNode<String> n5 = new TreeNode<>(0);
    n5.setKey("E");
    n3.setChild(0, n4);
    n3.setChild(1, n5);
    n4.setChild(0, n5);

    // Cloning terminates, but the structure produced doesn't match the original
    // The original forms a DAG that is not a tree, as n5 has both n3 and n4 as a parent
    // The clone forms a tree where the n5 node is duplicated
    // This is now prevented by the precondition assertions in TreeNode.setChild
    TreeNode<String> clone = n3.clone();
  }
}
