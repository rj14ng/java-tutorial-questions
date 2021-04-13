package solutions.questiona22c;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class EmailAddress {

  private static final Set<String> usedIdentifiers = new HashSet<>();

  private final String identifier;

  protected EmailAddress(String identifier) throws DuplicateEmailAddressException {
    if (usedIdentifiers.contains(identifier)) {
      throw new DuplicateEmailAddressException(identifier);
    }
    usedIdentifiers.add(identifier);
    this.identifier = identifier;
  }

  public abstract Set<EmailAddress> getTargets();

  @Override
  public String toString() {
    return identifier;
  }

  @Override
  public boolean equals(Object that) {
    if (!(that instanceof EmailAddress)) {
      return false;
    }
    EmailAddress thatEmailAddress = (EmailAddress) that;
    return Objects.equals(identifier, thatEmailAddress.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier);
  }
}
