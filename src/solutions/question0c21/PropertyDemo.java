package solutions.question0c21;

// Makes Bungalow an interface to solve multiple inheritance issues.
// Utilises instanceof to test actual types of properties.
public class PropertyDemo {

  public static void main(String[] args) {

    final PropertyCollection properties = new PropertyCollection();

    for (int i = 0; i < 1000; i++) {
      properties.addProperty(new SemiDetachedHouse());
      properties.addProperty(new TerracedHouse());
    }

    for (int i = 0; i < 100; i++) {
      properties.addProperty(new DetachedHouse());
      properties.addProperty(new SemiDetachedBungalow());
      properties.addProperty(new Flat());
    }

    for (int i = 0; i < 20; i++) {
      properties.addProperty(new Maisonette());
      properties.addProperty(new DetachedBungalow());
      properties.addProperty(new TerracedBungalow());
    }

    System.out.println("Number of houses: " + properties.getHouses().size());
    assert properties.getHouses().size() == 2240;

    System.out.println("Number of bungalows: " + properties.getBungalows().size());
    assert properties.getBungalows().size() == 140;

    System.out.println("Number of flats: " + properties.getFlats().size());
    assert properties.getFlats().size() == 120;

    System.out.println("Number of maisonettes: " + properties.getMaisonettes().size());
    assert properties.getMaisonettes().size() == 20;

    System.out.println("Number of terraced houses: " + properties.getTerracedHouses().size());
    assert properties.getTerracedHouses().size() == 1020;
  }
}
