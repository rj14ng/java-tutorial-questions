package solutions.question0c21;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PropertyCollection {

  private final Set<Property> properties;

  public PropertyCollection() {
    this.properties = new HashSet<>();
  }

  /** Adds a property to the collection. */
  public void addProperty(Property p) {
    properties.add(p);
  }

  /** Returns the set of all houses in the collection. */
  public Set<House> getHouses() {
    return properties.stream()
        .filter(p -> p instanceof House)
        .map(p -> (House) p)
        .collect(Collectors.toSet());
  }

  /** Returns the set of all bungalows in the collection. */
  public Set<Bungalow> getBungalows() {
    return properties.stream()
        .filter(p -> p instanceof Bungalow)
        .map(p -> (Bungalow) p)
        .collect(Collectors.toSet());
  }

  /** Returns the set of all flats in the collection. */
  public Set<Flat> getFlats() {
    return properties.stream()
        .filter(p -> p instanceof Flat)
        .map(p -> (Flat) p)
        .collect(Collectors.toSet());
  }

  /** Returns the set of all maisonettes in the collection. */
  public Set<Maisonette> getMaisonettes() {
    return properties.stream()
        .filter(p -> p instanceof Maisonette)
        .map(p -> (Maisonette) p)
        .collect(Collectors.toSet());
  }

  /** Returns the set of all terraced houses in the collection. */
  public Set<TerracedHouse> getTerracedHouses() {
    return properties.stream()
        .filter(p -> p instanceof TerracedHouse)
        .map(p -> (TerracedHouse) p)
        .collect(Collectors.toSet());
  }
}
