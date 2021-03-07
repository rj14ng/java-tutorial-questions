package solutions.questionbdb4;

public class House {

  // Should enforce invariant floorArea == floorSize.getWidth() * floorSize.getHeight()
  private Rectangle floorSize; // floorSize is never accessible to clients
  private int floorArea;

  public House(Rectangle floorSize) {
    setFloorSize(floorSize);
  }

  public Rectangle getFloorSize() {
    // Return a clone of floorSize
    // Prevents a client from getting the floorSize rectangle and modifying its width/height
    return new Rectangle(floorSize.getWidth(), floorSize.getHeight());
  }

  public void setFloorSize(Rectangle floorSize) {
    // Set this.floorSize to a fresh clone of floorSize
    // Prevents a client from passing in a reference to a rectangle, then modifying its width/height
    this.floorSize = new Rectangle(floorSize.getWidth(), floorSize.getHeight());
    floorArea = floorSize.getWidth() * floorSize.getHeight();
  }

  // Alternative solution is to make floorArea a computed attribute instead
  public int getFloorArea() {
    return floorArea;
  }
}
