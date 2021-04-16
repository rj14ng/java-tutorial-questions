package solutions.question9a9b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PhysicalTune extends AbstractTune {

  private final List<TuneElement> contents;

  public PhysicalTune() {
    this.contents = new ArrayList<>();
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    contents.add(tuneElement);
  }

  @Override
  public Iterator<TuneElement> iterator() {
    return contents.iterator();
  }
}
