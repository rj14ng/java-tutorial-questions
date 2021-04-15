package solutions.question1171;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphNode<E> implements Cloneable {

  private E key;
  private List<GraphNode<E>> successors;

  public GraphNode() {
    successors = new ArrayList<>();
  }

  public int getNumberOfSuccessors() {
    return successors.size();
  }

  public GraphNode<E> getSuccessor(int successorIndex) {
    return successors.get(successorIndex);
  }

  public void addSuccessor(GraphNode<E> successor) {
    successors.add(successor);
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  @Override
  public GraphNode<E> clone() {

    Map<GraphNode<E>, GraphNode<E>> oldToNew = new HashMap<>();

    Deque<GraphNode<E>> stack = new ArrayDeque<>();

    // Depth-first search of graph rooted at current node
    stack.push(this);
    while (!stack.isEmpty()) {
      GraphNode<E> oldNode = stack.pop();
      if (!oldToNew.containsKey(oldNode)) {
        GraphNode<E> newNode = oldNode.internalClone();
        oldToNew.put(oldNode, newNode);
        oldNode.successors.forEach(stack::push);
      }
    }

    // Set up successor fields of new nodes
    for (GraphNode<E> oldNode : oldToNew.keySet()) {
      oldNode.successors.forEach(
          successor -> oldToNew.get(oldNode).addSuccessor(oldToNew.get(successor)));
    }

    return oldToNew.get(this);
  }

  @SuppressWarnings("unchecked")
  private GraphNode<E> internalClone() {
    try {
      GraphNode<E> clone = (GraphNode<E>) super.clone();
      clone.successors = new ArrayList<>();
      return clone;
    } catch (CloneNotSupportedException e) {
      // Should never happen, since GraphNode<E> implements Cloneable
      assert false;
      return null;
    }
  }
}
