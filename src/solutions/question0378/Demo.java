package solutions.question0378;

import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static Person findMin(Set<Person> people, PersonComparator comparator) {
    Person min = null;
    for (Person person : people) {
      if (min == null || comparator.compareTo(person, min) < 0) {
        min = person;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    Set<Person> people = new HashSet<>();
    people.add(new Person("Briggs", "Alan", "12345"));
    people.add(new Person("Simmonds", "Julia", "12354"));
    people.add(new Person("Simmonds", "Peter", "14253"));
    people.add(new Person("Fisher", "Toby", "61432"));
    people.add(new Person("Atkinson", "Robert", "25142"));
    people.add(new Person("Atkinson", "Martin", "25142"));
    people.add(new Person("Atkinson", "Martin", "00000"));

    System.out.println("Smallest by surname: " + findMin(people, new SurnameComparator()));
    System.out.println("Smallest by forename: " + findMin(people, new ForenameComparator()));
    System.out.println(
        "Smallest by telephone: " + findMin(people, new TelephoneNumberComparator()));
    System.out.println(
        "Smallest by surname then forename: "
            + findMin(
                people,
                new TwoTieredComparator(new SurnameComparator(), new ForenameComparator())));
    System.out.println(
        "Smallest by surname, then forename, then telephone: "
            + findMin(
                people,
                new TwoTieredComparator(
                    new SurnameComparator(),
                    new TwoTieredComparator(
                        new ForenameComparator(), new TelephoneNumberComparator()))));
  }
}
