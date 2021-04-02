package solutions.questiondc38;

import java.util.HashSet;
import java.util.Set;

public class GroupEmailAddress extends EmailAddress {

  private final Set<EmailAddress> members;

  public GroupEmailAddress(String identifier) {
    super(identifier);
    this.members = new HashSet<>();
  }

  public void addEmailAddress(EmailAddress emailAddress) {
    members.add(emailAddress);
  }

  @Override
  public Set<EmailAddress> getTargets() {
    Set<EmailAddress> targets = new HashSet<>();
    members.forEach(e -> targets.addAll(e.getTargets()));
    return targets;
  }
}
