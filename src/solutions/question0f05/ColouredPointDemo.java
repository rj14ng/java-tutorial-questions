package solutions.question0f05;

public class ColouredPointDemo {
  public static void main(String[] args) {
    Colour aquamarine = new Colour(127, 255, 212);
    Point colouredPoint = new ColouredPoint(3, 4, 5, aquamarine);
    Point point = new Point(3, 4, 5);

    System.out.println("A coloured point: " + colouredPoint);
    System.out.println("Magnitude: " + colouredPoint.magnitude());

    assert colouredPoint.magnitude() == point.magnitude();
  }
}
