package solutions.questionf763;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import solutions.question1171.GraphNode;

public class Demo {

  private static int nextId = 0;

  private static final int BIG_TREE_DEPTH = 4;
  private static final int SMALL_TREE_DEPTH = 3;

  public static void main(String[] args) {

    List<GraphNode<Integer>> bigTreeNodes = buildBinaryTree(BIG_TREE_DEPTH);
    List<GraphNode<Integer>> smallTreeNodes = buildBinaryTree(SMALL_TREE_DEPTH);

    Set<GraphNode<Integer>> heapMemory = new HashSet<>();
    heapMemory.addAll(bigTreeNodes);
    heapMemory.addAll(smallTreeNodes);

    Set<GraphNode<Integer>> activeNodes = new HashSet<>();
    activeNodes.add(bigTreeNodes.get(0));

    System.out.println("Before garbage collection:");
    displayMemory(heapMemory, activeNodes);

    new GarbageCollector().collectGarbage(heapMemory, activeNodes);

    System.out.println("\nAfter garbage collection:");
    displayMemory(heapMemory, activeNodes);
  }

  private static void displayMemory(
      Set<GraphNode<Integer>> heapMemory, Set<GraphNode<Integer>> activeNodes) {
    System.out.println("  Heap contents:");
    for (GraphNode<Integer> obj : heapMemory) {
      System.out.print("    " + obj.getKey() + " -> (");
      for (int i = 0; i < obj.getNumberOfSuccessors(); i++) {
        System.out.print(obj.getSuccessor(i).getKey());
        if (i < obj.getNumberOfSuccessors() - 1) {
          System.out.print(", ");
        }
      }
      System.out.print(")");
      if (activeNodes.contains(obj)) {
        System.out.print(" (ACTIVE)");
      }
      System.out.println();
    }
  }

  private static List<GraphNode<Integer>> buildBinaryTree(int depth) {

    List<GraphNode<Integer>> result = new ArrayList<>();

    result.add(new GraphNode<>());
    result.get(0).setKey(getNextId());

    if (depth > 1) {
      List<GraphNode<Integer>> leftSubtree = buildBinaryTree(depth - 1);
      List<GraphNode<Integer>> rightSubtree = buildBinaryTree(depth - 1);
      result.get(0).addSuccessor(leftSubtree.get(0));
      result.get(0).addSuccessor(rightSubtree.get(0));
      result.addAll(leftSubtree);
      result.addAll(rightSubtree);
    }

    return result;
  }

  private static int getNextId() {
    int result = nextId;
    nextId++;
    return result;
  }
}
