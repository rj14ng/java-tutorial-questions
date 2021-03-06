package solutions.question0f05;

public class ColourDemo {
  public static void main(String[] args) {
    Colour violet = new Colour(238, 130, 238);
    System.out.println("Violet: " + violet);

    try {
      Colour invalidColour = new Colour(-1, 300, 50);
    } catch (IllegalArgumentException e) {
      System.out.println("Error caught: " + e.getMessage());
    }
  }
}
