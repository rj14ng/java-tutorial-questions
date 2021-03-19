package solutions.questionaa68;

public class PointEqualityDemo {

  private static boolean checkEquality(Point p1, Point p2) {

    final boolean isEqual = p1.equals(p2);

    System.out.println(
        "Points " + p1 + " and " + p2 + " are " + ((isEqual ? "" : "not ") + "equal"));

    return isEqual;
  }

  public static void main(String[] args) {

    final Point p1 = new Point(2, 3, 4);
    final Point p2 = new Point(2, 3, 4);
    final Point p3 = new Point(1, 2, 3);

    final Point cp1 = new ColouredPoint(1, 2, 3, new Colour(255, 0, 0));
    final Point cp2 = new ColouredPoint(1, 2, 3, new Colour(0, 0, 255));
    final Point cp3 = new ColouredPoint(1, 2, 3, new Colour(0, 0, 255));

    final Point p = new Point(3, 4, 5);
    final Point cp = new ColouredPoint(3, 4, 5, new Colour(0, 255, 0));

    assert checkEquality(p1, p2);
    assert !checkEquality(p2, p3);

    assert !checkEquality(cp1, cp2);
    assert checkEquality(cp2, cp3);

    // Our equals relation should now be symmetric in the presence of subclasses
    // We are guaranteed to get false if we compare a Point with a ColouredPoint
    assert !checkEquality(p, cp);
    assert !checkEquality(cp, p);
  }
}
