package solutions.question0378;

public class SurnameComparator implements PersonComparator {
  @Override
  public int compareTo(Person p1, Person p2) {
    return p1.getSurname().compareTo(p2.getSurname());
  }
}
