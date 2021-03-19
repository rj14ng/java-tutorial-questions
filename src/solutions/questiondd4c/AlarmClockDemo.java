package solutions.questiondd4c;

public class AlarmClockDemo {

  public static void main(String[] args) throws InterruptedException {

    Clock alarmClock = new AlarmClock(23, 59, 50, 23, 59, 58);

    while (true) {

      System.out.println("Clock says: " + alarmClock);

      alarmClock.tick();

      Thread.sleep(1000);
    }
  }
}
