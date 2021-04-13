package solutions.question5566;

public class GenericStackFailedPushError extends Error {

  private final int maxStackSize;

  public GenericStackFailedPushError(int maxStackSize) {
    this.maxStackSize = maxStackSize;
  }

  @Override
  public String toString() {
    return "Push attempt failed: stack limit of " + maxStackSize + " has been reached";
  }
}
