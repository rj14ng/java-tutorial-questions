package solutions.question0f05;

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
}
