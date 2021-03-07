package solutions.questiond363;

public class NINumber {

  private final String nationalInsuranceNumber;

  public NINumber(String nationalInsuranceNumber) {
    this.nationalInsuranceNumber = nationalInsuranceNumber;
  }

  @Override
  public String toString() {
    return nationalInsuranceNumber;
  }
}
