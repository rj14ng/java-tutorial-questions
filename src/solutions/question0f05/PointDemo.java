package solutions.question0f05;

public class PointDemo {
  public static void main(String[] args) {
    Point origin = Point.origin();
    Point point1 = new Point(3, 4, 5);
    Point point2 = new Point(4, 5, 3);

    System.out.println("The origin is " + origin);

    System.out.println("Magnitude of " + point1 + " is " + point1.magnitude());
    System.out.println("Magnitude of " + point2 + " is " + point2.magnitude());

    assert point1.magnitude() == point2.magnitude();

    System.out.println(
        "Distance between " + point1 + " and " + point2 + " is " + point1.distanceFrom(point2));
  }
}
