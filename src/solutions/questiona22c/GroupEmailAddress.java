package solutions.questiona22c;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private final Set<EmailAddress> members;

  public GroupEmailAddress(String identifier) throws DuplicateEmailAddressException {
    super(identifier);
    this.members = new HashSet<>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    if (emailAddress instanceof GroupEmailAddress
        && ((GroupEmailAddress) emailAddress).reaches(this)) {
      throw new CyclicEmailGroupException();
    }
    members.add(emailAddress);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> targets = new HashSet<>();
    members.forEach(e -> targets.addAll(e.getTargets()));
    return targets;
  }

  private boolean reaches(GroupEmailAddress target) {
    if (this == target) {
      return true;
    }
    for (EmailAddress address : members) {
      if (address instanceof GroupEmailAddress && ((GroupEmailAddress) address).reaches(target)) {
        return true;
      }
    }
    return false;
  }
}
