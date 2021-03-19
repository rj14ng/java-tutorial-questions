package solutions.question710c;

import java.util.HashSet;
import java.util.Set;

public class PointHashCodeDemo {

  private static boolean checkEquality(Point p1, Point p2) {

    final boolean isEqual = p1.equals(p2);

    System.out.println(
        "Points " + p1 + " and " + p2 + " are " + ((isEqual ? "" : "not ") + "equal"));

    return isEqual;
  }

  private static boolean checkContains(Set<Point> pSet, Point p) {

    final boolean contains = pSet.contains(p);

    System.out.println(
        "The point set " + (contains ? "contains " : "does not contain ") + p);

    return contains;
  }

  public static void main(String[] args) {

    final Point p1 = new Point(1, 2, 3);
    final Point p2 = new Point(1, 2, 3);
    final Point c1 = new ColouredPoint(1, 2, 3, new Colour(255, 0, 0));
    final Point c2 = new ColouredPoint(1, 2, 3, new Colour(255, 0, 0));
    final Set<Point> pointSet = new HashSet<>();

    pointSet.add(p1);
    assert checkContains(pointSet, p1);
    assert checkEquality(p1, p2);
    assert checkContains(pointSet, p2);

    assert !checkContains(pointSet, c1);
    pointSet.add(c1);
    assert checkContains(pointSet, c1);
    assert checkContains(pointSet, c2);
  }
}
