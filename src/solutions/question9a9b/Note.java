package solutions.question9a9b;

public class Note extends TuneElement {

  private final NoteName name;
  private final int octave;

  public Note(NoteName name, int octave, NoteValue value) {
    super(value);
    this.name = name;
    this.octave = octave;
  }

  public NoteName getName() {
    return name;
  }

  public int getOctave() {
    return octave;
  }

  @Override
  public String toString() {
    return name.toString() + octave + super.toString();
  }
}
