package solutions.question0378;

public class TwoTieredComparator implements PersonComparator {

  private final PersonComparator first;
  private final PersonComparator second;

  public TwoTieredComparator(PersonComparator first, PersonComparator second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public int compareTo(Person p1, Person p2) {
    int firstResult = first.compareTo(p1, p2);
    if (firstResult == 0) {
      return second.compareTo(p1, p2);
    }
    return firstResult;
  }
}
