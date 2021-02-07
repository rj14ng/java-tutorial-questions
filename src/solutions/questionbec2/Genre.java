package solutions.questionbec2;

/** Represents a music genre. */
public enum Genre {
  ROCK, POP, JAZZ;

  @Override
  public String toString() {
    return switch (this) {
      case ROCK -> "Rock";
      case POP -> "Pop";
      case JAZZ -> "Jazz";
    };
  }
}
