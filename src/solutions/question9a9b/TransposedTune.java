package solutions.question9a9b;

import java.util.Iterator;

public class TransposedTune extends AbstractTune {

  private static final int SEMITONES_IN_ONE_OCTAVE = NoteName.values().length;

  private final Tune originalTune;
  private final int interval;

  public TransposedTune(Tune originalTune, int interval) {
    this.originalTune = originalTune;
    this.interval = interval;
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    if (tuneElement instanceof Note) {
      originalTune.addTuneElement(
          noteFromAbsolutePitch(
              noteToAbsolutePitch((Note) tuneElement) - interval, tuneElement.getValue()));
    } else { // tuneElement instanceof Rest
      originalTune.addTuneElement(tuneElement);
    }
  }

  @Override
  public Iterator<TuneElement> iterator() {

    return new Iterator<>() {

      private final Iterator<TuneElement> originalTuneIterator = originalTune.iterator();

      @Override
      public boolean hasNext() {
        return originalTuneIterator.hasNext();
      }

      @Override
      public TuneElement next() {

        TuneElement nextOriginalTuneElement = originalTuneIterator.next();

        if (nextOriginalTuneElement instanceof Note) {
          return noteFromAbsolutePitch(
              noteToAbsolutePitch((Note) nextOriginalTuneElement) + interval,
              nextOriginalTuneElement.getValue());
        } else { // tuneElement instanceof Rest
          return nextOriginalTuneElement;
        }
      }

      @Override
      public void remove() {
        originalTuneIterator.remove();
      }
    };
  }

  /**
   * Uses the octave and note name components of a note to turn the note into an absolute pitch
   * value.
   */
  private static int noteToAbsolutePitch(Note note) {
    return SEMITONES_IN_ONE_OCTAVE * note.getOctave() + note.getName().ordinal();
  }

  /**
   * From an absolute pitch value, works out the corresponding octave and note name, and returns a
   * Note comprised of these and the given note value.
   */
  private static Note noteFromAbsolutePitch(int pitch, NoteValue value) {

    NoteName newNoteName = NoteName.values()[pitch % SEMITONES_IN_ONE_OCTAVE];
    int newOctave = pitch / SEMITONES_IN_ONE_OCTAVE;

    return new Note(newNoteName, newOctave, value);
  }
}
