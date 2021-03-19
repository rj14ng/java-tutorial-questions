package solutions.questiondd4c;

public class AlarmClock extends Clock {

  private final int alarmTime; // represented by seconds since midnight
  private boolean alarmSounding = false;

  public AlarmClock(int secondsSinceMidnight, int alarmTime) {
    super(secondsSinceMidnight);
    this.alarmTime = alarmTime;
  }

  public AlarmClock(int hh, int mm, int ss, int hhAlarm, int mmAlarm, int ssAlarm) {
    super(hh, mm, ss);
    this.alarmTime = hhmmssToSecsSinceMidnight(hhAlarm, mmAlarm, ssAlarm);
  }

  @Override
  public void tick() {
    super.tick();

    if (alarmSounding) {
      int oneMinAgo = time - SECS_IN_MIN;
      if (oneMinAgo < 0) {
        oneMinAgo += SECS_IN_DAY;
      }

      if (oneMinAgo == alarmTime) {
        alarmSounding = false;
      }
    } else if (time == alarmTime) {
      alarmSounding = true;
    }
  }

  @Override
  public String toString() {
    return super.toString() + (alarmSounding ? " " + beep() : "");
  }

  protected String beep() {
    return "BEEP!";
  }
}
