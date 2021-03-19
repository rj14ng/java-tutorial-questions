package solutions.questiondd4c;

public enum RadioStation {

  NONE,
  RADIO4,
  FIVELIVE;

  public String tuneIn() {
    return switch (this) {
      case NONE -> "";
      case RADIO4 -> "Blah, blah, blah";
      case FIVELIVE -> "...and it's a GOAL!!";
    };
  }
}
