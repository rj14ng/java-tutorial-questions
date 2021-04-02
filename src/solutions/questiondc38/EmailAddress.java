package solutions.questiondc38;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class EmailAddress {

  private final String identifier;

  protected EmailAddress(String identifier) {
    this.identifier = identifier;
  }

  public final Set<EmailAddress> getTargets() {
    return getTargets(new HashSet<>());
  }

  protected abstract Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen);

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
