package solutions.question0f05;

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
}
