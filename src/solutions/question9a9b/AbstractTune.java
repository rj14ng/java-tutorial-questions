package solutions.question9a9b;

public abstract class AbstractTune implements Tune {

  @Override
  public Tune transpose(int interval) {
    return new TransposedTune(this, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    boolean first = true;
    for (TuneElement tuneElement : this) {
      if (first) {
        first = false;
      } else {
        sb.append(" ");
      }
      sb.append(tuneElement);
    }
    return sb.toString();
  }
}
