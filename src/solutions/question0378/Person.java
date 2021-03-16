package solutions.question0378;

public class Person {

  private final String surname;
  private final String forename;
  private final String telephone;

  public Person(String surname, String forename, String telephone) {
    this.surname = surname;
    this.forename = forename;
    this.telephone = telephone;
  }

  public String getSurname() {
    return surname;
  }

  public String getForename() {
    return forename;
  }

  public String getTelephone() {
    return telephone;
  }

  @Override
  public String toString() {
    return surname + ", " + forename + " (tel. " + telephone + ")";
  }
}
