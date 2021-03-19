package solutions.questiondd4c;

public class Clock {

  protected static final int SECS_IN_MIN = 60;
  protected static final int MINS_IN_HR = 60;
  protected static final int HRS_IN_DAY = 24;
  protected static final int SECS_IN_HR = SECS_IN_MIN * MINS_IN_HR;
  protected static final int SECS_IN_DAY = SECS_IN_HR * HRS_IN_DAY;

  protected int time; // represented by seconds since midnight
  private final boolean displayInSeconds;

  private Clock(int secondsSinceMidnight, boolean displayInSeconds) {
    this.time = secondsSinceMidnight;
    this.displayInSeconds = displayInSeconds;
  }

  public Clock(int secondsSinceMidnight) {
    this(secondsSinceMidnight, true);
  }

  public Clock(int hh, int mm, int ss) {
    this(hhmmssToSecsSinceMidnight(hh, mm, ss), false);
  }

  protected static int hhmmssToSecsSinceMidnight(int hh, int mm, int ss) {
    return SECS_IN_HR * hh + SECS_IN_MIN * mm + ss;
  }

  public void tick() {
    time = (time + 1) % SECS_IN_DAY;
  }

  @Override
  public String toString() {
    if (displayInSeconds) {
      return time + " seconds since midnight.";
    } else {
      int hour = time / SECS_IN_HR;
      int minute = (time / SECS_IN_MIN) % MINS_IN_HR;
      int seconds = time % SECS_IN_MIN;
      return addPadding(hour) + ":" + addPadding(minute) + ":" + addPadding(seconds);
    }
  }

  private String addPadding(int x) {
    return String.format("%02d", x);
  }
}
