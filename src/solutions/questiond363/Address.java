package solutions.questiond363;

public class Address {

  private final int houseNumber;
  private final String address1;
  private final String address2;
  private final String postCode;

  public Address(int houseNumber, String address1, String address2, String postCode) {
    this.houseNumber = houseNumber;
    this.address1 = address1;
    this.address2 = address2;
    this.postCode = postCode;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Address)) {
      return false;
    }

    Address otherAddress = (Address) obj;
    return houseNumber == otherAddress.houseNumber
        && address1.equals(otherAddress.address1)
        && address2.equals(otherAddress.address2)
        && postCode.equals(otherAddress.postCode);
  }

  @Override
  public String toString() {
    return houseNumber + " " + address1 + ", " + address2 + ", " + postCode;
  }
}
