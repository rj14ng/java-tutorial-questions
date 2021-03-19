package solutions.question710c;

import java.util.Objects;

public class ColouredPoint extends Point {

  private final Colour colour;

  public ColouredPoint(double x, double y, double z, Colour colour) {
    super(x, y, z);
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "{" + super.toString() + ", " + colour + "}";
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), colour);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof ColouredPoint)) {
      return false;
    }
    ColouredPoint p = (ColouredPoint) other;
    return super.equals(other) && colour.equals(p.colour);
  }
}
