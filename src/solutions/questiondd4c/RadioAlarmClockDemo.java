package solutions.questiondd4c;

public class RadioAlarmClockDemo {

  public static void main(String[] args) throws InterruptedException {

    Clock radioAlarmClock1 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.NONE);
    Clock radioAlarmClock2 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.RADIO4);
    Clock radioAlarmClock3 = new RadioAlarmClock(23, 59, 50, 23, 59, 58, RadioStation.FIVELIVE);

    while (true) {

      System.out.println(
          "Clocks say: " + radioAlarmClock1 + " - " + radioAlarmClock2 + " - " + radioAlarmClock3);

      radioAlarmClock1.tick();
      radioAlarmClock2.tick();
      radioAlarmClock3.tick();

      Thread.sleep(1000);
    }
  }
}
