package solutions.questionaa68;

import java.util.Objects;

public class Colour {

  private final int red;
  private final int green;
  private final int blue;

  public Colour(int red, int green, int blue) {

    if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
      throw new IllegalArgumentException("Invalid colour");
    }

    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  @Override
  public String toString() {
    return "rgb(" + red + ", " + green + ", " + blue + ")";
  }

  @Override
  public int hashCode() {
    return Objects.hash(red, green, blue);
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Colour)) {
      return false;
    }
    Colour c = (Colour) other;
    return red == c.red && green == c.green && blue == c.blue;
  }
}
