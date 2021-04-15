package solutions.questionf763;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import solutions.question1171.GraphNode;

public class GarbageCollector {

  public <E> void collectGarbage(Set<GraphNode<E>> heapMemory, Set<GraphNode<E>> activeNodes) {

    Set<GraphNode<E>> reachable = new HashSet<>();

    Deque<GraphNode<E>> stack = new ArrayDeque<>();
    activeNodes.forEach(stack::push);

    while (!stack.isEmpty()) {
      GraphNode<E> node = stack.pop();
      if (!reachable.contains(node)) {
        reachable.add(node);
        for (int i = 0; i < node.getNumberOfSuccessors(); i++) {
          stack.push(node.getSuccessor(i));
        }
      }
    }

    heapMemory.retainAll(reachable);
  }
}
