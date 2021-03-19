package solutions.questionaa68;

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
    if (!canEqual(other)) {
      return false;
    }
    ColouredPoint p = (ColouredPoint) other;
    return p.canEqual(this) && super.equals(other) && colour.equals(p.colour);
  }

  @Override
  public boolean canEqual(Object other) {
    return other instanceof ColouredPoint;
  }
}
