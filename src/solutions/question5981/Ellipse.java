package solutions.question5981;

public class Ellipse extends Shape {

  private double semiMajorAxis;
  private double semiMinorAxis;

  public Ellipse(double semiMajorAxis, double semiMinorAxis) {
    this.semiMajorAxis = semiMajorAxis;
    this.semiMinorAxis = semiMinorAxis;
  }

  public double getSemiMajorAxis() {
    return semiMajorAxis;
  }

  public double getSemiMinorAxis() {
    return semiMinorAxis;
  }

  public void setSemiMajorAxis(double semiMajorAxis) {
    this.semiMajorAxis = semiMajorAxis;
  }

  public void setSemiMinorAxis(double semiMinorAxis) {
    this.semiMinorAxis = semiMinorAxis;
  }

  @Override
  public boolean isCircle() {
    return semiMajorAxis == semiMinorAxis;
  }

  @Override
  public boolean isSquare() {
    return false;
  }

  @Override
  public String toString() {
    if (isCircle()) {
      return "Circle(" + semiMajorAxis + ")";
    } else {
      return "Ellipse(" + semiMajorAxis + "," + semiMinorAxis + ")";
    }
  }
}
