package solutions.questionb33f;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class KnownWordsStringInspector implements StringInspector {

  private final Set<String> errorWords;
  private final Set<String> verboseWords;

  public KnownWordsStringInspector(Set<String> errorWords, Set<String> verboseWords) {
    this.errorWords = errorWords;
    this.verboseWords = verboseWords;
  }

  @Override
  public Optional<ImmutablePair<LogLevel, String>> inspect(String input) {

    List<String> observedErrorWords = new ArrayList<>();
    List<String> observedVerboseWords = new ArrayList<>();

    for (String s : input.split(" ")) {
      if (errorWords.contains(s)) {
        observedErrorWords.add(s);
      } else if (verboseWords.contains(s)) {
        observedVerboseWords.add(s);
      }
    }

    if (observedErrorWords.isEmpty() && observedVerboseWords.isEmpty()) {
      return Optional.empty();
    }

    return Optional.of(
        new ImmutablePair<>(
            !observedErrorWords.isEmpty() ? LogLevel.ERROR : LogLevel.VERBOSE,
            buildMessage(observedErrorWords, observedVerboseWords)));
  }

  private static String buildMessage(
      List<String> observedErrorWords, List<String> observedVerboseWords) {

    StringBuilder sb = new StringBuilder();

    if (!observedErrorWords.isEmpty()) {
      sb.append("Observed the following error words: ");
      sb.append(observedErrorWords);
      sb.append("\n");
    }

    if (!observedVerboseWords.isEmpty()) {
      sb.append("Observed the following words of note: ");
      sb.append(observedVerboseWords);
      sb.append("\n");
    }

    return sb.toString();
  }
}
