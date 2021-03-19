package solutions.question68e6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  static List<Integer> concatenate(List<List<Integer>> lists) {
    return lists.stream()
        .reduce(
            List.of(),
            (first, second) -> {
              List<Integer> result = new ArrayList<>(first);
              result.addAll(second);
              return result;
            });
  }

  static int findMin(List<Integer> numbers) {
    return numbers.stream()
        .reduce(Integer.MAX_VALUE, Math::min);
  }

  static int findMinOrZero(List<Integer> numbers) {
    return numbers.stream()
        .reduce(Math::min)
        .orElse(0);
  }

  static int findMax(List<Integer> numbers) {
    // Using lambdas for the sake of practice
    return numbers.stream()
        .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
  }

  static int findMaxOrZero(List<Integer> numbers) {
    // Using lambdas for the sake of practice
    return numbers.stream()
        .reduce((a, b) -> Math.max(a, b))
        .orElse(0);
  }

  static int findMinOfMaxes(List<List<Integer>> listOfLists) {
    return findMin(listOfLists.stream()
        .map(Example::findMax)
        .collect(Collectors.toList()));
  }

  public static void main(String[] args) {
    final List<Integer> list1 = List.of(1, 2, 3, 4, 5, 9);
    final List<Integer> list2 = List.of(1, 10, 100, 1000, 10000);
    final List<Integer> list3 = List.of(6, 7, 8);
    final List<List<Integer>> listOfLists = List.of(list1, list2, list3);

    final List<Integer> allIntegers = concatenate(listOfLists);
    assert allIntegers.equals(List.of(1, 2, 3, 4, 5, 9, 1, 10, 100, 1000, 10000, 6, 7, 8));
    final int maxList1 = findMax(list1);
    assert maxList1 == 9;
    final int minList2 = findMin(list2);
    assert minList2 == 1;
    final int maxEmpty = findMax(Collections.emptyList());
    assert maxEmpty == Integer.MIN_VALUE;
    final int minEmpty = findMin(Collections.emptyList());
    assert minEmpty == Integer.MAX_VALUE;
    final int maxOrZeroEmpty = findMaxOrZero(Collections.emptyList());
    assert maxOrZeroEmpty == 0;
    final int minOrZeroEmpty = findMinOrZero(Collections.emptyList());
    assert minOrZeroEmpty == 0;
    final int minOfMaxes = findMinOfMaxes(listOfLists);
    assert minOfMaxes == 8;
    final int minOfMaxesEmpty = findMinOfMaxes(Collections.emptyList());
    assert minOfMaxesEmpty == Integer.MAX_VALUE;
    final int minOfMaxesListOfEmptyLists =
        findMinOfMaxes(List.of(Collections.emptyList(), Collections.emptyList()));
    assert minOfMaxesListOfEmptyLists == Integer.MIN_VALUE;
  }
}
