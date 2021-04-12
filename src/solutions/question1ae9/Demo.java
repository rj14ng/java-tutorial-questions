package solutions.question1ae9;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    List<Point> originalPointList = new ArrayList<>();
    List<Point> efficientPointList = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      originalPointList.add(new OriginalPoint(0, 0, 0));
      efficientPointList.add(EfficientPoint.makePoint(0, 0, 0));
    }

    System.out.print("Original point list: ");
    checkAllSame(originalPointList);

    System.out.print("Efficient point list: ");
    checkAllSame(efficientPointList);
  }

  private static void checkAllSame(List<Point> pointList) {
    if (allSame(pointList)) {
      System.out.println("The points are all the same object reference.");
    } else {
      System.out.println("Some of the points are different references.");
    }
  }

  private static boolean allSame(List<Point> pointList) {
    for (int i = 1; i < pointList.size(); i++) {
      if (pointList.get(0) != pointList.get(i)) {
        return false;
      }
    }
    return true;
  }
}
