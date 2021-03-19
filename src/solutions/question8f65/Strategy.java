package solutions.question8f65;

public enum Strategy {
  AGGRESSIVE,
  DEFENSIVE,
  AVERAGE;

  @Override
  public String toString() {
    return switch (this) {
      case AGGRESSIVE -> "Aggressive";
      case DEFENSIVE -> "Defensive";
      case AVERAGE -> "Average";
    };
  }
}
