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
  public Set<EmailAddress> getTargets(Set<EmailAddress> alreadySeen) {

    Set<EmailAddress> targets = new HashSet<>();

    if (alreadySeen.contains(this)) {
      return targets;
    }
    alreadySeen.add(this);

    members.forEach(e -> targets.addAll(e.getTargets(alreadySeen)));

    return targets;
  }
}
