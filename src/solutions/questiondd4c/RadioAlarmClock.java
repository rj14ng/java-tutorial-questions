package solutions.questiondd4c;

public class RadioAlarmClock extends AlarmClock {

  private final RadioStation station;

  public RadioAlarmClock(int secondsSinceMidnight, int alarmTime, RadioStation station) {
    super(secondsSinceMidnight, alarmTime);
    this.station = station;
  }

  public RadioAlarmClock(
      int hh, int mm, int ss, int hhAlarm, int mmAlarm, int ssAlarm, RadioStation station) {
    super(hh, mm, ss, hhAlarm, mmAlarm, ssAlarm);
    this.station = station;
  }

  @Override
  protected String beep() {
    if (station == RadioStation.NONE) {
      return super.beep();
    } else {
      return station.tuneIn();
    }
  }
}
