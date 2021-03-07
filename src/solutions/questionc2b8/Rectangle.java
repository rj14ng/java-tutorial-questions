package solutions.questionc2b8;

public class Rectangle {

  private final Point topLeft;
  private final int width;
  private final int height;

  public Rectangle(Point topLeft, int width, int height) {
    this.topLeft = topLeft;
    this.width = width;
    this.height = height;
  }

  public Point getTopLeft() {
    return topLeft;
  }

  // DrawingEngine.getBottomRight() refactored and moved here
  public Point getBottomRight() {
    return new Point(getTopLeft().getCoordX() + getWidth(), getTopLeft().getCoordY() + getHeight());
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  // DrawingEngine.area() moved here
  public int area() {
    return getWidth() * getHeight();
  }

  // DrawingEngine.contains() refactored and moved here
  public boolean contains(Rectangle other) {
    return getTopLeft().getCoordX() <= other.getTopLeft().getCoordX()
        && getTopLeft().getCoordY() <= other.getTopLeft().getCoordY()
        && getBottomRight().getCoordX() >= other.getBottomRight().getCoordX()
        && getBottomRight().getCoordY() >= other.getBottomRight().getCoordY();
  }

  // DrawingEngine.rectangleToString() moved here
  @Override
  public String toString() {
    return "(top-left = "
        + getTopLeft()
        + ", width = "
        + getWidth()
        + ", height = "
        + getHeight()
        + ")";
  }
}
