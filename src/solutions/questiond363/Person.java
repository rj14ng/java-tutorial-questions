package solutions.questiond363;

public class Person {

  private final Name name;
  private final Date dob;
  private final Address address;
  private final NINumber nationalInsuranceNumber;

  public Person(Name name, Date dob, Address address, NINumber nationalInsuranceNumber) {
    this.name = name;
    this.dob = dob;
    this.address = address;
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  public boolean sameAddress(Person other) {
    return address.equals(other.address);
  }

  @Override
  public String toString() {
    return "Name: "
        + name
        + "\n"
        + "DOB: "
        + dob
        + "\n"
        + "Address: "
        + address
        + "\n"
        + "NI: "
        + nationalInsuranceNumber;
  }

  // Demo
  public static void main(String[] args) {

    Person john =
        new Person(
            new Name("John", "Doe"),
            new Date(1, 1, 1990),
            new Address(1, "London Rd", "London", "ABC 123"),
            new NINumber("AA123456C"));

    Person alice =
        new Person(
            new Name("Alice", "Jones"),
            new Date(25, 12, 1970),
            new Address(1, "London Rd", "London", "ABC 123"),
            new NINumber("BB123456D"));

    Person rocco =
        new Person(
            new Name("Rocco", "Jiang"),
            new Date(1, 4, 2002),
            new Address(180, "Queen's Gate", "South Kensington", "SW7 2AZ"),
            new NINumber("CC123456E"));

    System.out.println(john);
    System.out.println();
    System.out.println(alice);
    System.out.println();
    System.out.println(rocco);
    System.out.println();
    System.out.println("Do John and Alice have the same address? " + john.sameAddress(alice));
    System.out.println("Do Alice and Rocco have the same address? " + alice.sameAddress(rocco));
  }
}
