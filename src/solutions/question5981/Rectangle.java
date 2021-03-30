package solutions.question5981;

public class Rectangle extends Shape {

  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public boolean isCircle() {
    return false;
  }

  @Override
  public boolean isSquare() {
    return width == height;
  }

  @Override
  public String toString() {
    if (isSquare()) {
      return "Square(" + width + ")";
    } else {
      return "Rectangle(" + width + "," + height + ")";
    }
  }
}
