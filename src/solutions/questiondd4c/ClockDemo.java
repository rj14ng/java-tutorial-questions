package solutions.questiondd4c;

public class ClockDemo {

  public static void main(String[] args) throws InterruptedException {

    Clock clock1 = new Clock(86395);
    Clock clock2 = new Clock(23, 59, 55);

    while (true) {

      System.out.println("Clock 1 shows: " + clock1 + "\tClock 2 shows: " + clock2);

      clock1.tick();
      clock2.tick();

      Thread.sleep(1000);
    }
  }
}
