package solutions.questionb33f;

import java.util.Optional;

@FunctionalInterface
public interface StringInspector {

  Optional<ImmutablePair<LogLevel, String>> inspect(String input);
}
