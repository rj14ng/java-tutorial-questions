package solutions.question5981;

import java.util.Set;
import java.util.stream.Collectors;

public class ShapeDemo {

  public static void main(String[] args) {

    final Shape s1 = new Rectangle(2, 2);
    final Shape s2 = new Ellipse(2, 3);
    final Shape s3 = new Ellipse(3, 5);
    final Shape s4 = new Rectangle(3, 6);
    final Shape s5 = new Rectangle(10, 10);
    final Shape s6 = new Ellipse(3, 3);

    final Set<Shape> shapes = Set.of(s1, s2, s3, s4, s5, s6);

    System.out.println("Entire set: " + shapes);
    System.out.println(
        "Squares in set: " + shapes.stream().filter(Shape::isSquare).collect(Collectors.toSet()));
    System.out.println(
        "Circles in set: " + shapes.stream().filter(Shape::isCircle).collect(Collectors.toSet()));
  }
}
