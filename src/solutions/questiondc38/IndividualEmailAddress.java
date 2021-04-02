package solutions.questiondc38;

import java.util.HashSet;
import java.util.Set;

public class IndividualEmailAddress extends EmailAddress {

  public IndividualEmailAddress(String identifier) {
    super(identifier);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> targets = new HashSet<>();
    targets.add(this);
    return targets;
  }
}
