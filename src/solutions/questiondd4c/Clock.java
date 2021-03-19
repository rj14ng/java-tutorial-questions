package solutions.questiondd4c;

public class Clock {

  private static final int SECS_IN_MIN = 60;
  private static final int MINS_IN_HR = 60;
  private static final int HRS_IN_DAY = 24;
  private static final int SECS_IN_HR = SECS_IN_MIN * MINS_IN_HR;
  private static final int SECS_IN_DAY = SECS_IN_HR * HRS_IN_DAY;

  private int time; // represented by seconds since midnight
  private final boolean displayInSeconds;

  private Clock(int secondsSinceMidnight, boolean displayInSeconds) {
    this.time = secondsSinceMidnight;
    this.displayInSeconds = displayInSeconds;
  }

  public Clock(int secondsSinceMidnight) {
    this(secondsSinceMidnight, true);
  }

  public Clock(int hour, int minute, int seconds) {
    this(SECS_IN_HR * hour + SECS_IN_MIN * minute + seconds, false);
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
